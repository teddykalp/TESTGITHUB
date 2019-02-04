import java.util.Scanner;


public class Basics {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is your name");
		String name = keyboard.nextLine();
		System.out.println("Your name is " + name);
	}

}
