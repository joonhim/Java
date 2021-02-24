package labWarmup0309012020;
import java.util.Scanner;
public class HowManyRand {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("How many Numb should be Generated?: ");
		int amountOfRolls = in.nextInt(); //n
		System.out.println("What is the number of values for each random number?: ");
		int range = in.nextInt(); //values
		
		int[] rndArr = new int[range];
		for(int i = 0; i<range; ++i)
		{
			rndArr[i] = 0;
		}
		
		int value;
		for(int i=0; i<amountOfRolls;++i)
		{
			value = (int)Math.floor(Math.random()*range);
			rndArr[value]++;
		}
		for(int i = 0; i < range; ++i)
		{
			System.out.println(i + " " +rndArr[i]);
		}
		
	}

}
