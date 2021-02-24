
public class ObserverA implements Observer{
	private SubjectA subject;
	public ObserverA( SubjectA s) {
		subject =s;
		subject.attach( this );
	}
	@Override 
	public void update(Subject s) {
		if (subject == s) {
			display( );}}
	public void display() {
		System.out.println("OA: SubA: "+ subject.getState());
	}
}
