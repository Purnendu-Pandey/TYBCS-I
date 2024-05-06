import java.io.*;
import java.util.*;
import java.io.File;
class setA3
{
      public static void main(String args[]) throws IOException
      {
             Scanner sc=new Scanner(System.in);
             System.out.print("Source file name :\n");
             String file1=sc.next();
             System.out.print("Destination file name :\n");
             String file2=sc.next();
             FileReader fin=new FileReader(file1);
             FileWriter fout=new FileWriter(file2,true);
             int c;
             while ((c=fin.read()) !=-1)
             {
                    fout.write(c);
             }
             System.out.println("copy finish...");
             fin.close();
             fout.close();
      }
}
/*
ty32@pc37:~/TYBCS-32/JAVA/Assignment No 4/Set A$ javac setA3.java
ty32@pc37:~/TYBCS-32/JAVA/Assignment No 4/Set A$ java setA3
Source file name :
file1.txt
Destination file name :
file2.txt
copy finish...
for the output check file2.txt
*/
