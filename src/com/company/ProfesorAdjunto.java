package com.company;

public class ProfesorAdjunto extends Profesor {
    public ProfesorAdjunto(String nombre, String apellido, Integer antiguedad, Integer codigoDeProfesor) {
        super(nombre, apellido, antiguedad, codigoDeProfesor);
    }

    public Integer horasdeConsultas;
}
