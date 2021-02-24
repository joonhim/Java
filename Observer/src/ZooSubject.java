/**
 * Subject.java
 *
 * Objects implementing this interface allow observers
 * to register with it. When this object changes state,
 * it notifies all registered observers.
 */
import java.util.ArrayList;

public interface ZooSubject {

	/* allows an observer to register with the subject */
	public void registerAnimalAddedListener( AnimalAddedListener o );

	/* removes an observer */	
	public void unregisterAnimalAddedListener( AnimalAddedListener o );

	/* notifes all registered observers when its state changes */	
	public void notifyObservers();
}
