import java.io.*;
import java.lang.*;

class enc
{
public static void main(String args[]) throws IOException
{	
	String str;
	int i,n;
	double[] rnd;
	double[] a;
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	System.out.print("Enter String:");
	str=br.readLine();
	rnd = new double[str.length()];
	a=new double[str.length()];
	for(i=0;i<str.length();i++)
	{
		char ch=str.charAt(i);
		rnd[i]=(Math.round(Math.random()*10));
		a[i]=(int)ch+rnd[i];
	}
	System.out.print("Encrypted string:");
	for(i=0;i<str.length();i++)
	{
	System.out.print( (char)a[i]);
	}
	System.out.print("\n");
		for(i=0;i<str.length();i++)
{
	a[i]=a[i]-rnd[i];		
}
	System.out.print("Decrypted String:");
	for(i=0;i<str.length();i++)
{
	System.out.print((char)a[i]);
}
}
}
		
		