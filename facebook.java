import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class facebook
{
	public static void main(String[] args)throws IOException

	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int l = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		String[] str = new String[2];
		int[] a = new int[2];
		for(int i = 0;i<n;i++)
		{
			str = br.readLine().split(" ");
			a[0]=Integer.parseInt(str[0]);
			a[1]=Integer.parseInt(str[1]);
			if(a[0]<l || a[1]<l)
				System.out.println("UPLOAD ANOTHER");
			else
				if(a[0] != a[1])
					System.out.println("CROP IT");
				else
					System.out.println("ACCEPTED");

		}
	}
}