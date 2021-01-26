import se.lth.cs.pt.window.SimpleWindow;

public class LineDrawingAdvanced {
	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(500, 500, "LineDrawing");
		w.waitForMouseClick();
		int x = w.getClickedX();
		int y = w.getClickedY();
		w.moveTo(x, y);
		while (true) {
			int firstx = w.getClickedX();
			int firsty = w.getClickedY();
			w.lineTo(firstx, firsty);
			w.waitForMouseClick();
			int secondx = w.getClickedX();
			int secondy = w.getClickedY();
			w.lineTo(secondx, secondy);
			int xDist = secondx - firstx;
			int yDist = secondy - firsty;
			w.writeText("Avstånd: " + Math.sqrt(xDist * xDist + yDist * yDist));
			// vänta tills användaren klickar på en musknapp
			// rita en linje till den punkt där användaren klickade
		}
	}
}
