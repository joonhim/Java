// Test code for the decorator pattern.

public class Holstein {
 public static void main(String[] args) {
  Dessert chocolate = new Chocolate();
  
  System.out.println(chocolate.getDescription());
  System.out.println(chocolate.cost());
  System.out.println("");
  // now decorate the chocolate with a cherry
  chocolate = new Cherry(new hotFudge((chocolate)));
  System.out.println(chocolate.getDescription());
  System.out.println(chocolate.cost());
  System.out.println("");
  // now add a second cherry
  chocolate = new Cherry(new whippedCream((chocolate)));
  System.out.println(chocolate.getDescription());
  System.out.println(chocolate.cost());
  System.out.println("");

  // we can also decorate an ice cream cone with
  // two cherries in a single step
  Dessert strawberry= new Strawberry();
  strawberry = new Cherry(new Cherry(strawberry));
  System.out.println(strawberry.getDescription());
  System.out.println(strawberry.cost());
  System.out.println("");
  //Hotfudge and whipped cream
  strawberry = new hotFudge(new whippedCream(strawberry));
  System.out.println(strawberry.getDescription());
  System.out.println(strawberry.cost());
  System.out.println("");
  //cherry and hotfudge
  strawberry = new hotFudge(new Cherry(strawberry));
  System.out.println(strawberry.getDescription());
  System.out.println(strawberry.cost());
  System.out.println("");
  //cherry and whipped cream
  strawberry = new Cherry(new whippedCream(strawberry));
  System.out.println(strawberry.getDescription());
  System.out.println(strawberry.cost());
  System.out.println("");
  
  // Vanilla
  //hot fudge and whipped cream
  Dessert vanilla= new Vanilla();
  vanilla = new whippedCream(new hotFudge(vanilla));
  System.out.println(vanilla.getDescription());
  System.out.println(vanilla.cost());
  System.out.println("");
  //Cherry and hotFudge and whipped Cream
  vanilla = new whippedCream(new Cherry(new hotFudge(vanilla)));
  System.out.println(vanilla.getDescription());
  System.out.println(vanilla.cost());
  System.out.println("");
  //Cherry and whipped cream
  vanilla = new Cherry(new whippedCream(vanilla));
  System.out.println(vanilla.getDescription());
  System.out.println(vanilla.cost());
  System.out.println("");
  //hotfudge and Cherry
  vanilla = new hotFudge(new Cherry(vanilla));
  System.out.println(vanilla.getDescription());
  System.out.println(vanilla.cost());
  System.out.println("");
 }
}
