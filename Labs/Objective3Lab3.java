public class Objective3Lab3 {
	public static void main(String[] args) {
		int first = 1 + (int)(Math.random() * 6);
		int second = 1 + (int)(Math.random() * 6);
		int third = 1 + (int)(Math.random() * 6);
		String equation = first + " + " + second + " + " + third + " = " + (first + second + third);

		System.out.println(equation);

	}
}