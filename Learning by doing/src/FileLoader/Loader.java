package FileLoader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Loader {

	public static void main(String[] args) {

		File file = new File("");

		try {
			Scanner sc = new Scanner(file).useDelimiter(":");

			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
