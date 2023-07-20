package Oops.src;

public class ConstructorChaining {
    String name;
    long mob;
    String mail;
    int yop;
    String branch;
    String degree;

    String linkedin;
    String certificates;
    long tel;

    ConstructorChaining()
    {

    }

    ConstructorChaining(String name,long mob,String mail,int yop,String branch,String degree)
    {
        this.name=name;
        this.mob=mob;
        this.mail=mail;
        this.yop=yop;
        this.branch=branch;
        this.degree=degree;
    }
    ConstructorChaining(String name,long mob,String mail,int yop,String branch,String degree,String linkedin)
    {
        this(name,mob,mail,yop,branch,degree);
        this.linkedin=linkedin;
    }
    ConstructorChaining(String name,long mob,String mail,int yop,String branch,String degree,String linkedin,long tel)
    {
        this(name,mob,mail,yop,branch,degree,linkedin);
        //this.linkedin=linkedin;
        this.tel=tel;
    }
    public void displayConstructorChaining()
    {
        System.out.println("Name : "+name);
        System.out.println("Contact Number : "+mob);
        System.out.println("Email : "+mail);
        System.out.println("Year of Passing : "+yop);
        System.out.println("Branch : "+branch);
        System.out.println("Degree : "+degree);
        System.out.println("LinkedIn : "+linkedin);
        System.out.println("Certificates : "+certificates);
        System.out.println("Telephone Number :"+tel);
    }
    
}

