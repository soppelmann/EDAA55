import se.lth.cs.pt.square.Square;
import se.lth.cs.pt.window.SimpleWindow;

public class DrawClickSquares {
    public static void main(String[] args) throws InterruptedException {
        SimpleWindow w = new SimpleWindow(1500, 1500, "DrawClickSquares");
        int x1, x2, y1, y2;
        int s = 100;
        w.waitForMouseClick();
        while (true) {

            x1 = w.getMouseX();
            y1 = w.getMouseY();
            Square sq = new Square(x1, y1, s);

            sq.draw(w);

            w.waitForMouseClick();
            sq.erase(w);
            x2 = w.getMouseX();
            y2 = w.getMouseY();
            //Bestäm avstånd som abs(x2-x1)/antal



        }
    }
}