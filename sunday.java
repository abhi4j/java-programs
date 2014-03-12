 import java.io.*;
class sunday
{
public static void main(String args[])
{
int a=3;
int b,count=0,f=0;
for(int i=1901;i<2000;i++)
{
	for(int j=1;j<13;j++)
	{
		if(j==1||j==3||j==5||j==7||j==8||j==10||j==12)
		{
			b=a+2;
			if(a==1)
			{
                         count++;
                    System.out.println(i+"  "+j);
                         }
			a=b+1;
			if(a>7)
			a=a-7;
		}
		if(j==4||j==6||j==9||j==11)
		{
			b=a+1;
			if(a==1)
			{count++;
			System.out.println(i+"  "+j);}
			a=b+1;
			if(a>7)
			a=a-7;
		}
		if(j==2)
		{
			if(f==i%4)
			b=a;
		else
			b=a+6;
			if(a==1)
			{count++;
               System.out.println(i+"  "+j);
                      }
			a=b+1;
			if(a>7)
			a=a-7;
		}
}
}
if(a==1)
count++;
System.out.println(count);
}
}