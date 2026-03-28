public class pract6 {     public class Employee{         int salary = 5000;         void calculateSalary(){ 
            System.out.println("Base Salary is "+salary); 
        } 
    } 
    public class FullTimeEmployee extends Employee{         int fsalary = salary*3;         void calculateSalary(){ 
            System.out.println("Full Time Employee Salary is "+ fsalary); 
        } 
    } 
    public class PartTimeEmployee extends Employee{         int psalary = salary*2;         void calculateSalary(){ 
            System.out.println("Part Time Employee Salary is "+ psalary); 
 
        } 
    } 
     public void main(String args[]){         Employee A = new Employee(); 
        A.calculateSalary(); 
        FullTimeEmployee abc = new FullTimeEmployee();         abc.calculateSalary(); 
        PartTimeEmployee B = new PartTimeEmployee();         B.calculateSalary(); 
     } 
} 
