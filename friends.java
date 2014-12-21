import java.util.*;
import java.io.*;

class friends
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] even= new int[m];
		int [] odd = new int[m];
		int count1= 0;
		int count2 = 0;
		boolean flag = false;

		for(int i =0;i<m*2;i++)
		{
			if(i%2==0)
			{
			even[count1] = sc.nextInt();
			count1++;
		}
		else
		{
			odd[count2] = sc.nextInt();
			count2++;
		}
		}

		for(int i = 0;i<even.length;i++)
		{
			int com = even[i];
			ArrayList<Integer> ar = new ArrayList<Integer>();
			ar.add(odd[i]);
			for(int j = i+2;j<even.length;j++)
			{
				if(even[j]==com)
					ar.add(odd[j]);

			}

			for(int k = 0;k<ar.size();k++)
			{
				for(int l = 0;l<even.length;l++)
				{
					if(even[l]==ar.get(k))
					{
						int eom = odd[l];
						for(int q =k+1;q<ar.size();q++)
						{
							if(ar.get(q)==eom)
								flag = false;
							else
								flag = true;
						}
					}
				}
			}
		}

		if(flag)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}