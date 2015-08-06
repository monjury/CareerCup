package reverse.words;

/*Reverse words : "I love to play" becomes "play to love I" in place.*/

public class ReverseWords {

	public char[] reverse(char[] input) {
		reverseWord(input, 0, input.length);
		int start = 0;
		int end = 0;
		while (end < input.length) {
			if (input[end] == ' ') {
				reverseWord(input, start, end);
				start = end + 1;
			}
			end++;
		}
		reverseWord(input, start, end);
		return input;
	}

	public char[] reverseWord(char[] input, int start, int end) {
		int init = start;
		int mid = (start + end) / 2;
		for (int i = start; i < mid; i++) {
			char temp = input[i];
			input[i] = input[end - 1 - (i - init)];
			input[end - 1 - (i - init)] = temp;
		}
		return input;
	}

	public static void main(String[] args) {
		ReverseWords rw = new ReverseWords();
		char[] output = rw.reverse("all love to play".toCharArray());
		String print = String.valueOf(output);
		System.out.println(print);
	}
}
