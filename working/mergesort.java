package working;

public class mergesort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array = {43,12,534,1,6,3,9};
		sort(array);
		printArray(array);

	}

	static void sort(int[] array) {
		//base case
		if(array.length <= 1)
			return;
		
		//divide into sublists
		int[] left = new int[array.length/2];
		int[] right = new int[array.length - left.length];

		for (int i = 0; i < array.length; i++) {
			if(i < array.length/2)
				left[i] = array[i];
			else
				right[i - array.length/2] = array[i];
		}
		sort(left);
		sort(right);
		merge(left, right, array);
	}
	
	static void merge(int[] left, int[] right, int[] array) {
		int l = 0;
		int r = 0;
		for (int i = 0; i < array.length; i++) {
			if(left[l] <= right[r] && l < left.length) {
				array[i] = left[l];
				l++;
			}
			else {
				array[i] = right[r];
				r++;
			}
		}
	}

	static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) 
			System.out.print(array[i] + " ");
		System.out.println();
	}
}
