package array;

import java.util.Iterator;

public class NumberNotPresent {
		public static void main(String[] args) {
			int[]a= {1,2,3,5,-1,-2};
			int b=-1;
			for(int i=0;i<a.length;i++)
			{
				if(a[i]==b)
				{
					b++;
					i=-1;
				}
			}
			System.out.println(b);
		}

}
