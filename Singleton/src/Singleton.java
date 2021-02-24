
public class Singleton
{
   private static Singleton instance;

   // declare the constructor as private which prevents object creation via new
   private Singleton() { }

   public static  Singleton getInstance() {
     if (instance == null) 
       instance = new Singleton();

     return instance;
   }
}
