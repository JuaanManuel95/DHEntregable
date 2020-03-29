package com.company;

import com.digitalhouse.Estudioso;

import java.util.Objects;

public class Alumno implements Estudioso {


    private String nombre;
    private String apellido;
    private Integer codigoDeAlumno;
    private Boolean esEstudioso;

    public Alumno(String nombre, String apellido, Integer codigoDeAlumno, Boolean esEstudioso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigoDeAlumno = codigoDeAlumno;
        this.esEstudioso = esEstudioso;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getCodigoDeAlumno() {
        return codigoDeAlumno;
    }

    public Boolean getEsEstudioso() {
        return esEstudioso;
    }


    @Override
    public boolean equals(Object alumnoAComparar) {
        if (!(alumnoAComparar instanceof Alumno)) {
            return false;
        }
        Alumno otroAlumno = (Alumno) alumnoAComparar;
        return otroAlumno.getCodigoDeAlumno().equals(this.codigoDeAlumno);
    }

    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", codigoDeAlumno=" + codigoDeAlumno +
                '}';


    }

    @Override
    public Boolean esEstudioso() {
        return this.esEstudioso;
    }
}



