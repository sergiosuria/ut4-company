package org.iesfm.company;

import java.util.Arrays;
import java.util.Objects;

public class Department {
    private String name;
    private Employee[] employees;

    public Department(String name, Employee[] employees) {
        this.name = name;
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Objects.equals(getName(), that.getName()) && Arrays.equals(getEmployees(), that.getEmployees());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getName());
        result = 31 * result + Arrays.hashCode(getEmployees());
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Department{");
        sb.append("name='").append(name).append('\'');
        sb.append(", employees=").append(Arrays.toString(employees));
        sb.append('}');
        return sb.toString();
    }
}
