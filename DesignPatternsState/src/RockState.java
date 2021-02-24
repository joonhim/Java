
public class RockState implements RadioState{
	@Override 
	public void turnOn ( Radio r) {
		System.out.println("turning on radio...");
		System.out.println("Station -> Rock");
		
	}
	@Override 
	public void turnOff (Radio r) {
		System.out.println("Radio is already off...");
		r.setState( new OffState( ));
	}
	@Override 
	public void changeStation( Radio r) {
		System.out.println("Station -> Oldies.");
		r.setState( new OldiesState( ));
	}

}
