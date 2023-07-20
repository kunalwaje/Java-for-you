package Oops.src;

public class ConstructorChainingDriver {
    public static void main(String[] args)
    {
        System.out.println("****************Form****************");
        ConstructorChaining c1=new ConstructorChaining("Kunal Waje",928467688,"kunalwaje28@gmail.com",2023,"Computer Applications","MCA");
        c1.displayConstructorChaining();

        System.out.println("---------------------------------------");
        
        ConstructorChaining c2=new ConstructorChaining("Akash Waje",965770810,"akashwaje28@gmail.com",2024,"Management","MBA");
        c2.displayConstructorChaining();

    }
    
}
