import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.border.Border;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;

public class DrawingFlag extends JComponent
{

	public DrawingFlag()
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

		Rectangle2D.Double flag = new Rectangle2D.Double(100, 100, 500, 250);

		Ellipse2D.Double circle = new Ellipse2D.Double();

		circle.setFrameFromCenter(flag.getCenterX(), flag.getCenterY(), flag.getCenterX() + 75,
				flag.getCenterY() + 75);

		g2D.setColor(Color.white);
		g2D.fill(flag);
		g2D.setColor(Color.black);
		g2D.draw(flag);
		g2D.setColor(Color.red);
		g2D.fill(circle);
	}
}
