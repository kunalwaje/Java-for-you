package Oops.src;
class EmployeeDriver
{
    public static void main(String [] args)
    {
        System.out.println("***********Employee Details***********");
        Employee e1=new Employee(101,"Kunal",965770810,"kunalwaje28@gmail.com","Pune","TCS","Bangalore","Development","Associate Software Developer","John",500000.00);
        e1.displayEmployee();

        System.out.println("----------------------------------------");

        Employee e2=new Employee(102,"Akash",928467688,"akash007@gmail.com","Mumbai","HCL","Chennai","Testing","Test Engineer","Anna",350000.00,3000.00);
        e2.displayEmployee();
    }
}