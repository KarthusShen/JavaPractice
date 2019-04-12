import java.io.*;
public class EmployeeTest{

    public static void main(String[] args) {
	Employee emp1 = new Employee("EMP1");
	Employee emp2 = new Employee("EMP2");

	emp1.empAge(26);
	emp1.empDesignation("高级程序员");
	emp1.empSalary(150000);
	emp1.printEmployee();

	emp2.empAge(21);
	emp2.empDesignation("菜鸟程序员");
	emp2.empSalary(5000);
	emp2.printEmployee();
    }
}
