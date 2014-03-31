import java.io.*;
import java.util.*;

	class universe
	{
		public static void main(String[] args)
		{
		Scanner sc=new Scanner(System.in);
		
		
		List<Integer> a=new ArrayList<Integer>();
		
		do
		{
		System.out.println("Enter the number:");
		a.add(sc.nextInt());
		}while(sc.nextInt()!=42);
		
		
		for(int i=0;i<a.size();i++)
		{
			for(int j=i+1;j<(a.size()-1-i);j++)
			{
			int temp=a.get(i);
			if(a.get(j)<a.get(i))
			{
			a.set(i,a.get(j));
			a.set(j,temp);
			}
			}
		}
	for(int i: a)
		{
		System.out.println(a.get(i));
	}
	}
	}
		