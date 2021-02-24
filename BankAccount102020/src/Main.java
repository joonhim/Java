import java.util.ArrayList;
import java.util.Collections;

public class Main {
	
	public static void main(String[]args)
	{
		BankAccount Jay = new BankAccount(500);
		BankAccount Jack = new BankAccount(1500);
		BankAccount Jane = new BankAccount(2500);
		BankAccount Jenn = new BankAccount(9500);
		BankAccount Quil = new BankAccount(5000);
		
		ArrayList<BankAccount> chase = new ArrayList<BankAccount>();
		
		chase.add(Jay);
		chase.add(Jack);
		chase.add(Jane);
		chase.add(Jenn);
		chase.add(Quil);
		
		for(BankAccount e:chase)
			System.out.println(e.getBalance());
		
		Collections.sort(chase);
		
		for(BankAccount e:chase)
			System.out.println(e.getBalance());
	}

}
