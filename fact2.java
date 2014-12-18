import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.math.BigInteger;

class fact2
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		
		for(int i = 0;i<tc;i++)
		{
			BigInteger fact = new BigInteger("1");
			int c = Integer.parseInt(br.readLine());
			for(int j = c;j>0;j--)
			{
				fact = fact.multiply(BigInteger.valueOf(j));
			}

		System.out.println(fact);
		}
	}
}