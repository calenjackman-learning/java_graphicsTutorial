import javax.swing.JFrame;

public class Drawing
{
	public Drawing()
	{
		drawWindow();
	}

	public void drawWindow()
	{
		Integer w = 1000;
		Integer h = 1000;
		JFrame f = new JFrame();
		// DrawingCanvasClouds dc = new DrawingCanvasClouds(w, h);
		// DrawingCanvasLinePaths dc = new DrawingCanvasLinePaths();
		DrawingCanvasCurvePaths dc = new DrawingCanvasCurvePaths();
		f.setSize(w, h);
		f.setTitle("Hello JFrame");
		f.add(dc);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}