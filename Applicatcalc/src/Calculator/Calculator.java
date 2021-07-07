//Adding class to the package
package Calculator;
import java.io.*;
class Calculator 
{
	public void Calc() throws java.io.IOException
	{
		boolean next;
		do
		{
			Integer iFirstNumber=new Integer(0);
			Integer iSecondNumber=new Integer(0);
			BufferedReader buffer= new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter First Number:");
			System.out.flush();
			try
			{
				iFirstNumber=Integer.parseInt(buffer.readLine());
			}
			catch(NumberFormatException e)
			{
				System.out.println("Please provide Number value");
				System.exit(0);
			}
			System.out.println("Enter the Operator:(Add:+,Minus:-,Product:*,Divide:/):");
			System.out.flush();
			String option=buffer.readLine();
			System.out.println("Enter Second Number:");
			System.out.flush();
			try
			{
				iSecondNumber=Integer.parseInt(buffer.readLine(),10);
			}
			catch(NumberFormatException e)
			{
				System.out.println("Please provide Number value");
				System.exit(0);
			}
			if(option.length()==1)
			{
				Calculate c=new Calculate(iFirstNumber,option.charAt(0),iSecondNumber);
				c.doCalculation();
				c.getResult();
			}
			else
			{
				System.out.println("Operation not available.Please select any of the available options");
			}
				System.out.println("Would like to calculate again(y/n)?");
				System.out.flush();
				char response=(char)buffer.read();
				if((response=='y')||(response=='Y'))
				{
					next=false;
				}
				else
				{
					next=true;
				}
			}while(!next);
}
}