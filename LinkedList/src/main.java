import java.util.LinkedList;
import java.util.ListIterator;
public class main {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		ListIterator<String> iter;
		
		list.add("C");
		list.add("D");//[C,D]
		
		iter = list.listIterator();
		
		iter.add("A");// ACD
		iter.add("B");// ABCD
		
		System.out.println(list);
		
		while( iter.hasNext()) { //C D
			System.out.println(iter.next());
		}
		iter.set("X");
		
		System.out.println(list);
		
		
		while(iter.hasPrevious()) {
			System.out.println(iter.previous()); //XCBA
		}
		iter.remove();
		
		System.out.println(list);
	}

}
