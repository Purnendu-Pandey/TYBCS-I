//Assignment-2 SetA4
import java.util.Scanner;
class setA4
{
	public static void main(String [] args)
	{
	   int len;
	   String fname,mname,lname;
	   Scanner s=new Scanner(System.in);
	   System.out.println("Enter First Name  :");
	   fname=s.next();
	   System.out.println("Enter Middle Name  :");
	   mname=s.next();
	   System.out.println("Enter Last Name  :");
	   lname=s.next();
	   
	   len=mname.length();
	   String f=mname.substring(0,1);
	   String l=mname.substring(1,len);
	   f=f.toUpperCase();
	   mname=f+l;
	   System.out.println("Last Name  :"+lname);
	   System.out.println("First Name  :"+fname);
	   System.out.println("Middle Name  :"+mname);
	   System.out.println();
	   }
}
/*
ty32@pc38:~/TYBCS-32/JAVA/Assignment No 2$ java setA4
Enter First Name  :
purnendu
Enter Middle Name  :
jiut
Enter Last Name  :
pandey
Last Name  :pandey
First Name  :purnendu
Middle Name  :Jiut
*/
