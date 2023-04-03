import java.util.*;
class SumInt
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first value :");
		int num= sc.nextInt();
		System.out.println("Enter the second value :");
		int num1= sc.nextInt();
		int x=0;

		for(int i=num;i<=num1;i++)
		{
			
			
			x=x+i;
		
		}
		System.out.println("Answer :"+x);
	}
}

				

