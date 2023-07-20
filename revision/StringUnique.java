package revision;
import java.util.Scanner;
public class StringUnique {
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter size of string");
		int size=sc.nextInt();
		String s1[]=new String[size];
		for (int i = 0; i < s1.length; i++) {
			s1[i]=sc.next();
		}
		for (int i = 0; i < s1.length; i++) {
			int count=0;
			if(s1[i]!=null)
			{
				for(int j=i+1;j<s1.length;j++)
				{
					if(s1[i].equals(s1[j]))
					{
						count++;
						s1[j]=null;
					}
				}
				if(count==0)
				{
					System.out.println(s1[i]);
				}
			}
		}
		
	}

}
