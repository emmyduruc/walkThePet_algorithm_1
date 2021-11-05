package walkPetMain;

import java.util.Arrays;

public class SelectionSort extends AbstractSort {

	public SelectionSort() {

	}

	public void selectionSort(String userId2[], int n) {

		for (int i = 0; i < n - 1; i++) {

			int minIndex = i;
			String minStr = userId2[i];
			for (int j = i + 1; j < n; j++) {

				if (userId2[j].compareTo(minStr) < 0) {

					minStr = userId2[j];
					minIndex = j;
				}
			}

			if (minIndex != i) {
				String temp = userId2[minIndex];
				userId2[minIndex] = userId2[i];
				userId2[i] = temp;
			}
		}

	}

	@Override
	public void start() {

	}

	@Override
	public void sortAlgorithm(int[] userId2) {
		int size = userId2.length;

		for (int i = 0; i < size - 1; i++) {
			int minIndex = i;

			for (int j = i + 1; j < size; j++) {

				if (userId2[j] < userId2[minIndex]) {
					minIndex = j;
				}
			}

			int temp = userId2[i];
			userId2[i] = userId2[minIndex];
			userId2[minIndex] = temp;
		}

	}
	
	

	
}
