import java.io.*;
import java.util.*;
class setA2
{
      public static void main(String args[]) throws IOException
      {
             FileReader f=new FileReader("sample.txt");
             Scanner sc=new Scanner(f);
             String c,c2;
             while (sc.hasNext())
             {
                    StringBuilder c1=new StringBuilder();
                    c=sc.nextLine();
                    System.out.println("Original String : "+c);
                    c2=c.toUpperCase();
                    c1.append(c2);
                    c1.reverse();
                    System.out.println("Reverse String :"+c1);
             }
             f.close();
      }
}
/*
ty32@pc37:~/TYBCS-32/JAVA/Assignment No 4/Set A$ javac setA2.java
ty32@pc37:~/TYBCS-32/JAVA/Assignment No 4/Set A$ java setA2
Original String : hello world
Reverse String :DLROW OLLEH
*/
