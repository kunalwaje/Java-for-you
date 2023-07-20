package Oops.src;

public class Watch  
{
    String brand;
    double price;
    String type;
    boolean waterproof;
    int model;
    String strap;
    Watch()
    {
        
    }

    Watch(String brand,double price,String type,boolean proof,int model,String strap)
    {
        this.brand= brand;
        this.price=price;
        this.type=type;
        this.waterproof=proof;
        this.model=model;
        this.strap=strap;
        System.out.println("Values Loaded!!!");
    }

    public void displayWatch()
    {
        System.out.println("Brand : "+brand);
        System.out.println("Price : "+price);
        System.out.println("Type : "+type);
        System.out.println("Waterproof : "+waterproof);
        System.out.println("Model : "+model);
        System.out.println("Strap : "+strap);
    }
}
