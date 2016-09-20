package fibonacci;

import java.util.Scanner;

public class Fibonacci {

	public static int fib(int n) {
		if (n == 1 || n == 2) {
			return 1;
		} else {
			return fib(n - 1) + fib(n - 2);
		}
	}

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj, ktory wyraz ciagu Fibonacciego obliczyc");
		n = sc.nextInt();
		System.out.println(n + "-ty wyraz ciagu Fibonacciego: " + fib(n));

	}

}
