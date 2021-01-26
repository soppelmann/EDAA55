import se.lth.cs.pt.square.Square;
import se.lth.cs.pt.window.SimpleWindow;
import java.util.Random;

public class DrawAnimatedSquares {
    public static void main(String[] args) throws InterruptedException {
        SimpleWindow w = new SimpleWindow(1500, 1500, "DrawClickSquares");
        Random rand = new Random();
        int x1, x2, y1, y2;
        int s = 100;
        w.waitForMouseClick();

        x1 = w.getMouseX();
        y1 = w.getMouseY();
        Square sq = new Square(x1, y1, s);
        //Draw first square
        sq.draw(w);

        //Get location of final square
        w.waitForMouseClick();
        x2 = w.getMouseX();
        y2 = w.getMouseY();
        sq.erase(w);
        int dx = Math.abs(x2 - x1);
        int dy = Math.abs(y2 - y1);
        System.out.println(dx);
        System.out.println(dy);

        int xdist = rand.nextInt(50)+50; //gör steg till höger i avstånd 50-100
        int i = (int) Math.floor(dx / xdist); // ser till att 97px motsvarar 9 rutor
        int ydist = (int) Math.floor(dy / i);

        while (i>0) {
            sq.move(xdist, ydist);
            sq.draw(w);
            SimpleWindow.delay(100);
            sq.erase(w);
            i--;
        }
    }
}