package labWarmup0309012020;

public class main {
	 public static void main(String[] args)
	    {
		 int firstNum = 0;
		 int secondNum = 0;
		 int thirdNum = 0;
		 
		 //Loop from 999~1
		 
		 for(int i = 999; i > 1; i--) {
			 firstNum = (i % 1000) / 100;
			 secondNum = (i % 100) / 10;
			 thirdNum = i%10;
			 if((firstNum > secondNum) && (secondNum > thirdNum)) {
				 System.out.println(i);
			 }
		 }
	    }
}
