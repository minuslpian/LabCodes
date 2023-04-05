import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		System.out.print("Enter line numbers : ");
		Scanner sc=new Scanner(System.in);
		int num1= sc.nextInt();
		System.out.println("1");
		for(int line=1; line<num1; line++)
		{ 
			if(line!=num1)
			{
				for(int sp=(num1-1);sp>0;sp--) {
					System.out.print(" ");
				}
			}
			int i=1;
			for(i=1;i<=line;i++) {
				System.out.print(i);
			}
			   
			for(int j=i;j>=1;j--)
			{
				i--;
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
