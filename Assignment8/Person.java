import java.util.*;
class Person{
	String name;
	int age;
	Person(String n, int a){
		name=n;
		age=a;
	}
	void display(){
		System.out.println("Name = "+name);
		System.out.println("Age = "+age);
	}

	public static void main(String[] args){
		Scanner scn= new Scanner(System.in);

		System.out.print("Enter name: ");
		String n1=scn.nextLine();
		System.out.print("Enter age: ");
		int a1=scn.nextInt();
		scn.nextLine();

		System.out.print("Enter name: ");
		String n2=scn.nextLine();
		System.out.print("Enter age: ");
		int a2=scn.nextInt();

		Person p1 = new Person(n1,a1);
		Person p2 = new Person(n2,a2);

		p1.display();
		p2.display();
		scn.close();
	}
}