//the quick brown fox jumps over a lazy dog
//pack by box with five dozen liquor jugs
package strings;
import java.util.Scanner;
public class Pangram {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String");
		//String s1="pack by box with five dozen liquor jugs".toLowerCase();
		String s1=sc.nextLine();
		//char ch1[]=s1.toCharArray();
		int count=0;
		//char ch='a';
		for(char i='a';i<='z';i++)
		{
			for (int j = 0; j < s1.length(); j++) {
				if (i==s1.charAt(j)) {
					count++;
					break;
				}
			}
		}
		if(count==26)
		{
			System.out.println("Pangram");
		}
		else {
			System.err.println("Not Pangram");
		}
	}

}
