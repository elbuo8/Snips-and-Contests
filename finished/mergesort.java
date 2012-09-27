package finished;

import java.util.Arrays;


public class mergesort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array = {43,12,534,1,6,3,9,8};
		System.out.println(Arrays.toString(sort(array)));
	}

	static int[] sort(int[] array) {
		//base case
		if(array.length <= 1) return array;

		//divide into sublists
		int[] left = new int[array.length/2];
		int[] right = new int[array.length - left.length];

		for (int i = 0; i < array.length; i++) {
			if(i < array.length/2)
				left[i] = array[i];
			else
				right[i - array.length/2] = array[i];
		}

		left = sort(left);
		right = sort(right);

		return merge(left, right);
	}

	static int[] merge(int[] left, int[] right) {
		int[] array = new int[left.length + right.length];
		int leftIndex = 0;
		int rightIndex = 0;
		
		for (int i = 0; i < array.length; i++) {
			if(leftIndex < left.length && rightIndex < right.length) 
				array[i] = (left[leftIndex] <= right[rightIndex]) ? left[leftIndex++]:right[rightIndex++];
			else if(leftIndex >= left.length) array[i] = right[rightIndex++];
			else array[i] = left[leftIndex++];
		}

		return array;
	}

}
