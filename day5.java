import java.util.*;
class Test
{
	int sum(int n,int res)
	{
		for(int i=1;i<=n;i++)
		{
			res=res+i;

		}
		return res;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int res=0;
		Test t=new Test();
		System.out.println(t.sum(n,res));

		
	}
}