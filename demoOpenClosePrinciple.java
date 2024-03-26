package week8;
import java.util.Scanner;
interface shape
{
	public short calculateArea();
}
class Rectangle implements shape
{
	short length;
	short width;
	Rectangle()
	{
		Scanner inScanner=new Scanner(System.in);
		System.out.println("enter the length of rectangle:");
		length=inScanner.nextShort();
		System.out.println("enter width of rectangle:");
		width=inScanner.nextShort();
	}
	public short calculateArea()
	{
		return (short) (length*width);
	}
}
class Circle implements shape
{
	public short radius;
	Circle()
	{
		Scanner inScanner=new Scanner(System.in);
		System.out.println("enter the radius of Circle:");
		radius=inScanner.nextShort();
	}
	public short calculateArea()
	{
		return (short) (3.147*radius*radius);
	}
}
class Square implements shape
{
	short side;
	Square()
	{
		Scanner inScanner=new Scanner(System.in);
		System.out.println("enter the side of square:");
		side=inScanner.nextShort();
		inScanner.close();		
	}
	public short calculateArea()
	{
		return (short) (side*side);
	}
}
class invokeShape
{
	public short calculateShapeArea(shape ishape)
	{
		return ishape.calculateArea();
	}
}
public class demoOpenClosePrinciple 
{
	public static void main(String args[])
	{
		invokeShape is = new invokeShape();
		Rectangle rect = new Rectangle();
		Circle cir = new Circle();
		Square sqr = new Square();
		short rarea = is.calculateShapeArea(rect);
		short carea = is.calculateShapeArea(cir);
		short sarea = is.calculateShapeArea(sqr);
		System.out.println("*********************************");
		System.out.println("Area of Rectangle is:"+rarea);
		System.out.println("Area of Circle is:"+carea);
		System.out.println("Area of Square is:"+sarea);
	}	
}
