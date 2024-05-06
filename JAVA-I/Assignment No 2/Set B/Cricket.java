//Assignameent-2 SetB2
import java.io.*;
public class Cricket
{
       String name;
       public int ing, tofnotout, totalruns;
       public float batavg;
       public Cricket()
       {
              name=null;
              ing=0;
              tofnotout=0;
              totalruns=0;
              batavg=0;
  
       }
       public void get() throws IOException
       {
              BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
              System.out.println("Enter the name :");
              name=br.readLine();
              System.out.println("No Of Ings :");
              ing=Integer.parseInt(br.readLine());
              System.out.println("No of times notout :");
              tofnotout=Integer.parseInt(br.readLine());
              System.out.println("Total runs :");
              totalruns=Integer.parseInt(br.readLine());
             
       }
       public void put()
       {
              System.out.println("Name="+name);
              System.out.println("No of ings="+ing);
              System.out.println("No times notout="+tofnotout);
              System.out.println("Total runs="+totalruns);
              System.out.println("Batting avg="+batavg);
       }
       static void avg(int n, Cricket c[])
       {
              try
              {
                 for(int i=0;i<n;i++)
                 {
                    c[i].batavg=c[i].totalruns/c[i].ing;
                 }
              }catch(ArithmeticException e)
              {
                System.out.println("Invalid arg");
              }
       }
       static void sort(int n, Cricket c[])
       {
              String temp1;
              int temp2,temp3,temp4;
              float temp5;
              for(int i=0;i<n;i++)
              {
                  for(int j=i+1;j<n;j++)
                  {
                     if(c[i].batavg<c[j].batavg)
                     {
                        temp1=c[i].name;
                        c[i].name=c[j].name;
                        c[j].name=temp1;
                        temp2=c[i].ing;
                        c[i].ing=c[j].ing;
                        c[j].ing=temp2;
                        temp3=c[i].tofnotout;
                        c[i].tofnotout=c[j].tofnotout;
                        c[j].tofnotout=temp3;
                        temp4=c[i].totalruns;
                        c[i].totalruns=c[j].totalruns;
                        c[j].totalruns=temp4;
                        temp5=c[i].batavg;
                        c[i].batavg=c[j].batavg;
                        c[j].batavg=temp5;
                     }
                   }
              } 
        }
         public static void main(String args[])throws IOException
         {
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter The Number Of Players:");
                int n=Integer.parseInt(br.readLine());
                Cricket c[]=new Cricket[n];
                for(int i=0;i<n;i++)
                {
                    c[i]=new Cricket();
                    c[i].get();
                }
                Cricket.avg(n,c);
                Cricket.sort(n, c);
                for(int i=0;i<n;i++)
                {
                   c[i].put();
                }
 
         }
}
/*
ty32@pc38:~/TYBCS-32/JAVA/Assignnt No 2$ javac Cricket.java
ty32@pc38:~/TYBCS-32/JAVA/Assignent No 2$ java Cricket
Enter The Number Of Players: 4
Enter the name :MS Dhoni  
No Of Ings :279
No of times notout :213
Total runs :78450
Enter the name :
Suresh Raina
No Of Ings : 210
No of times notout : 134
Total runs : 68488
Enter the name : Virat Kholi
No Of Ings : 265
No of times notout : 120
Total runs : 45210
Enter the name : Rishab Pant
No Of Ings :154
No of times notout : 92
Total runs : 15420

Name=Suresh Raina
No of ings=210
No times notout=134
Total runs=68488
Batting avg=326.0

Name=MS Dhoni
No of ings=279
No times notout=213
Total runs=78450
Batting avg=281.0

Name=Virat Kholi
No of ings=265
No times notout=120
Total runs=45210
Batting avg=170.0

Name=Rishab Pant
No of ings=154
No times notout=92
Total runs=15420
Batting avg=100.0

*/

