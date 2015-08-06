package number.manipulation;

/* write a function that takes two numbers a and b and returns a.b eg: a=7 and b=24 output will be 7.24 */

public class NumberManipulation {

	public double create(int a, int b) {
		int n = b;
		int count = 0;
		while (n > 0) {
			count++;
			n /= 10;
		}

		return (double) a + ((double) b / Math.pow(10, count));
	}

	public static void main(String[] args) {
		NumberManipulation nm = new NumberManipulation();
		double result = nm.create(7, 24);
		System.out.println(result);
	}

}
