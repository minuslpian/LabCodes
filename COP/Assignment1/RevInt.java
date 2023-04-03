import java.util.Scanner;
class RevInt
{
        public static void main(String[] args)
        {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first no. ");
		int a= sc.nextInt();
	 	int rem=0;
		int rev=0;
		while(a != 0)
		{
		    rem=a%10;
		    rev=rev*10 + rem;
		    a=a/10;
		}
		System.out.println(rev);

        }
}
