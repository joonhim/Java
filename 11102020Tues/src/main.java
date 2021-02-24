import java.util.Set;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

class main {
  public static void main(String[] args) {
    HashMap<String, List<String>> list = new HashMap<String, List<String>>();
    ArrayList<String> friends = new ArrayList<String>();

    friends.add("Bob"  );
    friends.add("Jose" );
    friends.add("Alex" );
    friends.add("Cathy");
    list.put("Sue", friends);
    friends = new ArrayList<String>();
    
    friends.add("Bob");
    friends.add("Alex");
    list.put("Cathy", friends);
    friends = new ArrayList<String>();
    
    friends.add("Alex" );
    friends.add("Jose" );
    friends.add("Jerry");
    list.put("Bob", friends);
    friends = new ArrayList<String>();

    Scanner x = new Scanner(System.in);
    System.out.println("Please Enter name: ");
    String n = x.next();
    x.close();
    
    friends = (ArrayList<String>) list.get(n);
    if (friends == null) {
    	System.out.println(n +" "+ "is not a friend!");
    }else {
    	System.out.println(friends);
    }
    
  }
}