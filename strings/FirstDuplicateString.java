package strings;

public class FirstDuplicateString {
	public static void main(String[] args) {
		String s1[]= {"hi","hello","hello","harry","kevin","Speed","avenger","TOM","tom","hi"};
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
				if(count!=0)
				{
					System.out.println(s1[i]);
					return;
				}
			}
		}
	}

}
