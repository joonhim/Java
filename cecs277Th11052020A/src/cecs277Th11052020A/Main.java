package cecs277Th11052020A;
import java.util.Collection;
import java.util.TreeSet;
import java.util.TreeMap;
class Main {
  public static void main(String[] args) {
    TreeSet<String> set = new TreeSet<String>();
    System.out.println(set.isEmpty());

    set.add("A");
    set.add("B");
    set.add("C");
    set.add("D");

    for(String s: set){
      System.out.println(s);
    }

    System.out.println(set);

    System.out.println(set.size());

    System.out.println(set.remove("C"));
    System.out.println(set.remove("G"));

    System.out.println(set);
    System.out.println(set.first());
    System.out.println(set.last());

    Object[] arr = set.toArray();
    
    for(String s: set){
    System.out.println(s);
    }


  }
}