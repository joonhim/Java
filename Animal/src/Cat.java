public class Cat extends Animal{
	private String color;
	
	public Cat(String n, String c) {
		super(n);
		color = c;
	}
	public String getColor() {
		return color;
	}
	
	public void speak() {
		System.out.println("Nyah");
		System.out.println(getName()+ "Nyahs");
	}
	
	public void sit() {
		System.out.println("Cat sits");
		System.out.println(getName()+ "sits");
	}
	public void sleeps() {
		System.out.println(getName()+"Sleeps");
		System.out.println("Sleep");
	}
	
	@Override
	public void doBehavior(int t) {
		if( t == 1) {
			speak();
		}else if (t == 2) {
			sit();
		}
	}

}