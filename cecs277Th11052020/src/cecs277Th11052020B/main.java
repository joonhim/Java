package cecs277Th11052020B;

import java.util.Set;
import java.util.HashMap;
class main {
  public static void main(String[] args) {
    HashMap<String, Integer> map = new HashMap<String, Integer>();

    map.put("A", 15);
    map.put("B", 28);
    map.put("x", 13);
    map.put("E", 63);

    System.out.println(map);

    if(map.containsKey("B")){
      System.out.println(map.get("B"));
    }

    if(map.containsKey("G")){
      System.out.println(map.get("G"));
    }

    System.out.println(map.containsValue(13));
    System.out.println(map.containsValue(14));
    System.out.println(map.size());

    System.out.println(map.remove("G"));
    System.out.println(map.size());
    
    Set <String> set = map.keySet();
    for(String s : set) {
    	System.out.println(s+" "+ map.get(s));
    }
  }
}