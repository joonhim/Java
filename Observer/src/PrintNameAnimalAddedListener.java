
public class PrintNameAnimalAddedListener implements AnimalAddedListener{
	private ZooSubject zoo;
	
	public PrintNameAnimalAddedListener() {
		this.zoo = zoo;
	}
	
	public void update(Object newState) {
		Animal latestAnimal = (Animal) newState;
		display(latestAnimal);
	}
	
	public void display(Animal latestAnimal) {
		System.out.println("The latest animal is "+ latestAnimal);
	}

}
