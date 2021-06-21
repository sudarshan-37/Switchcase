import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		System.out.println("Choose a number:\n 1. Hi\t 2. Hello\t 3.Namaste");
		Scanner s = new Scanner(System.in);
		choice = s.nextInt();
		switch (choice){
		
			case 1: System.out.println("You said Hi");
				    break;
			case 2: System.out.println("You said Hello");
		    break;
			case 3: System.out.println("You said Namaste");
		    break;
		    default : System.out.println("Invalid choice");
		    break;
		}
	}	
}
