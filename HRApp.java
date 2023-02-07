/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package HRApp;

/**
 *
 * @author JJ
 */
public class HRApp_Capstone_caseStudy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Test that it compiles, runs and prints the initial message
        System.out.println("HRApp starts.");
        
        //Test creating and printing an instance of the Employee class from the main method.
        Employee e1 = new Employee(2355, "JJ", 65000);
        Employee e2 = new Employee(2356, "Cassie", 65000);
        //System.out.println("Employee:" + e1);
        //System.out.println("Employee:" + e2);
        
        //Instantiate an instance of Department class
        Department dept = new Department("Education");
        
        dept.addEmp(e1);
        dept.addEmp(e2);
        dept.addEmp(new Employee(772, "Jake", 65000));

        Employee[] emps = dept.getEmployees();

        for (Employee emp : emps) {
            System.out.println("Emp " + emp);
        }
        System.out.println("Total " + dept.getTotalSalary());
        System.out.println("Average " + dept.getAverageSalary());
        System.out.println("Emp " + dept.getEmployeeByID(2355));
    }
    
}
