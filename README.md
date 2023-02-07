# Java_Capstone_CaseStudy
Oracle Explorer, Java basics capstone case study. Creating an API for a Human Resource Program.

## Suggested Methodology
- Read through the description until you feel you have a good understanding of what is being asked.
- Begin to design the 'Department' and 'Employee' classes. What fields and methods will they have?
- Create the project in NetBeans and the 'HRApp class' with the main method. Test that it compiles and runs and prints the initial message.
- Test creating and printing instances of 'Employees' from the main method.
- Create the 'Department' class. You should do this iteratively and incrementally, adding new methods as you need them, code it and test it.
- Start with the methods you feel most comfortable with and get those working first. Then turn to more difficult methods. 
- All the code needed to solve this case study is already presented in one form or another in the course materials. Feel free to research the web to get help if you need it.

### Case Study Challenge: Classes and Functionality
- Create Classes to model an Employee and Department.
- The Associated classes must utilize constructors, and their fields must be fully encapsulated.
- Employee data tracks an individual's ID, name and salary.
- It should also be possible to print this data on individual employees.
- A Department knows about each of its employees.
- Expect each Department to have a unique name, which can also be retrieved and printed.
- You'll need to write additional methods to allow processing of department data.
- Test your API within the main method of an additional class.


#### Employee Class
- Each Employee has an int indentification number, a String name, and a double salary.
- Encapsulate all fields, and provide getter and setter methods for each.
- Initialize these fields with a constructor.
- Override the toString() method to print these fields.

#### Department Class
Create additional fields as needed, as you write methods to process Department data. All fields must be private. Your program must not crash as a result of calling these methods.
- Create a 'private Employee' array field to store all Employees in a Department. The Department should have a capcity of 10 Employees.
- Provide a method to add an employee to the Department. Ensure the number of Employees does not exceed the Department's capacity. 
- Provide a method to return the number of Employees currently in the Department.This Array must not contain null values.
- Provide a method to identify an Employee based on their identification number. Return the Employee object if it exists.
- Provide a method to return the number of Employees currently in the department
- Provide a method that returns the total salary of all Employees in the Department.
- Provide a method that returns the average salary of Employees in the Department.

#### HRApp Class
This class contains a single main method. This is where you'll test the API you've written. This includes testing for scenarios where code may be vulnerable to crashing.
- Create a print statement to say the applications is starting.
- Create a new Department.
- Call toString() to rpint information about the Department.
- Locate an employee by their identification number. Call toString() to print the information about this Employee.
- Get every Employee in the Department and print their information.
- Print the total salary of the Department.
- Print the average salary of the Department.
