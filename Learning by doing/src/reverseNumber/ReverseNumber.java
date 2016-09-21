package reverseNumber;

public class ReverseNumber {

	public int reverseNumber(int number) {

		int reverse = 0;
		while (number != 0) {
			reverse = (reverse * 10) + (number % 10);
			number = number / 10;
		}
		return reverse;
	}

	public static void main(String[] args) {

		ReverseNumber nr = new ReverseNumber();
		System.out.println("Wynik: " + nr.reverseNumber(145698));
	}

}
