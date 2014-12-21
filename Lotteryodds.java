 import javax.swing.*;

public class Lotteryodds
{
	public static void main(String[] args)

	{
		String input = JOptionPane.showInputDialog("how many numbers do you want to draw?");
		int k = Integer.parseInt(input);
		
		input = JOptionPane.showInputDialog("what is the higest number you need?");
		int n =Integer.parseInt(input);

		int lotteryodds = 1;
		
		for(int i=1; i<=k; i++)
		lotteryodds = lotteryodds * (n-i+1) / i; 

		System.out.println("your odds are 1 in " + lotteryodds + " Goodluck");

		System.exit(0);		
	}
}