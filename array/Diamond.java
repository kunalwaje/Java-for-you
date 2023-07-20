package array;

public class Diamond {
	public static void main(String[] args) {
		//int n=5,star=0,space=n/2;
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<=4;j++)
			{
				System.out.println(" "+" ");
			}
			for(int k=0;k<=i+i;k++)
			{
				System.out.println("*");
			}
			System.out.println();
		}
		
		
	}
}
