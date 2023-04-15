import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;

public class City {
	private Double x, y, size;
	private Color color;

	public City(double x, double y, double size, Color color) {
		this.x = x;
		this.y = y;
		this.size = size;
		this.color = color;
	}

	public void drawCity(Graphics2D g2D) {
		Path2D.Double triangle = new Path2D.Double();

		triangle.moveTo(this.x + this.size * (9.0 / 16.0), this.y);
		triangle.lineTo(this.x + this.size * (3.0 / 16.0), this.y + this.size * (3.0 / 8.0));
		triangle.lineTo(this.x + this.size * (15.0 / 16.0), this.y + this.size * (3.0 / 8.0));
		triangle.closePath();

		Rectangle2D.Double base = new Rectangle.Double(this.x + this.size * (3.0 / 16.0),
				this.y + (this.size * (3.0 / 8.0)), this.size * (3.0 / 4.0), this.size * (5.0 / 8.0));

		Rectangle2D.Double leftSide = new Rectangle.Double(this.x, this.y + (this.size * (5.0 / 8.0)),
				this.size * (3.0 / 16.0), this.size * (3.0 / 8.0));

		Rectangle2D.Double rightSide = new Rectangle.Double(this.x + (this.size * (15.0 / 16.0)),
				this.y + (this.size * (3.0 / 8.0)), this.size * (1.0 / 16.0), this.size * (5.0 / 8.0));

		g2D.setColor(this.color);
		g2D.fill(triangle);
		g2D.fill(base);
		g2D.fill(leftSide);
		g2D.fill(rightSide);
	}
}
