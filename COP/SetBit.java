import java.util.*;

// import javax.print.attribute.Size2DSyntax;

public class SetBit {
    static int setBitToOne(int num,int bitnum)
    {
        int arr[]=new int[50];
        int i=0,sum=0;
        while(num != 0)
        {
            arr[i]=num%2;
            // System.out.println(arr[i]);
            i++;
            num=num/2;
        }
        arr[bitnum-1]=1;
        int bin=2;
        // Collections.reverse(Arrays.asList(arr));
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j] == 1){
                sum=((int)Math.pow(bin,j))+sum;
                System.out.println(sum);
            }
            else
                continue;
        }
        return sum;
    }
    public static void primeNo(int num1, int num2)
    {
        for (int i=num1;i<=num2;i++)
        {
            for(int j=2;j<=(i-1);j++)
            {
                if(i%j == 0)
                {
                    break;
                }
                if(j == (i-1))
                {
                    System.out.println(i);
                }
            }
        }
    }
    public static void main(String []args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number: ");
        int num= sc.nextInt();
        System.out.println("enter number: ");
        int bitnum= sc.nextInt();
        // System.out.println(setBitToOne(num,bitnum));
        primeNo(num, bitnum);
    } 
}
