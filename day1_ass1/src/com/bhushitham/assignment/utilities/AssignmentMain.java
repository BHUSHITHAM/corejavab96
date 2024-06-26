package com.bhushitham.assignment.utilities;

import com.bhushitham.assignment.employee.Manager;
import com.bhushitham.assignment.employee.Developer;
import com.bhushitham.assignment.utilities.EmployeeUtilities;

public class AssignmentMain {

    public static void main(String[] args) {
        // Creating instances of Manager and Developer
        Manager manager = new Manager("ABC", "E11", 60000, "M1001");
        Developer developer = new Developer("XYZ", "E19", 50000, "D2001");

        // Using EmployeeUtilities methods
        EmployeeUtilities utils = new EmployeeUtilities();

        // Calculate and print bonus
        double managerBonus = utils.calculateBonus(manager);
        System.out.println("Bonus for Manager " + manager.getName() + ": Rs-" + managerBonus);

        double developerBonus = utils.calculateBonus(developer);
        System.out.println("Bonus for Developer " + developer.getName() + ": Rs-" + developerBonus);

        // Print employee details
        System.out.println("\nManager Details:");
        utils.printEmployeeDetails(manager);

        System.out.println("\nDeveloper Details:");
        utils.printEmployeeDetails(developer);
    }
}
