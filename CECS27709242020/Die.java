/**desc
 * 
 */
public class Die {
	/** desc for sides */
	private int sides;
	/** desc for value*/
	private int value;
	
	public Die() {
		sides = 6;
		value = 1;
	}
	/** desc constr
	 * 
	 * @param sides desc of para
	 */
	public Die(int sides) {//haven't been rolled
		if(sides >= 2) {
		this.sides = sides;
		}else {
			this.sides = 6;
		}
		value = 1;
	}
	/** desc
	 * @return desc
	 */
	public int roll(){/*return type*/ 
		value =(int)(Math.random() * sides ) + 1;
		return value;
	}
	/** desc
	 * 
	 * @return the value of the die
	 */
	public int getValue() {
		return value; /*access directly*/
	}
	
	/**
	 * 
	 * @param new val
	 * @return whether the val valid
	 */
	public boolean /*mutator*/ setValue(int val) {
		if( val >=1 && val <= sides) {
			this.value = val;
			return true;
		}
		return false;
	}
	// D6 = 3
	public void displayDie() {
		System.out.println("D" + sides + " = "+ value);
		
	}
	/**
	 desc
	 @return des of returned value
	 */
	@Override
	public String toString(){
		return "D" + sides + " = " + value;
	}
	
	
	
}
