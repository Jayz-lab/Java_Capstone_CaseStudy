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
    public void addEmp(Employee anEmployee){
        /*
        Increment lasAddedEmployeeIndex and add employee to this position in the employee array.
        when adding new employee to the employees array, consider the length of the array.
        You can stop adding extra employees once you have reached your employee array capacity.
        */
        if (lasAddedEmployeeIndex < employees.length){
            lasAddedEmployeeIndex++;
            employees[lasAddedEmployeeIndex]= anEmployee;
        }
    }
    /*
    public void addEmployee (Employee employee) { //addEmployee method takes an Employee object as argument
        for(Employee e: emps){                    //for each loop
            if (e == null) {                      //checks if Employee object, variable e is null
                e = employee;
                break;
            }
        }
    }
    */
    //Provide a method to return the number of Employees currently in the Department.This Array must not contain null values.
    public Employee[] getEmployees() {
        /*
        The idea of this algorithm is to return an array of employees,
        that contains the exact number of elements that matches the actual
        number of employees in this department.
        This can be calculated by adding one to the lasAddedEmployeeIndex variable.
        You then copy the references for relevant employee object from employees array,
        to this new array and return it to the invoker.
        This way the invoker always gets an array that is already trimed to exact required size.
         */
        Employee[] actualEmployees = new Employee[lasAddedEmployeeIndex + 1];

        for (int i = 0; i < actualEmployees.length; i++) {
            actualEmployees[i] = employees[1];
        }
        return actualEmployees;
    }
    //provide a method to return the number of Employees currently in the department
    public int getEmployeeCount() {
        /*
        Variable lasAddedEmployeeIndex indicates last valid position in the employee array.
        Because array indexing starts at zero, you need to add one to get the number of elements.
        */
        return lasAddedEmployeeIndex;
    }
    //Provide a method to identify an Employee based on their identification number. Return the Employee object if it exists.
    public Employee getEmployeeByID(int empID){
        /*
        You may also reserve a local variable, assign employee object to this variable
        and break out of the loop, when required employee has been located.
        
        Employee result = null;
        for (Employee emp; employees) {
            if (emp.getId() == (empId) {
                result = emp;
                break;
            }
        }
        return result;
        
        Infact, result variable will be null if no employee with matching id would be found
        
        However, you may simply return required object once its found
        and return null if no employee with a given id has been found.
        */
        for (Employee emp : employees) {
            if (emp.getID() == (empID)) {
                return emp;
            }
        }return null;
    }   
    //Provide a method that returns the total salary of all Employees in the Department.
    public double getTotalSalary(){
        /*
        Because employee array may be partially filled with values, you need to star at position zero
        and stop at the element indicated by the lasAddedEmployeeIndex variable
        Calculate running total value and return the result.
        */
        double totalSalary = 0.0;
        for (int i = 0; i <= lasAddedEmployeeIndex; i++){
            totalSalary += employees[i].getSalary();
        }
        return totalSalary;
    }
    //Provide a method that returns the average salary of Employees in the Department.
    public double getAverageSalary(){
        /*
        To calculate average salary, calculate total and divide it by number of elements.
        use existing method above to calculate total.
        Find out the number of employees in the array by adding one to the lastAddedEmployeeIndex variable.
        If there are no employees in the array than you can return zero as the average does not make much sense in this case
        */
        if (lasAddedEmployeeIndex > -1){
            return getTotalSalary() / (lasAddedEmployeeIndex+1);
        }
        return 0.0;
    }
    @Override
    public String toString(){
        return name;
    }

}
