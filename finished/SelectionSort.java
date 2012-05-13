package finished;

/**
 * 
 * @author yamilasusta
 *
 */
public class SelectionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array = {4324,2,412,541,6,1,4};
		sort(array);
		for (int i = 0; i < array.length; i++) 
			System.out.println(array[i]);			
		
	}
	
	static void sort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < array.length; j++) {
				if(array[min] > array[j])
					min = j;
			}
			int temp = array[min];
			array[min] = array[i];
			array[i] = temp;
		}
	}
}
