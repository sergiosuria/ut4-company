package org.iesfm.company.exceptions;

public class DepartmentNotFoundException extends Exception {
    private String departmentName;

    public DepartmentNotFoundException(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }
}
