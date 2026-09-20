import java.util.*;
class Movie{
	String title, director, actor;
	String[] review = new String[100];
	int n=0;
	Movie(String t, String d, String a){
		title=t;
		director=d;
		actor=a;
	}
	void addReview(String r){
		review[n]=r;
		n++;
	}
	void display(){
		System.out.println();
		for(int i=0;i<n;i++){
			System.out.println("Title = "+title);
			System.out.println("Actor = "+actor);
			System.out.println("Director = "+director);
			System.out.println("Review = "+review[i]);
		}
	}
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter title: ");
		String title=scn.nextLine();
		System.out.print("Enter director: ");
		String director=scn.nextLine();
		System.out.print("Enter actor: ");
		String actor=scn.nextLine();
		System.out.print("Add a review: ");
		String review=scn.nextLine();
		Movie obj = new Movie(title, director, actor);
		obj.addReview(review);
		obj.display();
		scn.close();
	}
}