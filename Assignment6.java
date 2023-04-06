import java.util.*;
public class Assignment6 {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("rollno: ");
		int roll=sc.nextInt();
		System.out.println("Sub1: ");
		int s1=sc.nextInt();
		System.out.println("Sub2: ");
		int s2=sc.nextInt();
		System.out.println("Sub3: ");
		int s3=sc.nextInt();
		StudentInfo stu1=new StudentInfo();
		
		if(stu1.isStudentPassed(s1, s2, s3, roll))
		{
			System.out.println("stu1 passed");
		}
		else {
			System.out.println("stu1 failed");
		}
		
}
	
}

class StudentInfo{
	int rollNo;
	int sub1m;
	int sub2m;
	int sub3m;
	public boolean isStudentPassed(int sub1,int sub2,int sub3,int roll)
	{
		rollNo=roll;
		sub1m=sub1;
		sub2m=sub2;
		sub3m=sub3;
		if(sub1m >= 40 && sub2m >= 40 && sub3m >= 40)
		{
			return true;
		}
		else {
			return false;
		}
	}
}
