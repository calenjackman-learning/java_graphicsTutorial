import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class DrawingNode extends JComponent
{

	private int[][] nodeSkel =
	{
			{0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1},
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1},
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0}};

	public DrawingNode()
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

		Integer xCoord = 0;
		Integer yCoord = 0;
		Integer size = 50;


		for (int i = 0; i < nodeSkel.length; i++)
		{
			for (int j = 0; j < nodeSkel[i].length; j++)
			{
				new Node(g2D, nodeSkel[i][j], (double) xCoord, (double) yCoord, (double) size);
				xCoord += size;
			}
			xCoord = 0;
			yCoord += size;
		}

	}
}
