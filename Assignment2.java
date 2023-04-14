import java.util.*;
public class Assignment2 {

	public static void main(String[] args) {
		//Question 1
		/*System.out.println("Enter the number :");
	    Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int rem=0,rev=0;
		for(int i=1;i<num1;i++)
		{
			if((num1%i)==0) {
				rem=rem+i;
			}
		}
			System.out.println("Sum of factors :"+rem);
			if(num1 == rem)
				System.out.println("The number is perfect");
			else
				System.out.println("The number is not perfect");*/
		
		//Question 2
		/*System.out.println("Enter the number :");
	    Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int n=num1;
		double multi=0,count=0,rem=0;
				
		while(n!=0) {
			rem=n%10;
			count++;
			n=n/10;
		}
		
		n=num1;
		while(n!=0) {
			rem=n%10;
			multi=multi+(Math.pow(rem, count));
			n=n/10;
		}
		if(num1==multi) {
		System.out.println(" It is Armstrong number");
		}
		else
			System.out.println("It is not Armstrong number");*/
		
		
		//Question 3
		/*System.out.println("Enter the number :");
	    Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		System.out.println("Enter the digit for search :");
		int i=sc.nextInt();
		int rem=0,count=0;
		
		while(num1!=0)
		{
			rem=num1%10;
			if(rem==i)
				count++;
			num1=num1/10;
		}
		System.out.println("The digit repeated for "+count+" times.");*/
		
		//Question 4
		/*System.out.println("Enter the number :");
	    Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int rem=0,rev=0,rev1=0,rem1=0;
		while(num1!=0) {
			rem=num1%10;
			rev=(rev*10)+rem;
			num1=num1/10;
		}
		
		while(rev!=0) {
			rem1=rev%10;
			rev1=(rev1*10)+rem1;
			
			if(rem1==1) {
				System.out.print("One");
				}
			else if(rem1==0) {
				System.out.print(" Zero");
			}
			else if(rem1==2) {
				System.out.print(" Two");
			}
			else if(rem1==4) {
				System.out.print(" Four");
			}
			else if(rem1==3) {
				System.out.print(" Three");
			}
			else if(rem1==5) {
				System.out.print(" Five");
			}
			else if(rem1==6) {
				System.out.print(" Six");
			}
			else if(rem1==7) {
				System.out.print(" Seven");
			}
			else if(rem1==8) {
				System.out.print("Eight");
			}
			else if(rem1==9){
				System.out.print(" Nine");
			}
		
			rev=rev/10;
		}*/
		
		

	}

}
