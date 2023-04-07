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
            for(int j=(num2-1);j>=1;j--)
				{
					System.out.print(" ");
				}
			for(int i=1; i<= line;i++)
			{	
				System.out.print(i);
				if(i==line) {
					while(i>1) {
						i--;
						System.out.print(i);
					}
                    i=line+1;	
				}				
			}
			System.out.println("");
			num2--;
		}
	}
    static void ques3(int date,int month)
    {
        System.out.println(Integer.toBinaryString(date));
        int mask=0x1e0;
        date=date&(~mask);
        month=month << 5;
        date=date | month;
        System.out.println(Integer.toBinaryString(date));
    }
	public static void main(String[] args) {
		System.out.print("Enter date : ");
		Scanner sc=new Scanner(System.in);
		int num1= sc.nextInt();
		System.out.print("Enter month : ");
		int num2= sc.nextInt();
		// printPattern2(num1);
        ques3(num1,num2);
		
//Question 2
		
		
	}
} 
