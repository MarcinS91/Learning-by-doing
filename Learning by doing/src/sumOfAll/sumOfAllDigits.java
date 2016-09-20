package sumOfAll;

public class sumOfAllDigits {

	static void sumOfAllDigits(int inputNumber) {

		int copyOfInputNumber = inputNumber;
		int sum = 0;

		while (copyOfInputNumber != 0) {
			int LastDigit = copyOfInputNumber % 10;
			sum = sum + LastDigit;

			copyOfInputNumber = copyOfInputNumber / 10;

		}
		System.out.println("Sum Of All Digits In " + inputNumber + " = " + sum);
	}

	public static void main(String[] args) {

		sumOfAllDigits(34567);
		sumOfAllDigits(75645);

	}

}
