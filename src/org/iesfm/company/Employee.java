package org.iesfm.company;

import java.util.Objects;

public class Employee {
    private String nif;
    private String name;
    private String surname;
    private String role;

    public Employee(String nif, String name, String surname, String role) {
        this.nif = nif;
        this.name = name;
        this.surname = surname;
        this.role = role;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(getNif(), employee.getNif()) && Objects.equals(getName(), employee.getName()) && Objects.equals(getSurname(), employee.getSurname()) && Objects.equals(getRole(), employee.getRole());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNif(), getName(), getSurname(), getRole());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("nif='").append(nif).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", surname='").append(surname).append('\'');
        sb.append(", role='").append(role).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
