//SET B3
import java.io.*;
import java.util.*;
class InvalidDateException extends Exception
{
      InvalidDateException()
      {
             System.out.println("Invalid Date");
      }
}
class MyDate
{
      int day,mon,yr;
      void accept(int d,int m,int y)
      {
           day=d;
           mon=m;
           yr=y;
      }
      void display()
      {
           System.out.println("Date is valid : "+ day+ "/"+ mon+ "/"+ yr);
      }
}
class Date
{
      public static void main(String args[]) throws Exception
      {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Date : dd mm yyyy");
            int day=sc.nextInt();
            int mon=sc.nextInt();
            int yr=sc.nextInt();
            int flag=0;
            try
            {
                 if(mon<=0 || mon>12)
                      throw new InvalidDateException();
                 else
                 {
                      if(mon==1 || mon==3 || mon==5 || mon==7 || mon==8 || mon==10 || mon==12)
                      {
                            if(day>=1 && day<=31)
                                 flag =1;
                            else
                                 throw new InvalidDateException();
                      }
                      else if(mon==2)
                      {
                            if(yr%4==0)
                            {
                                 if(day>=1 && day<=29)
                                     flag=1;
                                 else
                                     throw new InvalidDateException();
                            }
                            else
                            {
                                  if(day>=1 && day<=28)
                                       flag=1;
                                  else
                                     throw new InvalidDateException();
                            }
                       }   
                            else
                            {
                                  if(mon==4 || mon==6 || mon==9 || mon==11)
                                  {
                                        if(day>=1 && day<=30)
                                             flag=1;
                                        else
                                             throw new InvalidDateException();
                                  }
                            }
                      }
                      if(flag==1)
                      {
                            MyDate dt=new MyDate();
                            dt.accept(day,mon,yr);
                            dt.display();
                      }
                 }
                 catch(InvalidDateException mm)
                 {
                        System.out.println("Invalid Date");
                 }
         }
}
/*
ty32@pc37:~/TYBCS-32/JAVA/Assignment No 4/Set B$ javac Date.java
ty32@pc37:~/TYBCS-32/JAVA/Assignment No 4/Set B$ java Date
Enter Date : dd mm yyyy
09 12 2003
Date is valid : 9/12/2003

Enter Date : dd mm yyyy
85 12 2003
Invalid Date
*/

