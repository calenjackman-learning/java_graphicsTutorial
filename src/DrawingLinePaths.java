import javax.swing.JComponent;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Path2D;
import java.awt.geom.Point2D;

public class DrawingLinePaths extends JComponent
{
	public DrawingLinePaths()
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

		Point2D.Double startCoord = new Point2D.Double((double) 10, (double) 10);

		Double sideLength = (double) 50;

		Double yUnits = sideLength / 2;
		Double xUnits = yUnits * Math.sqrt(3);

		Path2D.Double h1 = new Path2D.Double();
		h1.moveTo(startCoord.getX() + 0 * xUnits, startCoord.getY() + 0 * yUnits);
		h1.lineTo(startCoord.getX() + 0 * xUnits, startCoord.getY() + 0 * yUnits);
		h1.lineTo(startCoord.getX() + 0 * xUnits, startCoord.getY() + 0 * yUnits);
		h1.lineTo(startCoord.getX() + 0 * xUnits, startCoord.getY() + 0 * yUnits);
		h1.lineTo(startCoord.getX() + 0 * xUnits, startCoord.getY() + 0 * yUnits);
		h1.lineTo(startCoord.getX() + 0 * xUnits, startCoord.getY() + 0 * yUnits);
		h1.closePath();
		g2D.draw(h1);
	}
}