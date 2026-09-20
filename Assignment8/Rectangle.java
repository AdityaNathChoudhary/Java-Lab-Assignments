import java.util.*;
class Rectangle{
	static int width, height;
	void area(){
		System.out.println("Area = "+(width*height));
	}
	void perimeter(){
		System.out.println("Perimeter = "+(2*(width+height)));
	}
	
	public static void main(String[] args){
		Scanner scn= new Scanner(System.in);
		System.out.print("Enter width: ");
		width=scn.nextInt();
		System.out.print("Enter height: ");
		height=scn.nextInt();
		Rectangle obj = new Rectangle();
		obj.area();
		obj.perimeter();
		scn.close();
	}
}