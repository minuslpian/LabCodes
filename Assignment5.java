//Assignment 5
//Question 1
import java.util.*;
public class Assignment5 {

	public static void PrintPattern(int num1) {
		for(int line=1;line<=num1;line++)
		{    
			System.out.println(" ");
			for(int i=1;i<=line;i++)
			{
				if((line%2)!=0) {
					System.out.print("* ");
				}
				else
					System.out.print("# ");
			}
		}
	}
	public static void printPattern2(int num1)
	{   int num2=num1;
		for(int line=1;line<=num1;line++)
		{
			for(int i=1; i<= line;i++)
			{
				for(int j=(num2-1);j>=1;j--)
				{
					System.out.print(" ");
				}
				System.out.print(i);
				if(i==line) {
					while(i>1) {
						i--;
						System.out.print(i);
					}
					
				}
				
			}
			System.out.println("");
			num2--;
		}
	}
	public static void main(String[] args) {
		System.out.print("Enter line numbers : ");
		Scanner sc=new Scanner(System.in);
		int num1= sc.nextInt();
		printPattern2(num1);
		
//Question 2
		
		
	}
} 
