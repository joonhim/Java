import java.util.*;
public class Client {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		Radio r = new Radio();
		
		
		int option = 0;
		while(option != 4) {
			System.out.println("1. Turn Off");
			System.out.println("2. Turn On");
			System.out.println("3. Change Station");
			System.out.println("4. Quit");
			option = in.nextInt();
			
			if(option == 1) {
				r.offSwitch();
			}else if(option == 2) {
				r.onSwitch();
			}else if(option ==3 ) {
				r.channelSwitch();
			}
		}
		
		
	}

}
