package com.company;

public class ProfesorAdjunto extends Profesor {
    public Integer horasdeConsultas;

    public ProfesorAdjunto(String nombre, String apellido, Integer codigoDeProfesor, Integer horasdeConsultas) {
        super(nombre, apellido, codigoDeProfesor);
        this.horasdeConsultas = horasdeConsultas;
    }
    public Integer getHorasdeConsultas(){
        return horasdeConsultas;
    }


}
