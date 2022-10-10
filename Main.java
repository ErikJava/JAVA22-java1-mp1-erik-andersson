package gissningsspelet;

import java.util.Scanner;

public class Main {

	public static void welcome() {
		System.out.println("Welcome to the Guessing Game!");
		System.out.println("Enter your guess: ");
	}

    public static void toohigh() {
		System.out.println("Your number is too high...");
	}

	public static void toolow() {
		System.out.println("Your number is too low...");
	}

	public static void gamerestart() {
		System.out.println("The game will now restart.");
		System.out.println("__________________________");
		System.out.println("\n");
	}

	static boolean checkNumber(int myAnswer, int secretNumber) {
		return myAnswer == secretNumber;
	}

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		
		while (true) {

			int secretNumber = (int) (Math.random() * 100);
			int myAnswer = -1;
			int tryCounter = 0;

			welcome();

			while (!checkNumber(myAnswer, secretNumber)) {

				myAnswer = myScanner.nextInt();

				if (myAnswer > secretNumber) {
					toohigh();

				}

				else if (myAnswer < secretNumber) {
					toolow();
				}

				tryCounter++;

			}

			System.out.println("You won the game with " + tryCounter + " guesses!");
			gamerestart();

		}

	}
}