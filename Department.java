/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HRApp;

/**
 *
 * @author JJ
 */
public class Department {
    
    //Create a 'private Employee' array field to store all Employees in a Department. The Department should have a capcity of 10 Employees.
    private String name;
    private Employee[] emps = new Employee[10];

    //constructor
    public Department(String name) {
        this.name = name;
    }
    //encapsulation: getter, setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //Provide a method to add an employee to the Department. Ensure the number of Employees does not exceed the Department's capacity. 
    public void addEmployee (Employee employee) { //addEmployee method takes an Employee object as argument
        for(Employee e: emps){                    //for each loop
            if (e == null) {                      //checks if Employee object, variable e is null
                e = employee;
                break;
            }
        }
    }
    
}
