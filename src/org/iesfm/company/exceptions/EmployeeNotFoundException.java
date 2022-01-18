package org.iesfm.company.exceptions;

public class EmployeeNotFoundException extends Exception {
    private String nif;

    public EmployeeNotFoundException(String nif) {
        super("No se ha encontrado el empleado con NIF " + nif);
        this.nif = nif;
    }

    public String getNif() {
        return nif;
    }
}
