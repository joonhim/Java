
public class Radio {
	private RadioState state;
	public Radio() {
		state = new OffState();
	}
	public void setState (RadioState s) {
		state = s;
	}
	public void offSwitch() {
		state.turnOff( this );
	}
	public void onSwitch() {
		state.turnOn(this);
	}
	public void channelSwitch() {
		state.changeStation(this);
	}

}
