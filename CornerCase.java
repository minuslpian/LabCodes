import java.util.*;
public class CornerCase
{
	static String arr[] = new String[] {"zero"," one "," two "," three "," four "," five "," six "," seven "," eight "," nine "," ten "," eleven "," twelve "," thirteen "," fourteen "," fifteen "," sixteen "," seventeen "," eighteen "," ninteen "};
	static String arr2[] =new String[] {" "," ten "," twenty "," thirty "," forty "," fifty "," sixty "," seventy "," eighty "," ninty "};
	static void numToWord(int num)
	{
		String str="";
		int rem=0;
		int rev=0;
		int count=0;
		int num1=num;
		while ( num != 0)
		{
			rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;
			count++;
		}

        if (rev==0)
        {
            System.out.println("zero");
        }
		while ( rev != 0 )
		{
			rem=rev%10;
			
			if ( count == 6 )
			{
				if(arr[rem] != "zero"){
					str=arr[rem] + " lakh ";
				 	System.out.print(str);
				}
				else{
					System.out.print(" lakh ");
				}
				
				
		}
			else if ( count == 5){
				if(arr[rem] != "zero"){
					
					str=arr2[rem];//+ " thousand ";
					System.out.print(str);
				}
//				 else{
//				 	System.out.print(" thousand ");
//				 }
				
				
			}
			else if(count == 4)
			{
				if(arr[rem] != "zero"){
					str=arr[rem]+" thousand ";
					System.out.print(str);
				}
				else{
					System.out.print(" thousand ");
				}
				
			}
			else if ( count == 3){
				if(arr[rem] != "zero"){
					System.out.print(arr[rem]);
					System.out.print(" hundred ");
				}
//				 else{
//				 	System.out.print(" hundred ");
//				 }
				
			}
			else if ( count == 2 ){
                if(num1 < 20){
                    System.out.print(arr[num1]);
                    break;
                }                

                else
                    System.out.print(arr2[rem]);
			}
			else 
				System.out.print(arr[rem]);
		
			count--;
			rev = rev/10;
		}
	}
	
	public static void main(String str[])
	{
		Scanner sc =new Scanner(System.in);
	    System.out.println("Enter a number: ");
		int num=sc.nextInt();
		numToWord(num);
	}
}