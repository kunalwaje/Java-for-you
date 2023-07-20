package strings;

import java.util.Scanner;

public class MethodExample {
	public static void main(String[] args) {
		System.out.println("Enter String :");
		String s1 = new Scanner(System.in).next();
		char[] ch=toCharArray(s1);
		//System.out.println(length(s1));
		//System.out.println(toUpperCase(s1));
		//System.out.println(toLowerCase(s1));
		System.out.println(trim(s1));
	}
	public static char[] toCharArray(String s1)
	{
		char[] ch=new char[s1.length()];
		for (int i = 0; i < s1.length(); i++) {
			ch[i]=s1.charAt(i);
		}
		return ch;
	}
	public static int length(String s1)
	{
		char[]ch=toCharArray(s1);
		return ch.length;
		
	}
	public static String toUpperCase(String s1)
	{
		String s2="";
		char[]ch=toCharArray(s1);
		for (int i = 0; i < ch.length; i++) {
			char c1=ch[i];
			if(c1>='a'&&c1<='z')
			{
				char c2=(char) (c1-32);
				s2=s2+c2;
			}
			else {
				s2=s2+c1;
			}
			
		}
		return s2;
	}
	public static String toLowerCase(String s1)
	{
		String s2="";
		char[] ch=toCharArray(s1);
		for (int i = 0; i < ch.length; i++) {
			char c1=ch[i];
			if(c1>='A'&&c1<='Z')
			{
				char c2=(char) (c1+32);
				s2=s2+c2;
						
			}
			else
			{
				s2=s2+c1;
			}
		}
		return s2;
	}
	public static String trim(String s1)
	{
		String s2="";
		int si=0;
		int li=s1.length()-1;
		char[]ch=MethodExample.toCharArray(s1);
		for (int i = 0; i < ch.length-1; i++) {
			if(ch[i]!=' ')
			{
				si=i;
				break;
			}
		}
		for (int i=ch.length-1;i>=0;i--) {
			if(ch[i]!=' ')
			{
				li=i;
				break;
			}
		}
		for (int i = si; i <=li; i++) {
			s2=s2+ch[i];
		}
		return s2;
	}
	
}
