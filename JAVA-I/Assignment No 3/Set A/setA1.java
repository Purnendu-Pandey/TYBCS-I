import java.util.Scanner;
class continent
{
	String cname;
	continent(String cname)
	{
	   this.cname=cname;
	}
}
class country extends continent
{
	String coname;
	country(String cname,String coname)
	{
	   super(cname);
	   this.coname=coname;
	}
}
class state extends country
{	
	 String sname;
	 state(String cname,String coname,String sname)
	 {
	      super(cname,coname);
	      this.sname=sname;
	 }
}
class setA1
{
	public static void main(String[] args)
	{
	    Scanner s=new Scanner(System.in);
	    System.out.println("Enter the Continent name:");
	    String cname=s.nextLine();
	    
	    System.out.println("Enter the Country name:");
	    String coname=s.nextLine();
	    
	    System.out.println("Enter the state name:");
	    String sname=s.nextLine();
	    
	    System.out.println("Enter the palce name:");
	    String pname=s.nextLine();
	    
	    System.out.println("-----MultiHeritance-----:");
	    System.out.println("Continent:"+cname);
	    System.out.println("Contry:"+coname);	
	    System.out.println("State:"+sname);	
	    System.out.println("Place:"+pname);	
	 }
}
/*
ty32@pc47:~/TYBCS-32/JAVA/Assignment No 3$ javac setA1.java
ty32@pc47:~/TYBCS-32/JAVA/Assignment No 3$ java setA1
Enter the Continent name:
Asia
Enter the Country name:
India
Enter the state name:
Uttar Pradesh
Enter the palce name:
Varanasi
-----MultiHeritance-----:
Continent:Asia
Contry:India
State:Uttar Pradesh
Place:Varanasi
*/    
	    
	    
	    
	    
