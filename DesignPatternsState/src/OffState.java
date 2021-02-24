
public class OffState implements RadioState {
	@Override 
	public void turnOn ( Radio r) {
		System.out.println("turning on radio...");
		System.out.println("Station -> Rock");
		r.setState( new RockState( ));
	}
	@Override 
	public void turnOff (Radio r) {
		System.out.println("Radio is already off...");
	}
	@Override 
	public void changeStation( Radio r) {
		System.out.println(" Turn the radio on first...");
	}

}
