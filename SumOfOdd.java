import java.util.Scanner;
public class SumOfOdd{ 
	static int oddSum(int n){
		int i,sum=0;
	   	for (i=1;i<=n ;i+=2 ) {
		   	sum=sum+i;
			System.out.println("Sum Of All Odd Numbers:" +sum);
		}
		
return sum;
			
	}
		
    public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int n = sc.nextInt();
		System.out.println(oddSum(n));
	}
}
