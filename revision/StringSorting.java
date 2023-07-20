package revision;

import java.util.Iterator;

public class StringSorting {
	public static void main(String[] args) {
		String a="harry potter";
		String b=" ";
		char[]ch=a.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i]!='\u0000'&&ch[i]!=' ') {
				for (int j = i+1; j < ch.length; j++) {
					if (ch[i]==ch[j]) {
						ch[j]='\u0000';
					}
				}
				b=b+ch[i];
			}
		}
		System.out.println("Without Sorting");
		System.out.println(b);
		System.out.println("After Sorting");
		char ch1[]=b.toCharArray();
		for (int i = 0; i < ch1.length; i++) {
			for (int j = i+1; j < ch1.length; j++) {
				if (ch1[i]>ch1[j]) {
					char temp=ch1[i];
					ch1[i]=ch1[j];
					ch1[j]=temp;
				}
			}
		}
		for (int i = 0; i < ch1.length; i++) {
			System.out.print(ch1[i]+" ");
		}
		
	}

}
