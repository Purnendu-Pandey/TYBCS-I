//Assignment-2 SetA2
import java.io.*;
class setA2
{
	int roll_no;
 	String name;
 	float per;
 	static int count=0;
 	
 	public setA2()
 	{
  	  roll_no=0;
  	  name="";
  	  per=0.0f;
 	}
 	public setA2(int roll_no,String name,float per)
 	{
  	  this.roll_no=roll_no;
  	  this.name=name;
  	  this.per=per;
  	  count++;
 	}	
 	public static void count()
 	{
  	  System.out.println("Object "+(count)+" Created");
 	}
	public void display()
	{
  	   System.out.println("Roll Number: "+roll_no);
  	   System.out.println("Name: "+name);
  	   System.out.println("Percentage: "+per);
 	} 

	public static void main(String [] args)throws IOException
	{
          setA2 s1=new setA2(1,"Sankalp",87.56f);
  	  		setA2.count();
  	 			setA2 s2=new setA2(2,"Shobhit",90.51f);
 	  			setA2.count();
 	  			setA2 s3=new setA2(3,"Shreyash",77.34f);
 	  			setA2.count();
 	  			s1.display();
 	  			s2.display();
 	  			s3.display();  
}
}
/*
ty32@pc38:~/TYBCS-32/JAVA/Assignment No 2$ javac setA2.java
ty32@pc38:~/TYBCS-32/JAVA/Assignment No 2$ java setA2
Object 1 Created
Object 2 Created
Object 3 Created
Roll Number: 1
Name: Sankalp
Percentage: 87.56

Roll Number: 2
Name: Shobhit
Percentage: 90.51

Roll Number: 3
Name: Shreyash
Percentage: 77.34
*/

