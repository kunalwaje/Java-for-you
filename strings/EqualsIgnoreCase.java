package strings;

public class EqualsIgnoreCase {
	String a;
	EqualsIgnoreCase(String a)
	{
		this.a=a;
	}
	public static void main(String[] args) {
		Equals e1= new Equals("Hello");
		Equals e2= new Equals("hello");
		System.out.println(e2.equals(e1));
	}
	public boolean equalsIgnoreCase(Object o1)
	{
		Equals e1=(Equals)o1;
		String a=this.a;
		String b=e1.a;
		a=a.toLowerCase();
		b=b.toUpperCase();
		if(a.length()==b.length())
		{
			for (int i = 0; i < a.length(); i++) {
				if (a.charAt(i)==b.charAt(i)) {
					
				}
				else
				{
					return false;
				}
			}
			return true;
		}
		else
		{
			return false;
		}
	}
}
