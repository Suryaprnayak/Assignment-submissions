import java.util.*;
class Test
{
	int sum(int a,int b)
	{
		int add=a+b;
		return add;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two number to addition");
		int a=sc.nextInt();
		int b=sc.nextInt();
		Test t=new Test();
		System.out.println("Sum is :"+t.sum(a,b));
	}
}