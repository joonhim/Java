import java.util.Scanner;
public class Main 
{
	public static void main(String[] args) 
	{
	Scanner in = new Scanner(System.in);
	System.out.println("Animals: ");
	System.out.println("1. Cat ");
	System.out.println("2. Dog");
	int animalInput= in.nextInt();
	
	System.out.println("Behavior:");
	System.out.println("1. Speak");
	System.out.println("2. Sit");
	System.out.println("3. Fetch");
	System.out.println("4. Laydown");
	int behaviorInput = in.nextInt();
	
	Animal [] animals = new Animal[2];
	animals [0] = new Cat("Fuzzy Boots", "Black");
	animals [1]= new Dog("Hachi", "White", 6);
	animals[animalInput -1].doBehavior(behaviorInput);
	
	
	Dog d = new Dog("Coco", "Brown", 5);
	System.out.println(d.getColor());
	}
	/*Dog d1 = new Dog("Rocky", "Gray", 5);
	Dog d2 = new Dog("Hachi", "Gray", 4);
	
	if(d1.compareTo(d2)==0) {
		System.out.println("Equal");
	}else if(d1.compareTo(d2) < 0 ) {
		System.out.println("In order");
	}else if(d1.compareTo(d2) > 0) {
		System.out.println("Out of Order");
	}
	
	System.out.println(d1.compareTo(d2));
	*/
	
	public void displayAnimal(Animal a, int input) {
		System.out.println(a.getName());
		a.doBehavior(input);
	
	}
}
