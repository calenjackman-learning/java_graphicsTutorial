import javax.swing.JComponent;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Path2D;
import java.lang.Math;

public class DrawingHexagon extends JComponent
{
	public DrawingHexagon()
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

		Integer startX = 100;
		Integer startY = 100;

		Double sideLength = (double) 100;
		Double opposite = sideLength / 2;
		Double adjacent = opposite * Math.sqrt(3);

		Path2D.Double p = new Path2D.Double();
		p.moveTo(startX, startY + opposite);
		p.lineTo(startX, startY + 3 * opposite);
		p.lineTo(startX + adjacent, startY + 4 * opposite);
		p.lineTo(startX + 2 * adjacent, startY + 3 * opposite);
		p.lineTo(startX + 2 * adjacent, startY + opposite);
		p.lineTo(startX + adjacent, startY);
		p.closePath();
		g2D.draw(p);
	}
}