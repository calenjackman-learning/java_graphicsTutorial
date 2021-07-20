import javax.swing.JComponent;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Path2D;

public class DrawingCanvasPaths extends JComponent
{
	public DrawingCanvasPaths()
	{}


	@Override
	protected void paintComponent(Graphics g)
	{
		Graphics2D g2D = (Graphics2D) g;

		RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);

		g2D.setRenderingHints(rh);

		Path2D.Double p = new Path2D.Double();
		p.moveTo(100, 300);
	}
}