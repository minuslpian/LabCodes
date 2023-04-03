import java.util.*;
public class NumToWord
{
	static void numToWord()
	{
		Scanner sc=new Scanner(System.in);
	        System.out.println("Enter a number: ");
		int num=sc.nextInt();
		int rem=0;
		int rev=0;
		int count=0;
		while ( num != 0)
		{
			rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;
			count++;
		}
		while ( rev != 0 )
		{
			rem=rev%10;
			String arr[] = new String[] {"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","ninteen","twenty"};
			String arr2[] =new String[] {"zero","ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninty"};
			if ( count == 6 )
			{
				System.out.print(arr[rem]);
				System.out.print(" lakh ");
		}
			else if ( count == 4 || count == 5){
				System.out.print(arr[rem]);
				System.out.print(" thousand ");
			}
			else if ( count == 3){
				System.out.print(arr[rem]);
				System.out.print(" hundred ");
			}
			else if ( count == 2 ){
				System.out.print(arr2[rem]);
			}
			else 
				System.out.print(arr[rem]);
		
			count--;
			rev = rev/10;
		}
	}
	
	public static void main(String str[])
	{
		numToWord();
	}
}
