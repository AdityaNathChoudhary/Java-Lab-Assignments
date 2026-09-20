import java.util.*;
class Employee{
	static String name;
	static int hireYear, salary;
	void service(){
		int year=2026-hireYear;
		System.out.println("Name = "+name);
		System.out.println("Salary = "+salary);
		System.out.println("Years of service = "+year);
	}
	public static void main(String[] args){
		Scanner scn= new Scanner(System.in);
		System.out.print("Enter name: ");
		name=scn.nextLine();
		System.out.print("Enter salary: ");
		salary=scn.nextInt();
		System.out.print("Enter hire year: ");
		hireYear=scn.nextInt();
		Employee obj = new Employee();
		obj.service();
		scn.close();
	}
}