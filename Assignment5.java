
import java.util.*;
public class Assignment5 {

	public static void PrintPattern1(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i%2==1)
					System.out.print("* ");
				else
					System.out.print("# ");
			}
		System.out.println("");
		}
	}
	
	public static void PrintPattern2(int num1)
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
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Print * and # pattern \n2.Print integer pattern  \n3.Set month in date \nEnter the choice:: ");
		int choice=sc.nextInt();
		
		switch (choice)
		{
		case 1:
			System.out.println("Enter number of lines ::");
			int n=sc.nextInt();
			PrintPattern1(n);
			break;
			
		case 2:
			System.out.println("Enter number of lines ::");
		    n=sc.nextInt();
			PrintPattern2(n);
			break;
			
		case 3:
			
				System.out.print("Enter day : ");
				int num1= sc.nextInt();
				System.out.print("Enter month : ");
				int num2= sc.nextInt();
		        ques3(num1,num2);
		
				
	}
	}
}
