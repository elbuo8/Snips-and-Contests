package finished;

import java.util.Arrays;


public class MergeSortStrings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] array = {"lol", "fea", "yey"};
		System.out.println(Arrays.toString(sort(array)));
	}

	/**
	 * Merge sort
	 * @param array
	 * @return Sorted array
	 */
	static String[] sort(String[] array) {
		//base case
		if(array.length <= 1)
			return array;

		//divide into sublists
		String[] left = new String[array.length/2];
		String[] right = new String[array.length - left.length];

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

	/**
	 * 
	 * @param left
	 * @param right
	 * @return Merged array
	 */
	static String[] merge(String[] left, String[] right) {
		String[] array = new String[left.length + right.length];
		
		int indexi = 0;
		int indexj = 0;
		int key = 0;

		while (indexi < left.length && indexj < right.length) {
			if(left[indexi].compareTo(right[indexj]) < 0) 
				array[key++] = left[indexi++];
			else
				array[key++] = right[indexj++];
		}
		if(indexi < left.length)
			for (int i = indexi; i < left.length; i++) 
				array[key++] = left[i];
		
		if(indexj < right.length)
			for (int i = indexj; i < right.length; i++) 
				array[key++] = right[i];
		return array;
	}

}
