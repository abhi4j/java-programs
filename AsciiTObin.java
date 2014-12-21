import java.io.*;
import java.util.*;
public class AsciiTObin
	{
	
	
	public static void main(String[] args){
	String a;
	a=args[0];
	char[] ch=a.toCharArray();
	for(int i=0;i<ch.length;i++){
	System.out.println(" "+ch[i]+" ");
	char b=ch[i];
	int s=b;
	do{
	int rem=s%2;
	System.out.print(" "+rem+" ");
        }
	while(s==1||s==0);
	System.out.println();
	}
	}
	}