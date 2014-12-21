import java.io.*;
import java.util.*;
	class zombie
	{
		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			int tc = sc.nextInt();

			for(int i = 0;i< tc;i++)
			{
				int n = sc.nextInt();
				int t= sc.nextInt();
				int e[] = new int[n];
				boolean move = false;

				for(int j = 0;j<n;j++)
				{
					e[j] = sc.nextInt();
				}

				int p = sc.nextInt();
				int d = sc.nextInt();
				
				for(int k = 0;k<n;k++)
				{
					if(t==0)
						break;
					t=t-1;
					if(p>=e[k])
					{
						int w = p-e[k];
						p = p+w;
						move = true;
						
					}

					else
				
							move = false;
				}
				if(p>=d)
					System.out.println("YES");
				else
					System.out.println("NO");
			}
		}
	}