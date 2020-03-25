package com.company;

import java.util.ArrayList;
import java.util.List;

public class Curso {



    private String nombre;
    private Integer codigoDeCurso;
    private ProfesorTitular profesorTitular;
    private ProfesorAdjunto profesorAdjunto;
    private Integer cupoMaximoDeAlumnos;
    private List<Alumno> listaDeAlumnos;


    public Curso(String nombre, Integer codigoDeCurso, ProfesorTitular profesorTitular, ProfesorAdjunto profesorAdjunto, Integer cupoMaximoDeAlumnos, List<Alumno> listaDeAlumnos) {
        this.nombre = nombre;
        this.codigoDeCurso = codigoDeCurso;
        this.profesorTitular = profesorTitular;
        this.profesorAdjunto = profesorAdjunto;
        this.cupoMaximoDeAlumnos = cupoMaximoDeAlumnos;
        this.listaDeAlumnos = new ArrayList<>();
    }

    public boolean agregarUnAlumno(Alumno unAlumno){
        if(this.cupoMaximoDeAlumnos > this.listaDeAlumnos.size()){
            listaDeAlumnos.add(unAlumno);
            System.out.println("El alumno ha sido agregado con éxito.");
            return true
        } else{
            return false;
            System.out.println("El curso está completo.");
        }
    }

    public void eliminarAlumno(Alumno unAlumno){
        this.listaDeAlumnos.remove(unAlumno);
        System.out.println("El alumno ha sido retirado del curso.");
    }



    public ProfesorTitular getProfesorTitular() {
        return profesorTitular;
    }

    public ProfesorAdjunto getProfesorAdjunto() {
        return profesorAdjunto;
    }

    public Integer getCupoMaximoDeAlumnos() {
        return cupoMaximoDeAlumnos;
    }

    public List<Alumno> getListaDeAlumnos() {
        return listaDeAlumnos;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCodigoDeCurso() {
        return codigoDeCurso;
    }

    public void setCodigoDeCurso(Integer codigoDeCurso) {
        this.codigoDeCurso = codigoDeCurso;
    }
}
