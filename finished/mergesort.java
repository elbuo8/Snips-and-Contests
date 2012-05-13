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
		if(array.length <= 1)
			return array;

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
		
		int indexi = 0;
		int indexj = 0;
		int key = 0;

		while (indexi < left.length && indexj < right.length) {
			if(left[indexi] < right[indexj]) 
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
