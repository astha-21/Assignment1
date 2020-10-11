import java.util.*;

public class Question_13 {

	public static void main(String a[]){
		TreeSet<Emp> nameComparator = new TreeSet<Emp>(new MyNameComparator());
		nameComparator.add(new Emp("Astha",21));
		nameComparator.add(new Emp("Vaishali",25));
		nameComparator.add(new Emp("Riddhi",23));
		nameComparator.add(new Emp("Vanshika",24));
		nameComparator.add(new Emp("Vikhyat",22));
		for(Emp e:nameComparator){
			System.out.println(e);
		}
		TreeSet<Emp> ageComparator = new TreeSet<Emp>(new MyAgeComparator());
		ageComparator.add(new Emp("Astha",21));
		ageComparator.add(new Emp("Vaishali",25));
		ageComparator.add(new Emp("Riddhi",23));
		ageComparator.add(new Emp("Vanshika",24));
		ageComparator.add(new Emp("Vikhyat",22));
		for(Emp e:ageComparator){
			System.out.println(e);
		}
	}
}

class MyNameComparator implements Comparator<Emp>{

	@Override
	public int compare(Emp e1, Emp e2) {
		return e1.getName().compareTo(e2.getName());
	}
}	

class MyAgeComparator implements Comparator<Emp>{

	@Override
	public int compare(Emp e1, Emp e2) {
		if(e1.getAge() > e2.getAge()){
			return 1;
		} else {
			return -1;
		}
	}
}

class Emp{
	
	private String name;
	private int age;
	
	public Emp(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String toString(){
		return "Name: "+this.name+" Age: "+this.age;
	}
}