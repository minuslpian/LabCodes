//Assignment 4
//Question1
/*import java.util.*;
public class First {
	public static int countOneBits(int num1) {
		int rem=0,quo=0;
		while(num1!=0) {
			if(num1%2 !=0) {
				quo++;
			}
			num1= num1/2;
		}
		return quo;
	}

	public static void main(String[] args) {
		System.out.print("Enter the number");
		Scanner sc=new Scanner(System.in);
		int num1= sc.nextInt();
		System.out.println(countOneBits(num1));
	}

}*/

//question 2
import java.util.*;
public class First {
	public static int setBittoOne(int num1, int bitposn) {
		int arr[];
		int i=0;
		while(num1!=0) {
			if(num1%2 !=0) {
			  arr[i]=1;
			
			}
			else
				arr[i]=0;
			num1= num1/2;
			
			System.out.print(arr[i]);
			i++;
		}
		
		return 0;
	
	
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num1= sc.nextInt();
		System.out.print("Enter bit position : ");
		int bitposn= sc.nextInt();
		System.out.print(setBittoOne(num1,bitposn));
		
}
}
