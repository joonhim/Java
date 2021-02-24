public class Yahtzee {
	private Die[] dice;
	
	public Yahtzee() {/*contructor*/
		dice = new Die[5];
		/* ^^ constructs array does not constructs whats in after created there is 5 null objects no value in them */
		for (int i - 0; i < dice.length; i ++) {
			dice[i] = new Die(6); //5 D6
		}
	}

	public void rollDice() {
		for(int i = 0; i<dice.length; i++) {
			dice[i].roll();
		}
	}
	
	
	// Dice = {1,2,3,4,5}
	@Override
	public String toString() {
		String s = "Dice ={";
		int i =0;
		for(i = 0; i<dice.length-1; i++) {
			s =+ dice[i].getValue() + ",";
		}
		s+= dice[i].getValue() +"}";
		return s;
	}
}
