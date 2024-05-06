import java.util.Scanner;
abstract class order
{
	int id;
	String desp;
	order(int id,String desp)
	{
		this.id=id;
		this.desp=desp;
	}
	abstract void display();
}
class purchesorder extends order
{
    String cname;
    purchesorder(int id,String desp,String cname)
    {
        super(id,desp);
		this.cname=cname;
	}	
	
    void display()
    {
		System.out.println("-----DETAIL FOR PURCHESORDER-----");
        System.out.println("ID ="+id);
		System.out.println("DESCRIPTION ="+desp);
		System.out.println("COSTOMER NAME ="+cname);
		System.out.println();
	}		
	
}
class salesorder extends order
{
    String vname;
    salesorder(int id,String desp,String vname)
    {
        super(id,desp);
		this.vname=vname;
	}	
    void display()
    {
		System.out.println("-----DETAIL FOR SALESORDER-----");
    System.out.println("ID ="+id);
		System.out.println("DESCRIPTION ="+desp);
		System.out.println("VANDOR NAME ="+vname);
		System.out.println();
	}		
	
}
public class setB1
{
	public static void main(String[] args)
	{
		int i;
		Scanner s=new Scanner(System.in);
		purchesorder []pur=new purchesorder[3];
		salesorder []sal=new salesorder[3];
		for(i=0;i<3;i++)
	    {
          System.out.println("Enter the Detail for purches order : "+(i+1));
					System.out.println("Enter id : ");
					int id=s.nextInt();
					System.out.println("Enter description : ");
					String desp=s.next();
					System.out.println("Enter name : ");
					String cname=s.next();
          pur[i]=new purchesorder(id,desp,cname);
			}	
      for(i=0;i<3;i++)
	    {
          System.out.println("Enter the Detail for Sales order : "+(i+1));
					System.out.println("Enter id : ");
					int id=s.nextInt();
					System.out.println("Enter description : ");
					String desp=s.next();
					System.out.println("Enter name : ");
					String vname=s.next();
          sal[i]=new salesorder(id,desp,vname);
			}	
      for(i=0;i<3;i++)	
			{
					pur[i].display();
					sal[i].display();		
			}
		
	}
}
/*
ty32@pc38:~/TYBCS-32/JAVA/Assignment No 3$ javac setB1.java
ty32@pc38:~/TYBCS-32/JAVA/Assignment No 3$ java setB1

Enter the Detail for purches order : 1
Enter id : 18
Enter description : Book
Enter name : Prakesh


Enter the Detail for purches order : 2
Enter id : 20
Enter description : Book
Enter name : Ankit


Enter the Detail for purches order : 3
Enter id : 25
Enter description : Book
Enter name : Sagar


Enter the Detail for Sales order : 1
Enter id : 100
Enter description : Notebook
Enter name : Sankalp


Enter the Detail for Sales order : 2
Enter id : 44
Enter description : Notebook
Enter name : Aniket


Enter the Detail for Sales order : 3
Enter id : 12      
Enter description : Notebook
Enter name : Manas


-----DETAIL FOR PURCHESORDER-----
ID =18
DESCRIPTION =Book
COSTOMER NAME =Prakesh


-----DETAIL FOR SALESORDER-----
ID =100
DESCRIPTION =Notebook
VANDOR NAME =Sankalp


-----DETAIL FOR PURCHESORDER-----
ID =20
DESCRIPTION =Book
COSTOMER NAME =Ankit


-----DETAIL FOR SALESORDER-----
ID =44
DESCRIPTION =Notebook
VANDOR NAME =Aniket


-----DETAIL FOR PURCHESORDER-----
ID =25
DESCRIPTION =Book
COSTOMER NAME =Sagar


-----DETAIL FOR SALESORDER-----
ID =12
DESCRIPTION =Notebook
VANDOR NAME =Manas
*/

