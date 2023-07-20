package revision;
import java.util.Scanner;
public class ArrayDuplicate {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Size of an array :");
		int size=sc.nextInt();
		//{1,6,2,4,5,6,2}
		int arr[]=new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) { //1<7 
			int count=0;
			if(arr[i]!=0) //1!=0
			{
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[i]==arr[j])//6==6
					{
						count++; //1
						arr[j]=0; //to remove element
					}
				}//end of inner loop
				if(count!=0)
				{
					System.out.println(arr[i]);
					
				}
			}//end of if condition
		}//end of outer for loop   

	}
}


