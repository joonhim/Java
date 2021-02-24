import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = " ";
		boolean done = false;
		Cat c = new Cat();
		
		while (!done) {
			System.out.println("What do you want from cat?: ");
			System.out.println("1. Sleep \n 2. eat\n 3. Play \n4. Ignore \n5. Terminate");
			input = scan.next();
			System.out.println(input);
			
			if(input.equals("1"))
			{
				c.sleep();
			}
			else if(input.equals("2"))
			{
				c.eat();
			}
			else if(input.equals("3"))
			{
				c.play();
			}
			else if(input.equals("4"))
			{
				c.ignore();
			}
			else if(input.contentEquals("5"))
				done = true;
		}
	}

}
