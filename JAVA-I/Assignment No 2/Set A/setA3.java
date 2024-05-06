//Assignment-2 SetA3
import java.util.Scanner;
import java.util.Arrays;
class setA3
{
	public static void main(String [] args)
	{
	  Scanner s=new Scanner(System.in);
	  int a[]=new int[5];
	  System.out.println("Enter Unsorted Array Element:");
	  for(int i=0;i<a.length;i++)
	  {
	     a[i]=s.nextInt();
	  }
	  Arrays.sort(a);
	  System.out.println("Sorted Array Element:");
	  for(int i=0;i<a.length;i++)
	  {
	    System.out.print(a[i]+ " ");
	  }
	}
}
/*
ty32@pc38:~/TYBCS-32/JAVA/Assignment No 2$ java setA3
Enter Unsorted Array Element:
48
69
78
21
10
Sorted Array Element: 10 21 48 69 78
*/
