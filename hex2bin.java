import java.util.*;
import java.io.*;
class hex2bin
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a decimal number:");
int c=sc.nextInt();
String temp=null;
do{
int p=c%2;
temp+=(String)(String.valueOf(p));
}while(c==1||c==0);
String bin=temp;
System.out.println("the binary convertion of  "+c+" is "+bin);
}
}