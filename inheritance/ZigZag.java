package inheritance;
import java.util.Scanner;

public class ZigZag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Length");
		int a[]=new int[sc.nextInt()];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			
		}
		System.out.println("Enter Length");
		int b[]=new int[sc.nextInt()];
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
			
		}
		int []res=zigZag(a,b);
		for (int i=0;i<res.length;i++)
		{
			System.out.print(res[i]+" ");
		}
		
	}
	public static int[] zigZag(int a[],int b[])
	{
		int c[]=new int[a.length+b.length];
		int index=0;
		for(int i=0;i<a.length;i++)
		{
			c[index++]=a[i];
			for(int j=0;j<b.length;j++)
			{
				c[index++]=b[j];
				break;
			}
		}
		
		return c;
	}

}
