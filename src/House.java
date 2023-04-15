import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;

public class House {
	private Double x, y, size;
	private Color color;

	public House(double x, double y, double size, Color color) {
		this.x = x;
		this.y = y;
		this.size = size;
		this.color = color;
	}

	public void drawHouse(Graphics2D g2D) {
		Path2D.Double triangle = new Path2D.Double();

		triangle.moveTo(this.x + this.size / 2, this.y);
		triangle.lineTo(this.x, this.y + this.size / 2);
		triangle.lineTo(this.x + this.size, this.y + this.size / 2);
		triangle.closePath();

		Rectangle2D.Double base = new Rectangle.Double(this.x, this.y + (this.size / 2), this.size, this.size / 2);

		g2D.setColor(this.color);
		g2D.fill(triangle);
		g2D.fill(base);
	}
}
