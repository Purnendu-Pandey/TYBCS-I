import java.util.*;
class patient 
{
	String name;
	int id;
	int hrct;
	int oxylevel;
	patient(String name,int id,int hrct,int oxylevel)
	{
	   this.name=name;
           this.id=id;
           this.hrct=hrct;
           this.oxylevel=oxylevel;
	}
}
class setA1
{
	public static void main(String args[])
	{
	    	int n,i;
	  		Scanner sc=new Scanner(System.in);
   	    System.out.println("Enter The Number of Patient :");
       	n=sc.nextInt();
       	patient []a=new patient[n];
       	for(i=0;i<n;i++)
        {
     	    	System.out.println("Enter the Details of Patient :"+(i+1));
          	System.out.println("Enter the Name :");
       	  	String name=sc.next();
         		System.out.println("Enter the id :");
         		int id=sc.nextInt();
         		System.out.println("Enter the hrct report :");
						int hrct=sc.nextInt();
						System.out.println("Enter the oxygen level :");
            int oxylevel=sc.nextInt();
						a[i]=new patient(name,id,hrct,oxylevel);
	    	}
	    for(i=0;i<n;i++)
	    {
	    	if(a[i].oxylevel <95 && a[i].hrct >10)
	    	{
	    	    try
	    	    {
	    	        throw new NullPointerException();
	    	    }
	            catch(Exception e)
	            {
	            	System.out.println("Patient is covid positive and need to hosptalize");
	            }
	        }
	        else
	        {
	            System.out.println("Enter the Patient Name :"+a[i].name);
	            System.out.println("Enter the Patient Id :"+a[i].id);
	            System.out.println("Enter the Patient Hrct report :"+a[i].hrct);
	            System.out.println("Enter the Patient oxygen level :"+a[i].oxylevel);
	        }
	     }
	 }
}
/*
ty32@pc61:~/TYBCS-32/JAVA/Assignment No 4$ javac setA1.java
ty32@pc61:~/TYBCS-32/JAVA/Assignment No 4$ java setA1

Enter The Number of Patient :
2
Enter the Details of Patient :
1
Enter the Name : 
Rakesh
Enter the id :
1
Enter the hrct report : 
6
Enter the oxygen level : 
98       
Enter the Details of Patient :
2
Enter the Name : 
Suresh
Enter the id : 
2
Enter the hrct report : 
11
Enter the oxygen level :
93

Enter the Patient Name :Rakesh
Enter the Patient Id :1
Enter the Patient Hrct report :6
Enter the Patient oxygen level :98
Patient is covid positive and need to hosptalize
*/









































