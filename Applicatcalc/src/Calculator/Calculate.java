//Adding class to the package
package Calculator;
class Calculate
{
	private char Operator;
	private int iFNum, iSNum;
	private Double dblNumber=new Double(0);
	private Double dblResult=new Double(0);
	private int iResult=0;
	private boolean typeDouble=false;
	private boolean typeInt=false;
	public Calculate()
	{
	}
	public Calculate(double dblNum,char cOperator)
	{
		dblNumber=dblNum;
		Operator=cOperator;
		typeDouble=true;
	}
	public Calculate(int iFirstNum,char cOperator,int iSecondNum)
	{
		iFNum=iFirstNum;
		iSNum=iSecondNum;
		Operator=cOperator;
		typeInt=true;
	}
	//Performing calculation based on selected option
	public void doCalculation()
	{
		iResult=0;
		dblResult=0.0;
		switch(Operator)
		{
		case'+':
			checkInt();
			iResult=iFNum+iSNum;
			break;
		case'-':
			checkInt();
			iResult=iFNum-iSNum;
			break;
		case'*':
			checkInt();
			iResult=iFNum*iSNum;
			break;
		case'/':
			checkInt();
			if(!checkSecondNum())
			{
				iResult=iFNum/iSNum;
				break;
			}
		case'S':
		case's':
			checkDouble();
			dblResult=Math.sin(dblNumber);
			break;
		case'C':
		case'c':
			checkDouble();
			dblResult=Math.cos(dblNumber);
			break;
		case'T':
		case't':
			checkDouble();
			dblResult=Math.tan(dblNumber);
			break;
		case'L':
		case'l':
			checkDouble();
			dblResult=Math.log(dblNumber);
			break;
		default:
			iResult=0;
			dblResult=0.0;
			System.out.println("Operation not available.Please select any of the available option");
			break;
	}
	}
	//Performing result for selected operation
	public void getResult()
	{
		if(typeInt)
		{
			System.out.println("Result is:"+iResult);
		}
		else if(typeDouble)
		{
			System.out.println("Result is:"+dblResult);
		}
		}
	public boolean checkSecondNum()
	{
		if(iSNum==0)
		{
			System.out.println("Zero not alloweed");
			System.exit(0);
			return true;
		}
		else
		{
			return false;
		}
		}
	public void checkInt()
	{
		if(!typeInt)
		{
			iResult=0;
			System.out.println("Operation not available.Please select any of the available option");
			System.exit(0);
		}
	}
	public void checkDouble()
	{
		if(!typeDouble)
		{
			dblResult=0.0;
			System.out.println("Operation not available.Please select any of the available option");
			System.exit(0);
		}
	}
}