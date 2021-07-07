//Adding class to the package
package Calculator;
import java.io.*;
class ScientificCalculator extends Calculate
{
	char Operator;
	Double dblNumber=new Double(0);
	ScientificCalculator()
	{
	}
	ScientificCalculator(double dblNumber,char Operator)
	{
		super(dblNumber,Operator);//calls super class constructor
		this.Operator=Operator;
		this.dblNumber=dblNumber;
	}
	public void Calc()throws java.io.IOException
	{
		boolean next;
	do
	{
		Double d=new Double(0);
		BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Operation:(Sine:s,Cosine:c,Tangent:t,Log:l");
		System.out.flush();
		String option=buffer.readLine();
		System.out.println("Enter a value:");
		System.out.flush();
		try
		{
			d=Double.valueOf(buffer.readLine());
		}
		catch(NumberFormatException e)
		{
			System.out.println("Enter number value:");
			System.exit(0);
		}
		if(option.length()==1)
		{
			ScientificCalculator sc=new ScientificCalculator(d,option.charAt(0));//class instance
			sc.doCalculation();//calls super class methods
			sc.getResult();
		}
		else
		{
			System.out.println("Operation not available.Please select any of the available options:");
		}
		System.out.println("Would like to calculate again(y/n)?");
		System.out.flush();
		char aa=(char)buffer.read();
		if((aa=='y')||(aa=='Y'))
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