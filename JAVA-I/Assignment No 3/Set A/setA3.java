import java.util.Scanner;
interface operation
{
 	void input();
 	void output();
}
class cylinder implements operation
{
	double r,h;
	public void input()
	{
	    Scanner s=new Scanner(System.in);
	    System.out.println("Enter the Radius:");
	    r=s.nextDouble();
	    System.out.println("Enter the Height:");
	    h=s.nextDouble();
	}
	public void output()
	{
	     double area=2*3.14*r*(r+h);
	     double volume=3.14*r*r*h;
	     System.out.println("Area of cylinder :"+area);
	     System.out.println("Volume of cylinder :"+volume);
	}
}
public class setA3
{
	public static void main(String[] args)
	{
	    cylinder c=new cylinder();
	    c.input();
	    c.output();
	 }
}
	    
/*
ty32@pc47:~/TYBCS-32/JAVA/Assignment No 3$ javac setA3.java
ty32@pc47:~/TYBCS-32/JAVA/Assignment No 3$ java setA3
Enter the Radius: 5
Enter the Height: 4
Area of cylinder :282.6
Volume of cylinder :314.0
*/     
	     
