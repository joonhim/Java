public abstract class Animal {
	private String name;
	private int age;
	
	public Animal(String n) {
		name = n;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	public abstract void doBehavior( int t );
		
	

}
