package _00_Sorting_Algorithms;

import java.util.Random;

public class BogoSorter extends Sorter {

	Random r;
	

	public BogoSorter() {
		type = "Bogo";
		r = new Random();
		
	}

	// Bogo sort is a joke sorting algorithm. It is considered the most
	// inefficient sorting algorithm while still maintaining the possibility
	// of eventually sorting data.

	// It works by following these steps:
	// STEP 1. Is the array in order?
	// if yes, finished; if no, go to step 2.
	// STEP 2. Take two random elements in the array and swap them.
	// STEP 3. Go back to step 1.

	// 1. Complete the sort method using the Bogo sort algorithm.

	@Override
	void sort(int[] array, SortingVisualizer display) {
		// TODO Auto-generated method stub
		for (int i = 0; i < array.length; i++) {
			int random = r.nextInt(array.length);
			int random2= r.nextInt(array.length);
			if (i + 1 < array.length) {
				if (array[i] <= array[i + 1]) {
					int temp = array[random];
					array[random] = array[random2];
					array[random] = temp;
				} else {
					sort(array, display);
				}

			}
		}
	}

}
