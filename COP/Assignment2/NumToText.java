import java.util.Scanner;
public class NumToText
{
	static void numToText()
	{

		Scanner sc= new Scanner(System.in);
		System.out.println("Write number to convert: ");
		int num=sc.nextInt();
		int rev=0;
		int rem=0;
		while ( num != 0 )
		{
			rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;
		}
		//System.out.println(rev);
		while ( rev != 0)
		{

			rem=(rev%10);
			switch(rem){
				case 0:
					System.out.print("zero ");
					break;
				case 1:
					System.out.print("one ");
					break;
				case 2:
					System.out.print("two ");
					break;
				case 3:
					System.out.print("three ");
					break;
				case 4:
					System.out.print("four ");
					break;
				case 5:
					System.out.print("five ");
					break;
				case 6:
					System.out.print("six ");
					break;
				case 7:
					System.out.print("seven ");
					break;
				case 8:
					System.out.print("eight ");
					break;
				case 9:
					System.out.print("nine ");
					break;
			}
			rev=rev/10;
		}
	}
	public static void main(String str[])
	{
		numToText();
	}
}
