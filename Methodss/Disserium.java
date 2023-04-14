import java.util.Scanner;

public class Disserium {
    public static int count(int num) {
        int ct = 0;
        while (num != 0) {
            ct++;
            num /= 10;
        }
        return ct++;
    }

    public static int power(int base, int raise) {
        int pow = 1;
        for (int i = 0; i < raise; i++) {
            pow *= base;
        }
        return pow;
    }

    public static boolean isDisserium(int num)
    {
        int temp=num;
        int ct=count(num);
        int sum=0;
        while(num!=0)
        {
            int rem=num%10;
            sum=sum+power(rem,ct--);
            num/=10;
        }
        if(temp==sum)
        {
            return true;
        }
        else
        {
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        int ip = sc.nextInt();
        if (isDisserium(ip)) {
            System.out.println("It is Disserium Number ");
        } else {
            System.out.println("It is not a Disserium Number");
        }
    }
}
