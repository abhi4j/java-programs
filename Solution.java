 import java.io.*;
 import java.util.*;
 import java.text.*;
 import java.math.*;
 import java.util.regex.*;

  public class Solution {
   public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       int T=Integer.parseInt(args[0]),num=0;
  for(int i=1;i<=T;i++)
 {
 int N=Integer.parseInt(args[i]);
 if(N%5!=0 && N%3!=0)
 System.out.println(-1);
else
 if(N%3==0 && N%5!=0)
{
for(int j=0;j<N;j++)
{
num+=5*(int)Math.pow(10,j);
}
}
else 
if(N%5==0 && N%3!=0)
{
for(int j=0;j<N;j++)
{
num+=3*(int)Math.pow(10,j);
}
}
/*else 
{
if(N%3==0 && N%5==0)
{
int a=0;
for(int k=N;k>0;k--)
{
if(k%3==0 && (N-k)%5==0)
a=k;
}
 int b=N-a;
for(int h=0;h<b;h++)
{
num+=3*(int)Math.pow(10,h);
}
for(int j=b;j<N;j++)
{
num+=5*(int)Math.pow(10,j);
}
}

}
        
    }*/
System.out.println(num);
}
}