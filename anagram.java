
	import java.io.*;
	import java.util.*;

	class anagram
	{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String s[] = str.split("\\s+");
		int n = s.length;
		String[] output = new String[n];
		int count = 0;
		boolean isfound = false;
		boolean match = false;														
		for(int i =0;i<n;i++)	
		{
			String a = (s[i]).toLowerCase();
			char[] ch = a.toCharArray();
			Arrays.sort(ch);
			for(int j = i+1; j<n;j++)
			{
				String b = (s[j]);
				char[] bh = b.toCharArray();
				Arrays.sort(bh);
				if(!a.equals(b) && Arrays.equals(ch,bh))
				{
					for(int k = 0;k<i;k++)
					{
						char[] ah = s[k].toLowerCase().toCharArray();
						Arrays.sort(ah);
						if(a.equalsIgnoreCase(s[k]) || Arrays.equals(ah, ch))
						match = true;
					}
			if(!match)
			{
				isfound = true;
				count++;
				if(count==1)
				System.out.print(a+" ");
				boolean smatch = false;
				for(int m = 0;m<j;m++)
				{
				if(b.equalsIgnoreCase(s[m]))
					smatch = true;
				}
				if(!smatch)
					System.out.print(b+" ");
 			}
		}
	}
		if(isfound)
		System.out.println();
		count = 0;
		isfound = false;
	}
	}
	

	}
