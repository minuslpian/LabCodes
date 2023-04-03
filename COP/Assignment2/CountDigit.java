import java.util.*;
public class CountDigit
{
	static void countDigit()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number: ");
		int num= sc.nextInt();
		System.out.println("Enter digit for count: ");
		int digit=sc.nextInt();
		int count=0;
		while ( num != 0 )
		{
			if ( num%10 == digit)
			{
				count++;
				
			}

			num=num/10;
		}
		System.out.println(digit + " came " + count + " times");
	}
	public static void main(String str[])
	{
		countDigit();
	}
}
