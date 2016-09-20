package sorting;

public class SelectionSort {

	static void selectionSort(int[] inputArray) {

		int temp, pos;

		for (int i = 0; i < inputArray.length - 1; i++) {
			pos = i;

			for (int j = i + 1; j < inputArray.length; j++) {
				if (inputArray[j] < inputArray[pos]) {
					pos = j;
				}
			}

			temp = inputArray[i];
			inputArray[i] = inputArray[pos];
			inputArray[pos] = temp;
		}
		for (int i = 0; i < inputArray.length; i++) {
			System.out.print(inputArray[i] + " ");
		}
		System.out.println();

	}

	public static void main(String[] args) {

		selectionSort(new int[] { 34, 4, 56, 100, 1, 5 });

	}

}
