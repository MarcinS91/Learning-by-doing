package binaryOrNot;

public class BinaryOrNot {

	static void isBinaryOrNot(int number) {
		boolean isBinary = true;
		int copyOfnumber = number;

		while (copyOfnumber != 0) {
			int temp = copyOfnumber % 10;
			if (temp > 1) {
				isBinary = false;
				break;
			} else {
				copyOfnumber = copyOfnumber / 10;
			}
		}
		if (isBinary) {
			System.out.println(number + " is binary number");
		} else {
			System.out.println(number + " is not a binary number");
		}
	}

	public static void main(String[] args) {
		isBinaryOrNot(101111);
	}

}
