package com.bhushitham.assignment.utilities;

import com.bhushitham.assignment.employee.Employee;
import com.bhushitham.assignment.employee.Manager;
import com.bhushitham.assignment.employee.Developer;

//  Utility class for performing operations on Employee objects.
 
public class EmployeeUtilities {

    //  Method to calculate bonus for an Employee.
     
    public double calculateBonus(Employee employee) {
       
        return employee.getSalary() * 0.1; // 10% of salary as bonus
    }

    //method to print employee details.
    public void printEmployeeDetails(Employee employee) {
        System.out.println("Name: " + employee.getName());
        System.out.println("Employee ID: " + employee.getEmpid());
        System.out.println("Salary: " + employee.getSalary());

        if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Manager ID: " + manager.getManagerid());
        } else if (employee instanceof Developer) {
            Developer developer = (Developer) employee;
            System.out.println("Developer ID: " + developer.getDId());
        }
    }
}
