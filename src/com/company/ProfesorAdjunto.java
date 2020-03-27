package com.company;

public class ProfesorAdjunto extends Profesor {
    public ProfesorAdjunto(String nombre, String apellido, Integer codigoDeProfesor) {
        super(nombre, apellido, codigoDeProfesor);
    }

    public Integer horasdeConsultas;
}
