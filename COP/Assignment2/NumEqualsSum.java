import java.util.*;
import java.lang.Math;
public class NumEqualsSum
{
	static void numEqualsSum()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number: ");
		int num=sc.nextInt();
		int num1=num;
		int num2=num;
                double count=0;
		double rem=0;
		double sum=0;
		while ( num != 0)
		{
			num=num/10;
			count++;
		}
		//System.out.println(count);
		while ( num1 != 0 )
		{
			rem=num1%10;
			sum=sum+(Math.pow(rem,count));
			num1=num1/10;
		}
		//System.out.println(sum);
		if ( sum == num2)
		{
			System.out.println(num2 +" is Armstrong number");
		}
		else
			System.out.println(num2 +" is not Armstrong number");
	}
	public static void main(String str[])
	{
		numEqualsSum();
	}
}
