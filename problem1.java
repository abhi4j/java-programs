import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

	class problem1
	{
		public static void main(String[] args)throws IOException
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int n = Integer.parseInt(br.readLine());

			for(int j = 0;j<n;j++)
			{
				int count = 0;
				String s = br.readLine();
				char[] str = s.toCharArray();
				for(int i = 4;i<str.length-4;i++)
				{
					if(str[i]=='a')
					{}
					else
					{
						if(str[i]=='e')
						{}
						else
						{
							if(str[i]=='i')
							{}
							else
							{
								if(str[i]=='o')
								{}
								else
								{
									if(str[i]=='u')
									{}
									else
									{
										count++;
									}
								}
							}
						}
					}
				}
				System.out.println((count+4)+"/"+str.length);
			}
		}
	}