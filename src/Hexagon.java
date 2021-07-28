import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Path2D;
import java.awt.geom.Point2D;
import java.util.List;

public class Hexagon
{
	private Graphics2D g2D;
	private Point2D startCoord;
	private Double sideLength, yUnits, xUnits;
	private List<List<Integer>> nodes;
	private Color color;

	public Hexagon(Graphics2D g2D, Point2D startCoord, List<List<Integer>> nodes, Double sideLength,
			Color color)
	{
		this.g2D = g2D;
		this.startCoord = startCoord;
		this.nodes = nodes;
		this.sideLength = sideLength;
		this.yUnits = this.sideLength / 2;
		this.xUnits = this.yUnits * Math.sqrt(3);
		this.color = color;

		drawHexagon(g2D);
	}

	public void drawHexagon(Graphics2D g2D)
	{
		Path2D.Double path = new Path2D.Double();
		for (int i = 0; i < nodes.size(); i++)
		{
			Double yDev = nodes.get(i).get(0) * yUnits;
			Double xDev = nodes.get(i).get(1) * xUnits;
			if (i == 0)
			{
				path.moveTo(startCoord.getX() + xDev, startCoord.getY() + yDev);
			} else
			{
				path.lineTo(startCoord.getX() + xDev, startCoord.getY() + yDev);
			}
		}
		path.closePath();
		g2D.setColor(this.color);
		g2D.fill(path);
		g2D.setColor(Color.black);
		g2D.draw(path);
	}
}
