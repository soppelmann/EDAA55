import se.lth.cs.pt.square.Square;
import se.lth.cs.pt.window.SimpleWindow;
import java.util.Random;

public class DrawThreeSquares {
	public static void main(String[] args) {
		Random rand = new Random();
		SimpleWindow w = new SimpleWindow(600, 600, "DrawSquare");
		int x = 250;
		int y = 250;
		int s = 100;
		int i = 2;
		while (i > 0) {
			Square sq = new Square(x, y, s);
			sq.draw(w);
			int dx=rand.nextInt(100);
			int dy=rand.nextInt(100);
			sq.move(dx,dy);
			sq.draw(w);
			i--;
		}

	}
}
