package commonDivisor;

import java.util.Scanner;

public class CommonDivisor {

	public static int div(int a, int b) {
		int r = a % b;
		while (r != 0) {
			a = b;
			b = r;
			r = a % b;
		}
		return b;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj wartosc liczby pierwszej:");
		int a = sc.nextInt();

		System.out.println("Podaj wartosc drugiej liczby:");
		int b = sc.nextInt();

		System.out.println(" Najwiekszy wspolny dzielnik licz wynosi: " + div(a, b));

	}

}
