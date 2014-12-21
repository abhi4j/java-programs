
	import java.io.*;
	import java.util.*;
	
	class num_test
	{
	
		public static void main(String args[])
		{
		int n = 1;
		
		for(int i=1;;i++)
		{
			n=i;
			int j = 0;
			for(j=1;j<10;j++)
		{
			if(n%(j+1)==j)
			{
				continue;
			}
			
			else
			break;
	
		}
			if(j==10)
			break;
		
			else
			continue;
		}
		
		System.out.println(n);
		}
	}
		
