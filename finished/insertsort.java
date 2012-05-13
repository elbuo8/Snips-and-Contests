package finished;

public class insertsort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array = {4,6,2,10,16,3,4,20,8};
		array = sort(array);
		for (int i = 0; i < array.length; i++) 
			System.out.println(array[i]);

	}

	static int[] sort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int temp = array[i];
			int j = i;
			while (j > 0 && array[j-1] > temp) {
				array[j] = array[j-1];
				j--;
			}
			array[j] = temp;
			System.out.print(i + ",");
		}
		System.out.println();
		return array;
	}
}
