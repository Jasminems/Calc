/**Main Class**/
//Adding class to the package
package Calculator;
import java.io.*;
class UseCalculator 
{
	public static void main(String[] args) throws java.io.IOException
	{
		BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Select the Calculator:Basic-B or Scientific:S");
		System.out.flush();
		String option=buffer.readLine();
		if(option.length()==1)
		{
			if(option.equals("B")||option.equals("b"))
			{
				Calculator c=new Calculator();//calling base calculator
				c.Calc();
			}
			else if(option.equals("S")||option.equals("s"))
			{
				ScientificCalculator sc=new ScientificCalculator();//calling scientific calculator
						sc.Calc();
			}
			else
			{
				System.out.println("Enter option 'B' or 'S' ");
				System.out.flush();
			}
		}
		else
		{
			System.out.println("Enter option 'B' or 'S' ");
			System.exit(1);
		}
	}
}