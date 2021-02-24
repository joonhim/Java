
public class Main {
public static void main(String[] args) {
	Animal[] animals = new Animal[4];
	 
	animals[0] = new Dog("Gohan", "Black");
	animals[1] = new Cat("Fluffy", "Gray");
	animals[2] = new Fish("Bubbles", "Orange");
	animals[3] = new Dog("Gohan", "Brown");
	
	System.out.println(animals[0]);
	System.out.println(animals[3]);
	
/*	for(int i = 0; i < animals.length; i++) {
		displayAnimal(animals[i]);
}
*/
	
	if (animals[0].equals(animals[3])) {
		System.out.println("Same");
	}else {
		System.out.println("Diff");
	}
/*public static void displayAnimal(Animal a){
	System.out.println(a);
	System.out.println(a.makeNoise());	
	}*/
	
}
}
