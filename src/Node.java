import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class Node
{
	public Node()
	{
		super();
	}

	private Double x, y, size;
	private Color color;

	private Graphics2D g2D;

	public Node(Graphics2D g2D, Integer foobar, Double x, Double y, Double size)
	{
		this.g2D = g2D;
		this.x = x;
		this.y = y;
		this.size = size;

		drawNode(foobar);
	}

	private void drawNode(Integer blank)
	{
		Ellipse2D.Double e1 = new Ellipse2D.Double(this.x, this.y, this.size, this.size);

		Color nodeColor = Color.red;

		if (blank.equals(0))
		{
			nodeColor = Color.white;
		}

		g2D.setColor(nodeColor);
		g2D.fill(e1);
		g2D.setColor(Color.black);
		g2D.draw(e1);
	}
}
