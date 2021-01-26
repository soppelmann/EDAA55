import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Skriv två tal");
		Scanner scan = new Scanner(System.in);
		double nbr1 = scan.nextDouble();
		double nbr2 = scan.nextDouble();
		double sum = nbr1 + nbr2;
		double diff = Math.abs(nbr1 - nbr2);
		double prod = nbr1 * nbr2;
		double quot = nbr1 / nbr2;
		System.out.println("Summan av talen är " + sum);
		System.out.println("Differensen av talen är " + diff);
		System.out.println("Produkten av talen är " + prod);
		System.out.println("Kvoten av talen är " + quot);
		Thread.sleep(1000);
	}
}
