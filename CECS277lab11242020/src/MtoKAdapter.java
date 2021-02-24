public class MtoKAdapter extends KilometersAdaptee{
	private double speed;
	private double hours;
	
	public MtoKAdapter (double speed, double hours) {
		this.speed = speed;
		this.hours = hours;
	}
	
	public double distancek() {
		double kilometersSpeed = speed *1.609;
		double kilometersDistance = distancek(kilometersSpeed, hours);
		return kilometersDistance/1.609;
	}
}