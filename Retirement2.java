 import java.text.*;
 import javax.swing.*;

public class Retirement2
    {
	public static void main(String[] args)
		{
			//Total goal of balance.
			String input = JOptionPane.showInputDialog("How many money you need to retire?");
			double goal = Double.parseDouble(input);

			//Total balance in one year.
			input = JOptionPane.showInputDialog("HOw much money can you contribute in one year?");
			double payment = Double.parseDouble(input);

			//Interestrate as input.
			input = JOptionPane.showInputDialog("Enter the interestrate:");
			double intrate = Double.parseDouble(input);
			
			double balance=0;
			int year=0;
			
			NumberFormat formatter = NumberFormat.getCurrencyInstance (); 

			// Update the balance while user is not ready to retire.
                    	do
			{
				balance +=payment;
				double interest = balance * intrate / 100;
				balance += interest ;
				year++;
				
				System.out.println("After " + year
						    + " year our balance is " 
					            + formatter.format(balance));

				input = JOptionPane.showInputDialog("Do you like to retire?? (Y/N)");
				input = input.toUpperCase();
			}
			while(input.equals("N"));				

			System.exit(0);
		}	
    }
