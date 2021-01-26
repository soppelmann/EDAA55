import se.lth.cs.pt.square.Square;
import se.lth.cs.pt.window.SimpleWindow;

import java.awt.*;
import java.awt.color.ColorSpace;

public class Mole {
    private static Graphics g = new Graphics(40, 40, 10);
    public static void main(String[] args) throws InterruptedException {
        Mole m = new Mole();
        System.out.println("Keep on digging!");
        m.drawWorld();
        m.dig();
    }

    public void drawWorld() {
        g.rectangle(0, 20, 40, 20, Color.PINK); // mark
        g.rectangle(0, 19, 40, 1, Color.GREEN); // gräs
        g.rectangle(0, 0, 40, 19, Color.CYAN); // himmel
    }
// gör egen klass för färgerna..
    // if statement to avoid breaking grass barrier
    public void dig() {
        int x = g.getWidth() / 20;
        // För att börja på mitten
        int y = g.getHeight() / 20;
        while (true) {
            g.block(x, y, Color.MAGENTA);
            char key = g.waitForKey();
            if (key == 'w') {
                y--;
                g.block(x, y, Color.MAGENTA);
                g.block(x, y + 1, Color.orange);
            }
            else if (key == 'a') {
                x--;
                g.block(x, y, Color.MAGENTA);
                g.block(x+1, y, Color.orange); }
             else if (key == 's') {
                y++;
                g.block(x, y, Color.MAGENTA);
                g.block(x, y - 1, Color.orange); }
            else if (key == 'd') {
                x++;
                g.block(x, y, Color.MAGENTA);
                g.block(x-1, y, Color.orange); }
        }

    }


}
