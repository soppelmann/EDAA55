import se.lth.cs.pt.window.SimpleWindow;

import java.awt.*;

public class draw {
    private int width;
    private int blockSize;
    private int height;
    private SimpleWindow w;

    public draw(int width, int height, int blockSize) {
        this.width = width * blockSize;
        this.height = height * blockSize;
        this.blockSize = blockSize;

        this.w = new SimpleWindow(width * blockSize, height * blockSize, "Rädda gubben!");
    }

    public void head(int x, int y) {
        int left = x;
        int right = left + 10;
        int top = y;
        int bottom = top + 10;
        for (int row = top; row <= bottom; row++) {
            w.moveTo(left, row);
            w.lineTo(right, row);
        }
        //System.out.println("Ritar huvud");
    }

    public void belly(int x, int y) {
        w.moveTo(x + 15, y + 10);
        w.lineTo(x + 15, y + 35);
        //System.out.println("Ritar mage");
    }

    public void larm(int x, int y) {
        w.moveTo(x, y);
        w.lineTo(x - 15, y - 5);
        //System.out.println("Ritar vänster arm");
    }

    public void rarm(int x, int y) {
        w.moveTo(x, y);
        w.lineTo(x + 15, y - 5);
        //System.out.println("Ritar höger arm");
    }

    public void lleg(int x, int y) {
        w.moveTo(x, y + 10);
        w.lineTo(x - 10, y + 20);
        //System.out.println("Ritar vänster ben");
    }

    public void rleg(int x, int y) {
        w.moveTo(x, y + 10);
        w.lineTo(x + 10, y + 20);
        //System.out.println("Ritar höger ben");
    }

    public void text(String x){
        w.moveTo(50, 50);
        //
        w.writeText(x);
    }
    public void clear(){
        w.clear();
    }
    public void winner(){
        w.moveTo(100, 100);
        w.writeText("YOU WIN!");
    }

}
