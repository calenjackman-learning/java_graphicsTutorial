import javax.swing.JComponent;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class DrawingHouse extends JComponent {
	private House h1;
	private City c1;

	public DrawingHouse(Integer x, Integer y, Integer size, Color color) {
		this.h1 = new House(x, y, size, color);
		this.c1 = new City(x + 300, y, size, color);
	}

	@Override
	protected void paintComponent(Graphics g) {
		Graphics2D g2D = (Graphics2D) g;

		RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		g2D.setRenderingHints(rh);

		h1.drawHouse(g2D);
		c1.drawCity(g2D);
	}
}