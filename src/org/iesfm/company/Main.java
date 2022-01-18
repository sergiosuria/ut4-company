package org.iesfm.company;

import org.iesfm.company.exceptions.DepartmentNotFoundException;
import org.iesfm.company.exceptions.EmployeeNotFoundException;

public class Main {

    public static void main(String[] args) {

        Employee[] marketingEmployees = {
                new Employee("3243234", "Peppa", "Pig", "Jefa")
        };

        Employee[] itEmployees = {
                new Employee("23434343", "Bob", "Espoja", "Programador"),
                new Employee("43333", "George", "Pig", "Programador")
        };

        Department[] departments = {
                new Department("Informatica", itEmployees),
                new Department("Marketing", marketingEmployees)
        };


        Company company = new Company(
                "Mikel S.A.",
                "C-3243423",
                departments
        );

        try {
            Department department = company.findDepartmentByName("Marketing");
            System.out.println(department.toString());
        } catch (DepartmentNotFoundException e) {
            System.out.println("No se ha encontrado el departamento " + e.getDepartmentName());
        }
        try {
            Department department2 = company.findDepartmentByName("Marketing II");
            System.out.println(department2.toString());
        } catch (DepartmentNotFoundException e) {
            System.out.println("No se ha encontrado el departamento " + e.getDepartmentName());
        }
        try {
            Department department3 = company.findDepartmentByName("Marketing III");
            System.out.println(department3.toString());
        } catch (DepartmentNotFoundException e) {
            System.out.println("No se ha encontrado el departamento " + e.getDepartmentName());
        }
        try {
            Employee[] employees = company.findDepartmentEmployees("Informatica");
            for (Employee employee : employees) {
                System.out.println(employee.toString());
            }
        } catch (DepartmentNotFoundException e) {
            System.out.println("No se ha encontrado el departamento " + e.getDepartmentName());
        }

        try {
            Employee peppa = company.findEmployeeByNif("3243333234");
            System.out.println(peppa);
        } catch (EmployeeNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
}
