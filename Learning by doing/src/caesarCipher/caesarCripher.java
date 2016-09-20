package caesarCipher;

import java.util.Scanner;

public class caesarCripher {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj wyrazy do zaszyfrowania: ");
		String enc = sc.nextLine();
		System.out.println("Podaj przesuniecie: ");
		int offset = sc.nextInt();
		sc.close();
		System.out.println("Zaszyfrowana wiadomosc:" + caesarCripher.encode(enc, offset));
		System.out.println(
				"Oto odkodowana wiadomosc: " + caesarCripher.decode(caesarCripher.encode(enc, offset), offset));

	}

	public static String decode(String enc, int offset) {
		return encode(enc, 26 - offset);
	}

	public static String encode(String enc, int offset) {
		offset = offset % 26 + 26;
		StringBuilder encoded = new StringBuilder();
		for (char i : enc.toCharArray()) {
			if (Character.isLetter(i)) {
				if (Character.isUpperCase(i)) {
					encoded.append((char) ('A' + (i - 'A' + offset) % 26));
				} else {
					encoded.append((char) ('a' + (i - 'a' + offset) % 26));
				}
			} else {
				encoded.append(i);
			}
		}
		return encoded.toString();

	}

}
