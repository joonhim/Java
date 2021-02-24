import java.util.TreeSet;

public class TreeSetRunner {
	public static void main(String args[]) {
		TreeSet<String> t = new TreeSet<String>();
		
		t.add("iii");
		t.add("hhh");
		t.add("ggg");
		t.add("fff");
		t.add("eee");
		t.add("ddd");
		t.add("ccc");
		t.add("bbb");
		t.add("aaa");
		t.add("iii");
		t.add("hhh");
		t.add("ggg");
		t.add("fff");
		t.add("eee");
		t.add("ddd");
		t.add("ccc");
		t.add("bbb");
		t.add("aaa");
		for (String s :t ) {
			System.out.println(s);
		}
	}
}
