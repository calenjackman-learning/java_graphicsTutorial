import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class Cloud {
	private Double x, y, size;
	private Color color;

	public Cloud(double x, double y, double size, Color color) {
		this.x = x;
		this.y = y;
		this.size = size;
		this.color = color;
	}

	public Double sizeMod(Double val) {
		return (this.size * val);
	}

	public void drawCloud(Graphics2D g2D) {
		Ellipse2D.Double e1 = new Ellipse2D.Double(this.x, this.y, this.size, this.size);
		Ellipse2D.Double e2 = new Ellipse2D.Double(this.x + sizeMod(0.35), this.y - sizeMod(0.2), sizeMod(1.75),
				sizeMod(1.4));
		Ellipse2D.Double e3 = new Ellipse2D.Double(this.x + sizeMod(1.5), this.y + sizeMod(0.15), sizeMod(0.9),
				sizeMod(0.9));
		Ellipse2D.Double e4 = new Ellipse2D.Double(this.x + sizeMod(1.8), this.y + sizeMod(0.05), sizeMod(0.3),
				sizeMod(0.3));

		g2D.setColor(this.color);
		g2D.fill(e1);
		g2D.fill(e2);
		g2D.fill(e3);
		g2D.fill(e4);
	}
}
