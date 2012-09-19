package finished;

import java.util.Arrays;

/**
 * Given an array of sorted integers
 * Return a sorted array of the square of the integers 
 * Must be linear time
 * @author yamilasusta
 *
 */
public class mongoInterview {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] sortedArray = {-5,-3,-1,0,3,10,25};
		System.out.println(Arrays.toString(squarer(sortedArray)));
	}

	static int[] squarer(int[] a) {
		int[] sortedArray = new int[a.length];
		int left = 0;
		int right = a.length - 1;
		for (int i = a.length-1; i >= 0; i--) {
			sortedArray[i] = (a[left]*a[left] > a[right]*a[right]) ? a[left]*a[left++]:a[right]*a[right--];
		}
		return sortedArray;
	}
	
}
