import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileLog {
	private PrintWriter writer;
	private static FileLog instance=null;
	
	private FileLog(){
		try {
			writer = new PrintWriter("log.txt");		
		}catch(FileNotFoundException e){
			System.out.println("FNF");
		}
	
	}
	public static FileLog getInstance() {
		if(instance == null) {
			instance = new FileLog();
		}
		return instance;
	}
	public void writeMsg (String msg) {
		writer.println( msg );
		writer.flush();
	}

}
