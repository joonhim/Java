
public class ObserverB implements Observer{
	private SubjectA subject;
	public ObserverB(SubjectA s) {
		subject =s;
		subject.attach( this );
	}
	@Override
	public void update( Subject s) {
		if( subject == s ) {
			display ();
		}
	}
	public void display() {
		System.out.println("OB: SubA: "+ subject.getState());
	}

}
