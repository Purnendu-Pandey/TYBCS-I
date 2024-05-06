import java.util.Scanner;
@FunctionalInterface
interface fun
{
	int cal(int k);
}
public class setA4
{
	public static void main(String[] args)
	{
	    Scanner s=new Scanner(System.in);
	    System.out.println("Enter the Number:");
	    int x=s.nextInt();
	    fun c=(int k)->k*k*k;
	    int ans=c.cal(x);
	    System.out.println("Cube:"+ans);
	}
}
/*
ty32@pc47:~/TYBCS-32/JAVA/Assignment No 3$ javac setA4.java
ty32@pc47:~/TYBCS-32/JAVA/Assignment No 3$ java setA4
Enter the Number: 2
Cube:8
*/
