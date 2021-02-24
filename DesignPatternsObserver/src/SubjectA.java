
public class SubjectA extends Subject{
	private String state;
	public SubjectA() {
		state = "A";
	}
	public String getState()
	{
		return state;
	}
	public void setState( String s) {
		state = s;
		notifyObservers();
	}
}
