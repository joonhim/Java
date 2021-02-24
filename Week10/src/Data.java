public class Data
{
   /**
      Computes the average of the measures of the given objects.
      @param objects an array of Measurable objects
      @return the average of the measures
   */
   public static double average(Measurable[] objects)
   {
      double sum = 0;
      for (Measurable obj : objects)
      {
         sum = sum + obj.getMeasure();
      }
      
      if (objects.length > 0) { return sum / objects.length; }
      else { return 0; }
      
      }
   
public static Measurable getSmallest(Measurable[] persons)
	{
	double smallest=persons[0].getMeasure();
	Measurable temp = new Person();
	
	for (Measurable person : persons) {
		if(person.getMeasure()<smallest)
		{
			smallest=person.getMeasure();
			temp = person;
		}
	}
	return temp;
	}
}
	
	