package week3;
import java.util.Scanner;
public class calculateaverage {
	public static void main(String[] args) {
		float average=0.0f;
		Scanner sc=new Scanner(System.in);
		Integer cie1,cie2,cie3;
		
		/*Autobox*/
		System.out.println("enter the score of first internals:");
		cie1=Integer.parseInt(sc.next());
		System.out.println("enter the score of second internals:");
		cie2=Integer.parseInt(sc.next());
		System.out.println("enter the score of third internals:");
		cie3=Integer.parseInt(sc.next());
		
		/*unbox*/
		average=(float)(cie1+cie2+cie3)/3;
		System.out.println("The average internal score is" +average);
		sc.close();
	}
}
	
	
	
	 
	 

	
		