import javax.swing.JComponent;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;

public class DrawingTranslations extends JComponent
{

	public DrawingTranslations()
	{
		super();
	}

	@Override
	protected void paintComponent(Graphics g)
	{
		Graphics2D g2D = (Graphics2D) g;

		RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);

		g2D.setRenderingHints(rh);

		Rectangle2D.Double r1 = new Rectangle2D.Double(0, 0, 100, 100);

		AffineTransform reset = g2D.getTransform();

		g2D.setColor(Color.blue);
		g2D.fill(r1);

		g2D.translate(100, 100);
		g2D.setColor(Color.black);
		g2D.fill(r1);

		g2D.translate(100, 100);
		g2D.setColor(Color.red);
		g2D.fill(r1);

		// reset the translation

		g2D.setTransform(reset);
		g2D.setColor(Color.green);
		g2D.rotate(Math.toRadians(15), r1.getCenterX(), r1.getCenterY());
		g2D.fill(r1);
	}
}
