/*A Java program to add an integer to an array*/
import java.util.Scanner;
class Addint 
{
	public static void main(String[] args) 
	{
		int n;
		System.out.println("Enter the value of n:");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int a[]=new int[10];
		System.out.println("Enter the values:");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("The values are:");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}

	}

}
