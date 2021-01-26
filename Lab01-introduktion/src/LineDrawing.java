import se.lth.cs.pt.window.SimpleWindow;
import java.awt.*;

public class LineDrawing {
	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(500, 500, "LineDrawing");
		w.setLineWidth(10);
		w.setLineColor(Color.green);
		while (true) {
			// vänta tills användaren klickar på en musknapp
			w.waitForMouseClick();
			int firstx = w.getClickedX();
			int firsty = w.getClickedY();
			// rita en linje till den punkt där användaren klickade
			w.lineTo(firstx, firsty);
		}
	}
}
