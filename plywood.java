	import java.io.*;
	import java.util.*;

	class plywood{
		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			int tc = sc.nextInt();

			for(int i = 1;i<=tc;i++)
			{
				int M  = sc.nextInt();
				int K = sc.nextInt();
				int count1 = 0;
				int count2 = 0;
				outerloop:
				while(true)
				{
					for(int j = 1;j<=5;j++)
					{
						
						if(j==M)
						{
							
							if(count2==K)
								break outerloop;
							else
								count2++;

						}
						count1++;
						
					}

					for(int l = 5;l>0;l--)
					{
						
						if(l==M)
						{
							
							if(count2==K)
								break outerloop;
							else
								count2++;
						}
						count1++;
						
					}
				}
			System.out.println(count1);
			}
		}
	}