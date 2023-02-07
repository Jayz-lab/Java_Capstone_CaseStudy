/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HRApp;

/**
 *
 * @author JJ
 */

//Employee Class
//Each Employee has and int identification number, a String name, and a double salary.
public class Employee {
    private int ID;
    private String name;
    private double salary;
    
    //initialize these fields with a constructor
    public Employee(int idNumber, String name, double salary) {
        this.ID = idNumber;
        this.name = name;
        this.salary = salary;
    }

    //Encapsulate all fields and provide getter and setter methods for each.
    public int getID() {
        return ID;
    }

    public void setID(int idNum) {
        this.ID = idNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    //Override the 'toString() method' ro print these fields.
    @Override
    public String toString(){
        return "Employee: " + getID() + getName() + getSalary();
    }
    
    
}
