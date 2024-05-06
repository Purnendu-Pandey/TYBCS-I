import java.util.Scanner;
abstract class staff
{
	protected int id;
	protected String name;
	public staff(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
}
class officestaff extends staff
{
	private String dept;
	officestaff(int id,String name,String dept)
	{
	   super(id,name);
	   this.dept=dept;
	}
	void display()
	{
	   System.out.println("ID :"+id);
	   System.out.println("Name:"+name);
	   System.out.println("Department:"+dept);	  
	}
}
class setA2
{
	public static void main(String[] args)
	{
	    Scanner s=new Scanner(System.in);
	    System.out.println("Enter the number Officestaff :");
	    int n=s.nextInt();
	    officestaff[]a=new officestaff[n];
	    
	    for(int i=0;i<n;i++)
	    {
	       System.out.println("Enter the Number of staff :"+(i+1));	    	 
	       
	       System.out.println("Enter the ID:");
	       int id=s.nextInt();
	       
	       System.out.println("Enter the Name :");
	       String name=s.next();
	        
	       System.out.println("Enter the Department:");
	       String dept=s.next();
	       a[i]=new officestaff(id,name,dept);
	     }
	     
	     for(int i=0;i<n;i++)
	     {
	        System.out.println("/n-------Office Staff Details-------/n");
	        a[i].display();
	        System.out.println();
	     }
         }
}
/*
ty32@pc47:~/TYBCS-32/JAVA/Assignment No 3$ java setA2
Enter the number Officestaff :2       
Enter the Number of staff :1
Enter the ID :45
Enter the Name : Sankalp
Enter the Department: HR
Enter the Number of staff :2
Enter the ID: 55
Enter the Name : Shobhit
Enter the Department: HR

Office Staff Details :
ID :45
Name:Sankalp
Department:HR

Office Staff Details :
ID :55
Name:Shobhit
Department:HR

*/
	       
