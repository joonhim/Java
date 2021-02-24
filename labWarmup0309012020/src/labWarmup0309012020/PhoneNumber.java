package labWarmup0309012020;
import java.util.Scanner;
public class PhoneNumber {
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter numbers 9 times: ");
		int n1 = 0, n2 = 0, n3 = 0, 
		n4 = 0, n5 = 0, n6 = 0, n7 = 0, 
		n8 = 0, n9 = 0, count = 0, i =0;
		int a[] = new int[30];
	
		for(i=0; i<30; i++)
		{
			a[i] = s.nextInt();
			if(i==9)
			{
				System.out.println("Enter another 9 more times: ");
			}
			if (i==19)
			{
				System.out.println("Enter another 9 more times for the last time: ");
			}
			
			if(a[i] == 1)
				n1++;
			else if(a[i] ==2)
				n2++;
			else if(a[i] ==3)
				n3++;
			else if(a[i] ==4)
				n4++;
			else if(a[i] ==5)
				n5++;
			else if(a[i] ==6)
				n6++;
			else if(a[i] ==7)
				n7++;
			else if(a[i] ==8)
				n8++;
			else if(a[i]== 9)
				n9++;
		}
		System.out.println("1- " + n1);
		System.out.println("2- " + n2);
		System.out.println("3- " + n3);
		System.out.println("4- " + n4);
		System.out.println("5- " + n5);
		System.out.println("6- " + n6);
		System.out.println("7- " + n7);
		System.out.println("8- " + n8);
		System.out.println("9- " + n9);
	}
}