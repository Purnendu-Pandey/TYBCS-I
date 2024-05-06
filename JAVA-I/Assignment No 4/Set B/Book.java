//Set B1
import java.io.*;
import java.util.*;

class Book
{
     String name,id;
     int qty;
     double price,total;
     Book(String i,String n,String p,String q)
     {
             name=n;
             id=i;
             qty=Integer.parseInt(q);
             price=Double.parseDouble(p);
             total=qty*price;
     }
     public String toString()
     {
             System.out.println("name\t id\t qty\t price\t total");
             String s=name+"\t"+id+"\t"+qty+"\t"+price+"\t"+total;
             return(s);
     }
     public static void search(Book[]arr,int n) throws IOException
     {
             BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
             String s=br.readLine();
             for(int i=0;i<n;i++)
             {
                  if (arr[i].name.equals(s))
                  {
                       System.out.println(arr[i].toString());
                       return;
                  }
             }
             System.out.println("No records found");
      }
      public static void search_cost(Book[]arr,int n)
      {
             double max=0;
             int c=0;
             for(int i=0;i<n;i++)
             {
                  if(arr[i].price>max)
                  {
                        c=i;
                  }
             }
             System.out.println(arr[c].toString());
       }
       public static void main(String args[])throws IOException
       {
             String s,space=" ";
             int ch,i;
             BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
             System.out.println("Enter number of records :");
             int n=Integer.parseInt(b.readLine());
             System.out.println("Enter records :\n <id><name><price><qty>");
             File f=new File("Book.dat");
             RandomAccessFile rf=new RandomAccessFile(f,"rw");
             for(i=0;i<n;i++)
             {
                 s=b.readLine()+"\n";
                 rf.writeBytes(s);
             }
             rf.close();
             Book it[]=new Book[20];
             RandomAccessFile rf1=new RandomAccessFile(f,"r");
             for(i=0;i<n;i++)
             {
                  s=rf1.readLine();
                  StringTokenizer t=new StringTokenizer(s,space);
                  String id=new String(t.nextToken());
                  String name=new String(t.nextToken());
                  String price=new String(t.nextToken());
                  String qty=new String(t.nextToken());
                  it[i]=new Book(id,name,price,qty);
             }
             do
             {	
             	  System.out.println("Choose Any One Option");
                  System.out.println("1. Search for a specific book by name");
                  System.out.println("2. Display all books and total cost");
                  System.out.println("3. Exit");
                  ch=Integer.parseInt(b.readLine());
                  switch(ch)
                  {
                    case 1: System.out.println("Enter book name to be searched:");
                            Book.search(it,n);
                            break;
                               
                    case 2: for(i=0;i<n;i++)
                              System.out.println(it[i].toString());
                              break;
                              
                    case 3: break;
                         default: System.out.println("Invalid option");
                  }
             }
             while(ch!=3);
        }
}
/*
ty32@pc37:~/TYBCS-32/JAVA/Assignment No 4/Set B$ javac Book.java
ty32@pc37:~/TYBCS-32/JAVA/Assignment No 4/Set B$ java Book
Enter number of records : 2
Enter records :
<id><name><price><qty>
1 History 450 4
2 Geography 750 6

Choose Any One Option
1. Search for a specific book by name
2. Display all books and total cost
3. Exit
1
Enter book name to be searched:
History
name	 id      qty	price	 total
History	 1	  4	450.0	1800.0

Choose Any One Option
1. Search for a specific book by name
2. Display all books and total cost
3. Exit
2
name	 id	 qty	 price	 total
History	 1	  4	 450.0	1800.0
name	 id	 qty	 price	 total
Geography 2	  6	  750.0	4500.0
Choose Any One Option
1. Search for a specific book by name
2. Display all books and total cost
3. Exit
3
exit....
*/
