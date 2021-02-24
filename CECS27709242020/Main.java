/*desc
 * 
 */
public class Main {
	 public static void main(String[] args){
		 Yahtzee y1 = new Yahtzee();
			
			System.out.println(y1);
			
			y1.rollDice();
			
			System.out.println(y1);
			
		 Die d1 = new Die(); //D6
		 Die d2 = new Die(12); //D12
		 
		 System.out.println( d1);
		 System.out.println( d2);
		 
		 d1.roll();
		 d2.roll();
		 
		 
		if (d1.setValue(8)) {
			System.out.println("Set");
		}else {
			System.out.println("Not Set");
		}
		
		 System.out.println( d1);
		 System.out.println( d2);
		 
	 }
}
