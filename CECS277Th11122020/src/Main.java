
public class Main {
	public static void main(String[] args) {
		FileLog logger = FileLog.getInstance();
		logger.writeMsg("Program Start");
		method1();
		method2();
		logger.writeMsg("Program End");
	}
	public static void method1() {
		FileLog.getInstance().writeMsg("Method1");
		
	}
	public static void method2() {
		FileLog.getInstance().writeMsg("Method2");
	}

}
