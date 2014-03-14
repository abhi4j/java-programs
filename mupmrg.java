import java.io.*;
import java.util.*;

	class mupmrg
{

	Scanner sc=new Scanner(System.in);
	public void namesake()
{
try
{
	for(int i=0;i<12;i++)
{

	System.out.println("Please enter your name!!");

	String a=sc.nextLine();

	System.out.println("Enter your age!!");

	int b=sc.nextInt();
	
	if(b<18)
	System.out.println("Sorry"+" "+a+" "+"you are not eligible to view this movie!!!watch it when you enter your youth!!");
	else
	System.out.println("Congratulations"+" "+a+" "+"you are eigible to watch the movie ...hope you enjoy it.!!");

}
}

catch(Exception e){
System.out.println("You entered a wrong credential;"+e);
}

}

	public static void main(String args[])
{
	mupmrg nn=new mupmrg();

	nn.namesake();


}
}
