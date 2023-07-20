package array;

import java.util.Scanner;

public class ArrayPrintVowels {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size :");
		char a[]=new char[sc.nextInt()];
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.next().charAt(0);
			
		}
		//int count=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]=='A'|| a[i]=='E'||a[i]=='I'||a[i]=='O'||a[i]=='U'||a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u')
			{
				//count++;
				System.out.println("Vowels  ="+a[i]);
				
			}
			else
			{
				//count++;
				System.out.println("Consonants ="+a[i]);
			}
		}
	}

}
