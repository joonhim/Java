import java.util.Arrays;

public class PersonTest {
public static void main(String[] args)
{
	Measurable[] persons = new Measurable[5];
	persons[0] = new Person("James", "Kirk", 27);
	persons[1] = new Person("Jean", "Picard", 35);
	persons[2] = new Person("Luke", "Skywalker", 22);
	persons[3] = new Person("Darth", "Vader", 40);
	persons[4] = new Person("Hikari", "Sulu", 21);
	
	Measurable smallest = Data.getSmallest(persons);
	
	System.out.println("Smallest age: " + smallest);
	System.out.println("Expected: 21");
	
	Arrays.sort(persons);
	
	System.out.println("Sorted by first names ");
	for (Measurable measurable: persons) {
		System.out.println(measurable.toString());
	}
}
}
