package Oops.src;
class Forms
{
    String name;
    long mob;
    String mail;
    int yop;
    String branch;
    String degree;

    String linkedin;
    String certificates;
    long tel;

Forms()
{

}
Forms(String name,long mob,String mail,int yop,String branch,String degree)
{
    this.name=name;
    this.mob=mob;
    this.mail=mail;
    this.yop=yop;
    this.branch=branch;
    this.degree=degree;
}
Forms(String name,long mob,String mail,int yop,String branch,String degree,String linkedin)
{
    this.name=name;
    this.mob=mob;
    this.mail=mail;
    this.yop=yop;
    this.branch=branch;
    this.degree=degree;
    this.linkedin=linkedin;
}
Forms(String name,long mob,String mail,int yop,String branch,String degree,String linkedin,String certificates)
{
    this.name=name;
    this.mob=mob;
    this.mail=mail;
    this.yop=yop;
    this.branch=branch;
    this.degree=degree;
    this.linkedin=linkedin;
    this.certificates=certificates;
}
Forms(String name,long mob,String mail,int yop,String branch,String degree,String linkedin,String certificates,long tel)
{
    this.name=name;
    this.mob=mob;
    this.mail=mail;
    this.yop=yop;
    this.branch=branch;
    this.degree=degree;
    this.linkedin=linkedin;
    this.certificates=certificates;
    this.tel=tel;
}   

public void displayForms()
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