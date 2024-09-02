package C1;
//time20240902-1447
import java.util.Scanner;

public class exercise2{
	public static void main(String[] args) {
		double m,n;
		Scanner scan=new Scanner(System.in);
		System.out.println("費氏係數運算");
		System.out.println("輸入整數n:");
		n=scan.nextDouble();
		System.out.println(n+"的費氏係數是"+fib(n));
		
	}
	public static double fib(double n) {
		double ans;
		if (n==0) {
			ans=0;
		}else if(n==1) {
			ans=1;
		}else {
			ans=fib(n-1)+fib(n-2);
		}return ans;
	}
}


