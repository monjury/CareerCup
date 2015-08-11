package palindrome;

public class Palindrome {

	public boolean isPalindrome(String s) {
		char[] input = s.toCharArray();
		int j = input.length - 1;
		for(int i = 0; i < input.length/2; i++) {
			if(input[i] != input[j]) {
				return false;
			}
			j--;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Palindrome p = new Palindrome();
		System.out.println(p.isPalindrome("madam"));
		System.out.println(p.isPalindrome("maddam"));
		System.out.println(p.isPalindrome("masdam"));
		System.out.println(p.isPalindrome("ma"));
		System.out.println(p.isPalindrome("m"));
		System.out.println(p.isPalindrome(""));
	}
}
