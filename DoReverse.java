import java.util.Scanner;

public class DoReverse {
    public static void main(String[] args)
    {
         int reverse=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number :");
        int num=sc.nextInt();
        do{
            int rem=num%10;
            reverse=(reverse*10)+rem;
            num/=10;
        }
        while(num>0);
        System.out.println("Reverse Number Is :"+reverse);
    }
   
}
