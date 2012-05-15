package working;

import java.util.Arrays;

/**
 * 
 * @author yamilasusta
 *
 */
public class quicksort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] array = {3,5,1,4,64,10,0};
		sort(array, 0, array.length);
		System.out.println(Arrays.toString(array));

	}

	static void sort(int[] array, int left, int right) {
		if(left+5 <= right) {
			int i = left;
			int j = right;
			int pivot = pivot(array);
			while (left <= right) {
				while (pivot > array[left]) 
					left++;
				while (pivot < array[right])
					right--;
				
				if(left <= right) {
					int temp = array[right];
					array[right] = array[left];
					array[left] = temp;
					
					left++;
					right--;
				}	
			}
			if(left < j)
				sort(array, left, j);
			if(right < i)
				sort(array, left, right);
		}
		else 
			array = insertSort(array);	
		
	}

	static int pivot(int[] array) {
		return array[array.length/2];
	}

	static int[] insertSort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int temp = array[i];
			int j = i;
			while (j > 0 && array[j-1] > temp) {
				array[j] = array[j-1];
				j--;
			}
			array[j] = temp;
		}
		return array;
	}
}
