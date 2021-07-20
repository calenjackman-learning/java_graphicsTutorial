import javax.swing.JComponent;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class DrawingClouds extends JComponent
{
	private Integer width;
	private Integer height;
	private Cloud c1;
	private Cloud c2;
	private Cloud c3;

	public DrawingClouds(Integer w, Integer h)
	{
		this.width = w;
		this.height = h;
		this.c1 = new Cloud(10, 50, 75, Color.lightGray);
		this.c2 = new Cloud(200, 75, 90, Color.blue);
		this.c3 = new Cloud(400, 60, 85, Color.darkGray);
	}


	@Override
	protected void paintComponent(Graphics g)
	{
		Graphics2D g2D = (Graphics2D) g;

		RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);

		g2D.setRenderingHints(rh);

		c1.drawCloud(g2D);
		c2.drawCloud(g2D);
		c3.drawCloud(g2D);
	}
}