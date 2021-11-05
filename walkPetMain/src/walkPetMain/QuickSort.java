package walkPetMain;

import java.util.Arrays;

public class QuickSort extends AbstractSort implements Node {
	private Employee myEmployees;

	public QuickSort() {
		myEmployees = new Employee();
	}

	public static int compare = 0, swap = 0;

	static int moveTowards(int array[], int start, int end) {

		int median = array[end];

		int i = (start - 1);

		for (int j = start; j < end; j++) {
			compare++;

			if (array[j] <= median) {

				i++;

				int temp = array[i];
				array[i] = array[j];
				swap++;

				array[j] = temp;
			}

		}

		int temp = array[i + 1];
		array[i + 1] = array[end];
		array[end] = temp;

		return (i + 1);
	}

	public void quickSort(int[] userId, int start, int end) {
		if (start < end) {

			int pi = moveTowards(userId, start, end);

			quickSort(userId, start, pi - 1);

			quickSort(userId, pi + 1, end);
		}

	}

	public void getCounter() {
		System.out.println("Quick sort swap: " + swap + " compare: " + compare);
	}

	@Override
	public void start() {

		int[] userId = { 8, 7, 2, 1, 0, 9, 6, 10, 3 };
		int size = userId.length;
		int start = 0;
		int end = size - 1;

		int n = 1000;
		for (int i = 0; i <= n; i++) {
			quickSort(userId, start, end);
		}

	}

	@Override
	public int getKey() {

		return 0;
	}

	@Override
	public void sortAlgorithm(int[] userId) {
		int start = userId[0];
		int n = userId.length;
		int end = userId[n - 1];
		if (start < end) {

			int pi = moveTowards(userId, start, end);

			quickSort(userId, start, pi - 1);

			quickSort(userId, pi + 1, end);
		}

	}

}
