package autobox_unbox;
import java.util.Scanner;
public class calculateAverage {
	public static void main(String[] args) {
		float sum = 0.0f;
		Scanner sc = new Scanner(System.in);
		Integer cie[]=new Integer[3];
		for(int i=0; i<3; i++) {
			System.out.println("enter score of internal:" +(i+1));
			cie[i]=Integer.parseInt(sc.next());
			sum=sum+cie[i];
	}
	System.out.println("The average internal score is" +(sum/3));
	sc.close();

}
}