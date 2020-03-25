package com.company;

public class ProfesorTitular extends Profesor {
    public ProfesorTitular(String nombre, String apellido, Integer antiguedad, Integer codigoDeProfesor) {
        super(nombre, apellido, antiguedad, codigoDeProfesor);
    }

    private String especialidad;

}
