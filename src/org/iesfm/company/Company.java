package org.iesfm.company;

import org.iesfm.company.exceptions.DepartmentNotFoundException;
import org.iesfm.company.exceptions.EmployeeNotFoundException;

import java.util.Arrays;
import java.util.Objects;

public class Company {
    private String name;
    private String cif;
    private Department[] departments;

    public Company(String name, String cif, Department[] departments) {
        this.name = name;
        this.cif = cif;
        this.departments = departments;
    }

    public Employee[] findDepartmentEmployees(String departmentName) throws DepartmentNotFoundException {
//        for (Department department : departments) {
//            if (department.getName().equals(departmentName)) {
//                return department.getEmployees();
//            }
//        }
//        throw new DepartmentNotFoundException();
        Department department = findDepartmentByName(departmentName);
        return department.getEmployees();
    }

    public Department findDepartmentByName(String departmentName) throws DepartmentNotFoundException {
        for (Department department : departments) {
            if (department.getName().equals(departmentName)) {
                return department;
            }
        }
        throw new DepartmentNotFoundException(departmentName);
    }

    public Employee findEmployeeByNif(String nif) throws EmployeeNotFoundException {
        for (Department department : departments) {
            for (Employee employee : department.getEmployees()) {
                if (employee.getNif().equals(nif)) {
                    return employee;
                }
            }
        }
        throw new EmployeeNotFoundException(nif);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public Department[] getDepartments() {
        return departments;
    }

    public void setDepartments(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return Objects.equals(getName(), company.getName()) && Objects.equals(getCif(), company.getCif()) && Arrays.equals(getDepartments(), company.getDepartments());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getName(), getCif());
        result = 31 * result + Arrays.hashCode(getDepartments());
        return result;
    }
}
