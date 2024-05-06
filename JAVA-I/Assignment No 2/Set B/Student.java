//Assignment-2 SetB1
import java.util.Scanner;
class Symark
{
	int comp;
	int math;
	int ele;
	Symark(int comp,int mathj,int ele)
	{
	  this.comp=comp;
	  this.math=math;
	  this.ele=ele;
	}
}
class Tymark
{
  	int theory;
  	int practical;
  	Tymark(int theory,int practical)
  	{
  	   this.theory=theory;
           this.practical=practical;
        }
}
public class Student
{
 	int roll;
 	String name="";
 	Symark symark;
 	Tymark tymark;
 	student(int roll,String name,Symark symark,Tymark tymark)
 	{
 	   this.roll=roll;
 	   this.name=name;
 	   this.symark=symark;
 	   this.tymark=tymark;
 	}
 
 int totalmark()
 {
 	return symark.comp+symark.math+symark.ele+tymark.theory+tymark.practical;
 }
 char calculate()
 {
 	int totalmark=totalmark();
 	if(totalmark>=70)
 	{
 	    return 'A';
 	}
 	if(totalmark>=60)
 	{
 	    return 'B';
 	}
 	if(totalmark>=50)
 	{
 	    return 'c';
 	}
 	if(totalmark>=50)
 	{
 	    return 'D';
 	}
 	if(totalmark>=40)
 	{
 	   return 'D';
 	}
 	else
 	{
 	   return 'F';
 	}
 }   
 void display()
 {
 	char grade=calculate();
 	System.out.println("Roll no:"+roll);
	System.out.println("Name :"+name);
	System.out.println("Total marls :"+totalmark());
	System.out.println("Grade :"+grade);
	System.out.println();
}
public static void main(String[] args)
{
	int i,n;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The No Of Student :");
	n=sc.nextInt();
	for(i=0;i<n;i++)
	{
	   System.out.print("Enter the detail of student :"+(i+1)+":");
	   System.out.println("Roll no:");
	   int roll=sc.nextInt();
	   System.out.println("Name of the student :");
	   String name=sc.next();
	   System.out.println("Enter SYMARK(COMPUTER,MATHS,ELECTRONICS):");
	   int comp=sc.nextInt();
	   int math=sc.nextInt();
	   int ele=sc.nextInt();
	   Symark symark=new Symark(comp,math,ele);
	   System.out.println("Enter TYMARK(THEORY,PRACTICAL):");
	   int theory=sc.nextInt();
	   int practical=sc.nextInt();
	   Tymark tymark=new Tymark(theory,practical);
	   student st=new student(roll,name,symark,tymark);
	   st.display();
	   System.out.println();
	}
}
}	 
/*
ty32@pc38:~/TYBCS-32/JAVA/Assignment No 2$ javac Student.java
ty32@pc38:~/TYBCS-32/JAVA/Assignment No 2$ java Student
Enter The No Of Student : 2
Enter the detail of student :1
Roll no: 44
Name of the student :Sankalp
Enter SYMARK(COMPUTER,MATHS,ELECTRONICS):
82
72
78
Enter TYMARK(THEORY,PRACTICAL):
82
74
Roll no: 44
Name :Sankalp
Total marls :316
Grade :A


Enter the detail of student :2
Roll no: 32
Name of the student :Raj 
Enter SYMARK(COMPUTER,MATHS,ELECTRONICS):
87
76
80
Enter TYMARK(THEORY,PRACTICAL):
75
86
Roll no:32
Name :Raj
Total marls :328
Grade :A
*/
	   
