package Encapsulation;

public class Person {
	private String name;
	private int age;
	private String country;
	
	public void setData(String name,int age, String country) {
		this.name=name;
		this.age=age;
		this.country=country;
	}
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getCountry() {
		return country;
	}
}
class PersonMain{
	public static void main(String args[]) {
		Person p1=new Person();
		Person p2=new Person();

		p1.setData("sravani",23,"India");
		p2.setData("madhu",34,"Island" );
		
		System.out.println("name : "+p1.getName());
		System.out.println("age : "+p1.getAge());
		System.out.println("Country : "+p1.getCountry());
		
		System.out.println("name : "+p2.getName());
		System.out.println("age : "+p2.getAge());
		System.out.println("Country :" +p2.getCountry());
	}
}