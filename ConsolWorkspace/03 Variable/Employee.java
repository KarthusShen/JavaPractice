import java.io.*;

public class Employee{

    //这个实例变量对子类可见
    public String name;

    //私有变量，仅对该类可见
    private double salary;

    //在构造器中对name 赋值
    public Employee(String empName){
	name = empName;
    }

    //设定salary的值
    public void setSalary(double empSalary){
	salary = empSalary;
    }

    public void printEmp(){
	System.out.println("名字：" + name);
	System.out.println("薪水：" + salary);
    }

    public static void main(String[] args){
	Employee emp1 = new Employee("RUNOOB");
	emp1.setSalary(15000);
	emp1.printEmp();
    }
}
