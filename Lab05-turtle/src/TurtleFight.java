import se.lth.cs.pt.window.SimpleWindow;
import java.math.*;
import java.awt.*;
import java.awt.color.*;
import java.util.Random;

public class TurtleFight {
    public static void main(String[] args) {
        SimpleWindow w = new SimpleWindow(500, 500, "TurtleFighters");
        Turtle t1 = new Turtle(w, 250, 250);
        Turtle t2 = new Turtle(w, 350, 350);

        while (distance(t1, t2)) {
            w.setLineColor(Color.BLACK);
            move(t1);
            w.setLineColor(Color.RED);
            move(t2);
        }
        System.out.println("Turtle collapse at (" + t1.getX() + "," + t1.getY() + ")");
    }


    public static void move(Turtle t) {
        Random r = new Random();
        t.penDown();
        t.forward(r.nextInt(9)+1);
        t.left(r.nextInt(360) - 180);
        t.penUp();
    }

    public static boolean distance(Turtle t1, Turtle t2) {
        //beräkna avstånd mellan t1 och t2
        double xdiff = Math.abs(t1.getX() - t2.getX());
        double ydiff = Math.abs(t1.getY() - t2.getY());
        double dist = Math.sqrt(xdiff * xdiff + ydiff * ydiff);
        return dist >= 50;
    }}

