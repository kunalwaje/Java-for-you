package strings;

import java.util.Scanner;

public class DuplicateEqualIgnoreCase {
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter size of an array :");
			String[] s1=new String[sc.nextInt()];
			for (int i = 0; i < s1.length; i++) {
				System.out.println("Enter data in "+i+"th block of memory");
				s1[i]=sc.nextLine();
				s1[i]=sc.nextLine();
			}
			for (int i = 0; i < s1.length; i++) {
				int count=0;
				if(s1[i]!=null)
				{
					for(int j=i+1;j<s1.length;j++)
					{
						if(s1[i].equalsIgnoreCase(s1[j]))
						{
							count++;
							s1[j]=null;
						}
					}
					if(count!=0)
					{
						System.out.println(s1[i]);
					}
				}
			}
		}
}
