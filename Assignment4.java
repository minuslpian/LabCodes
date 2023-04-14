//Assignment 4
//Question1
/*import java.util.*;
public class Assignment4 {
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

//Question 2
/*import java.util.*;
public class Assignment4 {
	public static int setBitToOne(int num1, int bitposn) {
		int mask=1<<(bitposn-1);
		num1=num1|mask;
		return num1;
	
	
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num1= sc.nextInt();
		System.out.print("Enter bit position : ");
		int bitposn= sc.nextInt();
		System.out.print(setBitToOne(num1,bitposn));
		
}
}*/


//Question 3

/*import java.util.*;
public class Assignment4 {
	public static int getBitToOne(int num1, int bitposn) {
		int mask=1<<(bitposn-1);
		num1=num1&mask;
		return num1;
	
	
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num1= sc.nextInt();
		System.out.print("Enter bit position : ");
		int bitposn= sc.nextInt();
		System.out.print(getBitToOne(num1,bitposn));
		
}
}*/







