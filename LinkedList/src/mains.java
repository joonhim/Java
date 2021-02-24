import java.util.LinkedList;
import java.util.ListIterator;

public class mains{
	public static void main(String args[]) {
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("ddd");
		list.add("eee");
		list.add("fff");
		list.add("ggg");
		list.add("hhh");
		list.add("iii");
		
		System.out.println("OG List: ");
		
		ListIterator<String> itr = list.listIterator();
		
		while(itr.hasNext())
			System.out.println(itr.next());
			System.out.println("List after: ");
			
		while(itr.hasPrevious()) {
			String x = itr.previous();
			if (x.startsWith("a") || x.startsWith("e") || x.startsWith("i") /*||x.startsWith("o") ||x.startsWith("u")*/) itr.remove();
	}
		itr = list.listIterator();
		
		while(itr.hasNext())
			System.out.println(itr.next());
}
}
