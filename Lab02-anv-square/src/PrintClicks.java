import se.lth.cs.pt.window.SimpleWindow;

public class PrintClicks {
	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(600, 600, "PrintClicks");
		int i = 10;
		while (i > 0) {
			w.waitForMouseClick();
			w.moveTo(w.getClickedX(), w.getClickedY());
			w.writeText("x = " + w.getClickedX() + ", " + "y = " + w.getClickedY());
			i--;
		}
	}
}
