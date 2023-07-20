package Oops.src;
class Employee
{
    int empid;
    String name;
    long contact;
    String email;
    String address;
    String empcompany;
    String comloc;
    String empdept;
    String emprole;
    String mgr;
    double empsal;
    double empcomm;

    Employee()
    {

    }
    Employee(int empid,String name,long contact,String email,String address, String empcompany,String comloc,String empdept,String emprole,String mgr, double empsal)
    {
        this.empid=empid;
        this.name=name;
        this.contact=contact;
        this.email=email;
        this.address=address;
        this.empcompany=empcompany;
        this.comloc=comloc;
        this.empdept=empdept;
        this.emprole=emprole;
        this.mgr=mgr;
        this.empsal=empsal;
        
    }
    Employee(int empid,String name,long contact,String email,String address, String empcompany,String comloc,String empdept,String emprole,String mgr, double empsal, double empcomm)
    {
        this(empid,name,contact,email,address,empcompany,comloc,empdept,emprole,mgr,empsal);
        this.empcomm=empcomm;
    }
    public void displayEmployee()
    {
        System.out.println("Employee ID : "+empid);
        System.out.println("Employee Name : "+name);
        System.out.println("Employee Contact : "+contact);
        System.out.println("Employee Address : "+address);
        System.out.println("Employee company name : "+empcompany);
        System.out.println("Company location : "+comloc);
        System.out.println("Employeee Department : "+empdept);
        System.out.println("Employee role : "+emprole);
        System.out.println("Employee Manager : "+mgr);
        System.out.println("Employeee Salary : "+empsal);
        System.out.println("Employee comisssion : "+empcomm);
    }

}
