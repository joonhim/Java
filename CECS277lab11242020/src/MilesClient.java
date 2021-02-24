//Target Interface
public class MilesClient {
    public double distance(double mph,double hours){
       //create a new MtoKAdapter instance
    	MtoKAdapter m2k = new MtoKAdapter(mph, hours);
       //call its distance method
       return m2k.distancek(); //distance in miles
    }
}
