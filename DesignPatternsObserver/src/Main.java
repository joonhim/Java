
public class Main {
	public static void main(String[] args) {
		SubjectA subA = new SubjectA();
		ObserverA obsA = new ObserverA (subA);
		ObserverB obsB = new ObserverB (subA);
		subA.setState("B");
		subA.detach(obsB);
		subA.setState("C");
		
	}

}
