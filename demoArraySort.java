package week7;
import java.util.Scanner;
public class demoArraySort {
	public static void main(String[] args) {
			int array[]= new int[10];
			Scanner inScanner = new Scanner(System.in);
			System.out.println("Enter array size");
			int size = inScanner.nextInt();
			System.out.println("Enter array elements one by one");
			for(int i=0;i<size;i++)
				array[i]=inScanner.nextInt();
			System.out.println("Array elements before sorting are.....");
			for (int i=0;i<size;i++)
				System.out.print(array[i]+"\t");
			System.out.println();
			inScanner.close();
			for (int i=0;i<size-1;i++)
			{
				int minindex = i;
				for (int j=i+1;j<size;j++)
				{
					if(array[j] < array[minindex])
						minindex = j;
				}
				//swap(array[i] with minValue)
				int temporary=array[i]; 
				array[i]=array[minindex];
				array [minindex]=temporary;
			}
				System.out.println("Array elements after sorting are.....");
				for(int i=0;i<size;i++)
					System.out.print(array[i]+"\t");
	}
}
