
public class Person implements Measurable, Comparable<Person>{
	String frName;
	String lnName;
	double age;
	
	public Person()
	{
		frName = "";
		lnName = "";
		age = 0;
	}
public Person(String first, String last, int a)
{
	frName = first;
	lnName = last;
	age = a;
}
public String getFirst() {
	return frName;
}
public void setFirst(String frName) {
	this.frName = frName;
}
public String getLast() {
	return lnName;
}
public void setLast(String lnName) {
	this.lnName = lnName;
}
public int getAge(int age) {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

@Override
public double getMeasure() {
	//TODO auto -Generated method stub
	return age;
}
public int compareTo(Person o) {
	return this.getFirst().compareTo(o.getFirst());
}

}
