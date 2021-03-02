import se.lth.cs.pt.window.SimpleWindow;

import java.util.Random;

public class TurtleSteps {
 	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(1000, 1000, "Turtle1000Steps");
		Turtle t = new Turtle(w, 500, 500);
		Random r = new Random();
		int rsteps=0;
		for (int steps = 0; steps <= 1000;) {
			t.penDown();
			rsteps = r.nextInt(9)+1;
			t.forward(rsteps);
			steps+=rsteps;
			t.left(r.nextInt(360)-180);
			t.penUp();
		}
	}
}
