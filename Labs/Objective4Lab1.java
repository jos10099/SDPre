import java.util.Scanner;

public class Objective4Lab1 {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		System.out.println("What is your first name?");
		String lname = keyboard.next();

		System.out.println("What is your last name?");
		String fname = keyboard.next();

		System.out.println("What is your favorite animal?");
		String favoriteAnimal = keyboard.next();

		System.out.println("What is your favorite food?");
		String favoriteFood = keyboard.next();

		System.out.println("What is your favorite song?");
		String favoriteSong = keyboard.next();

		System.out.println("My name is " + lname + "  " + fname + ".");
		System.out.println("My favorite animal is a " + favoriteAnimal + ".");
		System.out.println("My favorite food is " + favoriteFood + ".");
		System.out.println("My favorite song is " + favoriteSong + ".");
		

		keyboard.close();


	}
}