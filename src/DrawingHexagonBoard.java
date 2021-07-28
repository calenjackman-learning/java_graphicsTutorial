import javax.swing.JComponent;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Path2D;
import java.awt.geom.Point2D;
import java.lang.Math;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DrawingHexagonBoard extends JComponent
{
	private List<List<List<Integer>>> nodeGroups;

	public DrawingHexagonBoard()
	{
		this.nodeGroups = genNodeGroups();
	}

	private List<List<List<Integer>>> genNodeGroups()
	{
		List<List<List<Integer>>> nodeGroups = new ArrayList<>();
		Integer startRow = 0;
		Integer startCol = 3;
		Integer tilesInRow = 3;

		Boolean afterMiddleRow = false;

		do
		{
			Integer colCursor = startCol;
			for (int i = 0; i < tilesInRow; i++)
			{
				List<List<Integer>> tile = new ArrayList<>();

				tile.add(Arrays.asList(startRow + 0, colCursor + 0));
				tile.add(Arrays.asList(startRow + 1, colCursor - 1));
				tile.add(Arrays.asList(startRow + 3, colCursor - 1));
				tile.add(Arrays.asList(startRow + 4, colCursor + 0));
				tile.add(Arrays.asList(startRow + 3, colCursor + 1));
				tile.add(Arrays.asList(startRow + 1, colCursor + 1));

				nodeGroups.add(tile);

				colCursor += 2;
			}

			startRow += 3;

			if ((startCol - 1 < 1) && (tilesInRow + 1 > 5))
			{
				afterMiddleRow = true;
			}

			if (afterMiddleRow)
			{
				startCol += 1;
				tilesInRow -= 1;
			} else
			{
				startCol -= 1;
				tilesInRow += 1;
			}
		} while (startRow <= 12);

		return nodeGroups;
	}


	@Override
	protected void paintComponent(Graphics g)
	{
		Graphics2D g2D = (Graphics2D) g;

		RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);

		g2D.setRenderingHints(rh);

		Point2D.Double startCoord = new Point2D.Double((double) 10, (double) 10);

		Double sideLength = (double) 100;

		for (List<List<Integer>> nodeGroup : this.nodeGroups)
		{
			new Hexagon(g2D, startCoord, nodeGroup, sideLength, Color.blue);
		}
	}
}