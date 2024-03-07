package autobox_unbox;
import java.util.Scanner;
public class calculateAverage2 {
	public static void main(String[] args) {
		float average = 0.0f;
		Scanner sc = new Scanner(System.in);
		Integer cie1,cie2,cie3;
			System.out.println("enter score of first internal:");
			cie1=Integer.parseInt(sc.next());
			System.out.println("enter score of first internal:");
			cie2=Integer.parseInt(sc.next());
			System.out.println("enter score of first internal:");
			cie3=Integer.parseInt(sc.next());
			average = (float)(cie1+cie2+cie3)/3;
			System.out.println("The average internal score is" +average);
			sc.close();

}
}