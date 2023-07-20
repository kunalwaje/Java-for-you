package revision;
import java.util.Scanner;
public class ArrayLastDuplicate {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Size of an array :");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		for (int i = arr.length-1; i >=0; i--) {
			int count=0;
			if(arr[i]!=0)
			{
				for(int j=i-1;j>=0;j--)
				{
					if(arr[i]==arr[j])
					{
						count++;
						arr[j]=0;
					}
				}//end of inner loop
				if(count!=0)
				{
					System.out.println(arr[i]);
					return;
				}
			}//end of if condition
		}//end of outer for loop   

	}
}

