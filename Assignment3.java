import java.util.*;
public class Assignment3 {

	public static void main(String[] args) {
		//Question 1
	   /*System.out.print("Enter the Principle :");
	    Scanner sc=new Scanner(System.in);
	    double Principle= sc.nextDouble();
	    System.out.print("Enter the Rate :");
	    double Rate= sc.nextDouble();
	    System.out.print("compounded(Quarterly,Half Yearly, Yearly):");
	    double Compound= sc.nextDouble();
	    System.out.print("Enter the Time Period :");
	    double Time= sc.nextDouble();
	    double CI=Principle*(Math.pow((1+Rate/(100*Compound)),(Time/Compound)))-Principle;
	    System.out.println("The calculated Compound Interest is :"+CI); */
	    
			
	    //Question 2
			/*System.out.print("Enter the Number :");
		    Scanner sc=new Scanner(System.in);
		    double num1= sc.nextDouble();
		    System.out.print("Enter the power :");
		    double power= sc.nextDouble();
		    
		    double ans= Math.pow(num1, power);
		    
		    System.out.println("The ans is :"+ans);*/
			
			
		//Question 3
			/*System.out.print("Enter the Number :");
		    Scanner sc=new Scanner(System.in);
		    int num1= sc.nextInt();
		    int num2=0,num3=1,num4=0;
		    System.out.print(" "+num2+" "+num3);
		    for(int i=2;i<=num1;i++) {
		    	 num4=num2+num3;
		    	 
		    	 System.out.print(" "+num4);
		    	 
		    	 num2=num3;
		    	 num3=num4;
		    }*/
			
			
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
			/*System.out.print("Enter the Number :");
		    Scanner sc=new Scanner(System.in);
		    int num1= sc.nextInt();
		    int fact=1;
		    for(int i=1;i<=num1;i++) {
		    	fact=fact*i;	
		    	}
		    System.out.print("Factorial of "+num1+" is :"+fact);*/

	}

}
