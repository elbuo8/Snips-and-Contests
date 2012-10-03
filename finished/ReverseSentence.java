package finished;

public class ReverseSentence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sentence = "Do or do not, there is no try.";
		System.out.println(reverseSentence(sentence));
	}

	static String reverseSentence(String sentence) {
		int spaces = sentence.split(" ").length;
		System.out.println(spaces);
		String result = "";
		sentence += " ";
		for (int i = 0; i < spaces; i++) {
			result = sentence.substring(0, sentence.indexOf(" ")) + " " + result;
			sentence = sentence.substring(sentence.indexOf(" ")+1);
		}
		return result;
	}
}
