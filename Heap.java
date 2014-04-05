import java.awt.*;
import java.io.*;
import java.lang.*;

class Heap
{
   public static void main(String args[])throws IOException
     {
       DataInputStream d=new DataInputStream(System.in);
       System.out.print("enter the no. of elements : ");
       int n = Integer.parseInt(d.readLine()); 
       int a[]=new int[n];
       for(int i=0;i<n;i++)
           {
              System.out.print("enter the element : ");
              a[i]=Integer.parseInt(d.readLine());
           }
        Heapsort(a,n);
        display(a,n);
     }
    static void Heapsort(int a[],int n)
      {
          int key,s,f,ele=0,i;
          for(i=1;i<n;i++)
              {
        	  ele=a[i];
        	  s=i;
                  f=(s-1)/2;
               while(s>0 && a[f]<ele)
                     {
                        a[s]=a[f];
                        s=f;
                        f=(s-1)/2;
                    }
                  a[s]=ele;
             } 
          for(i=n-1;i>0;i--)
              {
                 key=a[i];
                 a[i]=a[0];
                 f=0;
                 if(i==1)
                    s=-1;
                 else
                    s=1;
                 if(i>2 && a[2]>a[1])
                    s=2;
                 while(s>0 && ele<a[s])
                    {
                       a[f]=a[s];
                       f=s;
                       s=2*f+1;
                       if(s+1<=i-1 && a[s+1]>a[s])
                          s=s+1;
                       if(s>i-1)
                          s=-1;
                     }
                  a[f]=key;
               }
         }	
 static void display(int a[],int n)
  {                                      
      System.out.println("sorted array=");
      for(int i=0;i<n;i++)
          {
             System.out.println(a[i]);
          }
  }
}
