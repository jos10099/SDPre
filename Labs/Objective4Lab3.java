import java.util.Scanner;

public class Objective4Lab3{
	public static void main(String[] args) {
		int age, currentYear;


		Scanner input = new Scanner(System.in);
		System.out.println("How old are you?");


		age = input.nextInt();
		currentYear = 2023;

		System.out.println(" You were born in " + (currentYear - age));

		input.close();




	}
}