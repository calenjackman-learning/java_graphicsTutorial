import javax.swing.JFrame;

public class Drawing
{
	public Drawing()
	{
		drawWindow();
	}

	public void drawWindow()
	{
		Integer w = 1200;
		Integer h = 1200;
		JFrame f = new JFrame();
		DrawingHexagon dc = new DrawingHexagon();
		f.setSize(w, h);
		f.setTitle("Hello JFrame");
		f.add(dc);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}