# FIBONACCI
package oxygen.com;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.println("enter the limit for fibonacci series");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a=0,b=1,i=1,c;
		if(n==0)
		{
			System.out.println(a);
		}
		else
		{
			System.out.println(a);
			System.out.println(b);
			while(i<=n)
			{
				c=a+b;
				System.out.println(c);
				a=b;
				b=c;
				i++;
			}
		}
	}

}

OUTPUT:
enter the limit for fibonacci series
5
0
1
1
2
3
5
8
