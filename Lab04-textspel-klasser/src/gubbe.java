import java.io.CharArrayWriter;
import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
import se.lth.cs.pt.window.SimpleWindow;

public class gubbe {
    public static final String[] words =
    {"ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE",
  "CASE", "CATCH", "CHAR", "CLASS", "CONST",
  "CONTINUE", "DEFAULT", "DOUBLE", "DO", "ELSE",
  "ENUM", "EXTENDS", "FALSE", "FINAL", "FINALLY",
  "FLOAT", "FOR", "GOTO", "IF", "IMPLEMENTS",
  "IMPORT", "INSTANCEOF", "INT", "INTERFACE",
  "LONG", "NATIVE", "NEW", "NULL", "PACKAGE",
  "PRIVATE", "PROTECTED", "PUBLIC", "RETURN",
  "SHORT", "STATIC", "STRICTFP", "SUPER", "SWITCH",
  "SYNCHRONIZED", "THIS", "THROW", "THROWS",
  "TRANSIENT", "TRUE", "TRY", "VOID", "VOLATILE", "WHILE"
    };
    private static draw g = new draw(40, 40, 10);

    public static final Random RANDOM = new Random();
    private static String wordToFind;

    private static String nextWordToFind() {
        return words[RANDOM.nextInt(words.length)];
    }

    // letters already entered by user
    public ArrayList<String> letters = new ArrayList<>();
    private int nbErrors;
    private char[] wordFound;

    public static void main(String[] args) {

        gubbe m = new gubbe();
        // choose word from our list
        wordToFind = nextWordToFind();
 //       System.out.println(wordToFind); //debug to print word in terminal
        System.out.println("Ordet har " + wordToFind.length() + " bokstäver");
        m.newgame(); // nollställ alla data

        m.play(); // starta spelet
        System.out.println("YOU LOSE!");
    }

    public void newgame() {
        nbErrors = 0;
        letters.clear();
        wordFound = new char[wordToFind.length()];

        for (int i = 0; i < wordFound.length; i++) {
            wordFound[i] = '_';
        }
                g.text(wordFoundContent());
        }



    private String wordFoundContent() {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < wordFound.length; i++) {
            builder.append(wordFound[i]);

            if (i < wordFound.length - 1) {
                builder.append(" ");
            }

        }

        return builder.toString();


    }

    private void enter(String c) {
        String cap = c.substring(0, 1).toUpperCase();
        if (!wordFoundContent().contains(cap)) { // om vi inte redan har bokstaven
            if (wordToFind.contains(cap)) {
                System.out.println("Good joob!\n"); // kolla om bokstaven redan finns i listan, bara en bokstav
                letters.add(cap);
                int index = wordToFind.indexOf(cap);
                while (index >= 0) {
                    wordFound[index] = cap.charAt(0);
                    index = wordToFind.indexOf(cap, index + 1);
                }


                // CharArrayWriter sb = new CharArrayWriter();
                // for (String s : letters) {
                // sb.append(s);
                // sb.append(" ");
                // }
                // String str1 = sb.toString();
                // System.out.println(str1);
                // nbErrors--; byt till substring 0,wordtofind.length()
            } else {
                System.out.println("Try again!");
                System.out.println(wordToFind.length() - nbErrors - 1 + "attempts remaining");
                nbErrors++;
                g.clear();
                if (nbErrors >= wordToFind.length() - 5) {
                    g.head(20, 30);
                }
                if (nbErrors >= wordToFind.length() - 4) {
                    g.belly(10, 30);
                }
                if (nbErrors >= wordToFind.length() - 3) {
                    g.rarm(25, 50);
                }
                if (nbErrors >= wordToFind.length() - 2) {
                    g.larm(25, 50);
                }
                if (nbErrors >= wordToFind.length() - 1) {
                    g.lleg(25, 55);
                }
                if (nbErrors >= wordToFind.length()) {
                    g.rleg(25, 55);
                }
            }
        } else {
            System.out.println("Dont put the same letter twice!");
        }
    }
    public boolean wordFound() {
        return wordToFind.contentEquals(new String(wordFound));
    }
    public void play() {
        try (Scanner input = new Scanner(System.in)) {

            while (nbErrors < wordToFind.length()) { //vi ger oss ordet +5 bokst
                System.out.println("\nEnter Character");

                String str = input.next();

                enter(str);
                g.text(wordFoundContent());
                // letters.add(str); //ny metod som kollar ifall bokstaven är rätt, isf lägg
                // till den.

                if (wordFound()) { //boolean, returns 0 or 1 based on match of stringcontent
                    System.out.println("YOU WIN!");
                    g.winner();
                    //Thread.sleep();
                    //System.exit(1);
                } else {
                    // do nothing
                }
// mer sake att lägga till, lista över felaktiga bokstäver, bara fel bokstav en gång, kryssa över.
                //skriv om ritnings modulen för att refresha alla delar.
            }

        }
    }
}
