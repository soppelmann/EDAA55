import se.lth.cs.pt.window.SimpleWindow;

public class SimpleWindowExample {
public static void main(String[] args) {
SimpleWindow w = new SimpleWindow(200, 200, "Drawing Window");
w.moveTo(100, 100);
w.lineTo(-100, 100);
w.moveTo(100, 100);
w.lineTo(200, 100);
w.moveTo(100, 100);
w.lineTo(100, 200);
w.moveTo(100, 100);
w.lineTo(100, 0);
w.moveTo(180, 90);
w.writeText("x");
w.moveTo(110, 10);
w.writeText("y");
	}
}
