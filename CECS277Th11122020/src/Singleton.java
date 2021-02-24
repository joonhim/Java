
public class Singleton {
	private static Singleton instance = null;
	private Singleton() {// no parameters 
		// set default values of data member}
	}
	public static Singleton getInstance() {
		if (instance ==  null) {
			instance = new Singleton();
		}
		return instance;
	}
//class methods
}
