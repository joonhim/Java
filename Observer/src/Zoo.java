import java.util.ArrayList;

public class Zoo implements ZooSubject{
	
	private ArrayList<AnimalAddedListener> observers;
	private Animal latestAnimal;
	
	public Zoo() {
		observers = new ArrayList<AnimalAddedListener>();
	}

	public void registerAnimalAddedListener(AnimalAddedListener o) {
		// TODO Auto-generated method stub
		observers.add(o);
	}
	public void unregisterAnimalAddedListener(AnimalAddedListener o) {
		// TODO Auto-generated method stub
		observers.remove(0);
	}
	
	public void notifyObservers() {
		for(int i = 0; i < observers.size(); i++) {
			AnimalAddedListener obs = observers.get(i);
			obs.update(latestAnimal);
		}
	}


	public void addAnimal(Animal latestAnimal) {
		this.latestAnimal = latestAnimal;
		
		notifyObservers();
		
	}

}
