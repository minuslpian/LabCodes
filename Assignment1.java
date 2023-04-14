import java.util.*;
public class Assignment1 {

	public static void main(String[] args) {
		//PART A
				//Question 1
				/*System.out.println("Hello World");*/
				
				//Question 2
				/*System.out.print("Enter first digit :");
				Scanner sc=new Scanner(System.in);
				int num1=sc.nextInt();
				System.out.print("Enter second digit :");
				int num2=sc.nextInt();
				System.out.print("Addition is :"+(num1+num2));
				*/
				
				//Question 3
				/*System.out.print("Enter first digit :");
				Scanner sc=new Scanner(System.in);
				int num1=sc.nextInt();
				System.out.print("Enter second digit :");
				int num2=sc.nextInt();
				int num3=0;
				num3=num1;
				num1=num2;
				num2=num3;
				System.out.println("Swapped numbers are Num1="+num1+"and Num2="+num2);*/
				
				//Question 4
				/*System.out.print("Enter the length of Reactangle :");
				Scanner sc=new Scanner(System.in);
				int num1=sc.nextInt();
				System.out.print("Enter the width of Rectangle");
				int num2=sc.nextInt();
				System.out.println("Area of  Rectangle ="+(num1*num2))*/
				
				
				//Part B
				//Question 1
				/*System.out.print("Enter the number :");
				Scanner sc=new Scanner(System.in);
				int num1=sc.nextInt();
				for(int i=1;i<=num1;i++) {
					if(num1%i==0)
						System.out.print("Factors are :"+i);
				}
				*/
				
		
		
				//Question 2
				/*System.out.print("Enter the number :");
				Scanner sc=new Scanner(System.in);
				int num1=sc.nextInt();
				int rem=0,rev=0;
				while(num1!=0)
				{
					rem=num1%10;
					rev=(rev*10)+rem;
					num1=num1/10;
				}
				System.out.print("Reversed number is :"+rev);*/
				
		
		
				//Question 3
				/*System.out.print("Enter first number :");
				Scanner sc=new Scanner(System.in);
				int num1=sc.nextInt();
				System.out.print("Enter second number :");
				int num2=sc.nextInt();
				int sum=0;
				for(int i=num1;i<=num2;i++)
				{
					sum=sum+i;
				}
				System.out.print("Sum is :"+sum);*/
				
				
				//Question 4
						/*System.out.print("Enter first number :");
						Scanner sc=new Scanner(System.in);
						int num1=sc.nextInt();
						System.out.print("Enter second number :");
						int num2=sc.nextInt();
						for(int i=num1;i<=num2;i++) {
							if(i==2) {
								System.out.print("Prime numbers are :"+i);
							}
							for(int j=2;j<=(i-1);j++) {
							if((i%j) == 0) {
								break;
							}
							else if(j == i-1) { 
								System.out.print(" "+i);
							}
						}
			}*/
			
				//Question 5
				/*System.out.print("Enter the number :");
				Scanner sc=new Scanner(System.in);
				int num1=sc.nextInt();
				int rem=0,rev=0;
				while(num1!=0)
				{
					rem=num1%10;
					num1=num1/10;
				}
				System.out.print("First digit is :"+rem);
				*/
				
				
			//Question 6
			/*System.out.println("Enter the number :");
		  Scanner sc=new Scanner(System.in);
			int num1=sc.nextInt();
			int rem=0,rev=0;
		        	if(num1<0) {
		        		num1=num1*(-1);
		        	}
		        	
		        	while(num1!=0) {
		        		rem=num1%10;
		            	rev=rev+rem;
		            	num1=num1/10;
		        	}
		        	
		         System.out.println("Sum of digit :"+rev);
				}*/
				
				//Question7
				/*System.out.println("Enter the number :");
			    Scanner sc=new Scanner(System.in);
				int num1=sc.nextInt();
				int rem=0,rev=0,init=0,init1=0;
		    	if(num1<0) {
		    		num1=num1*(-1);
		    	}
		    	
		    	while(num1!=0) {
		    		rem=num1%10;
		        	rev=rev+rem;
		        	num1=num1/10;
		    	}
		    		System.out.println("Sum of digit :"+rev);*/		    	
				
				
				//Question8
				/*System.out.println("Enter the number :");
			    Scanner sc=new Scanner(System.in);
				int num1=sc.nextInt();
				int rem=0,rev=1;
		    	if(num1<0) {
		    		num1=num1*(-1);
		    	}
		    	
		    	while(num1!=0) {
		    		rem=num1%10;
		        	rev=rev*rem;
		        	num1=num1/10;
		    	}
		    	System.out.println("Sum of digit :"+rev); */
				
				//Question 9
				/*System.out.println("Enter the number :");
			    Scanner sc=new Scanner(System.in);
				int num1=sc.nextInt();
				int rem=0,rev=0;
				int num2=num1;
		    	
		    	while(num1!=0) {
		    		rem=num1%10;
		        	rev=(rev*10)+rem;
		        	num1=num1/10;
		    	}
		    	if(num2 == rev) {
		    	System.out.println("Number is Palindrome.");
		    	}
		    	else {
		    		
		    		System.out.println("Number is not Palindrome.");
		    	}*/
		    
		    	}
		

	}



		