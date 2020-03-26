package com.company;

import java.util.ArrayList;
import java.util.List;

public abstract class DigitalHouseManager {

    private List<Alumno> listaDeAlumnos;
    private List<Profesor> listaDeProfesores;
    private List<Curso> listaDeCursos;
    private List<Inscripcion> listaDeInscripcion;

    public DigitalHouseManager() {
        this.listaDeAlumnos = new ArrayList<>();
        this.listaDeProfesores = new ArrayList<>();
        this.listaDeCursos = new ArrayList<>();
        this.listaDeInscripcion = new ArrayList<>();
    }

    public void altaCurso(String nombre, Integer codigoCurso, Integer cupoMaximoDeAlumnos){
        Curso unCurso = new Curso(nombre, codigoCurso, cupoMaximoDeAlumnos);
        listaDeCursos.add(unCurso);
        System.out.println("Se agregó el curso con éxito.");
    }


    public void bajaCurso(Integer codigoCurso){
        for (Curso curso : this.listaDeCursos) {
            if (curso.getCodigoDeCurso().equals(codigoCurso)){
                listaDeCursos.remove(curso);
                System.out.println("El curso ha sido eliminado.");
                break;
            }

        }

    }

    public void altaProfesorAdjunto(String nombre, String apellido, Integer codigoDeProfesor, Integer cantidadDeHoras){
        Profesor unProfesorAdjunto = new ProfesorAdjunto(nombre, apellido, codigoDeProfesor, cantidadDeHoras);
        this.listaDeProfesores.add(unProfesorAdjunto);
        System.out.println("El Profesor Adjunto se ha unido al curso.");
    }

    public void altaProfesorTitular(String nombre, String apellido, Integer codigoProfesor, String especialidad){
        Profesor unProfesorTitular = new ProfesorTitular(nombre, apellido, codigoProfesor, especialidad);
        this.listaDeProfesores.add(unProfesorTitular);
        System.out.println("El profesor titular se ha unido al curso.");

    }

    public void bajaProfesor(Integer codigoProfesor){
        for (Profesor profesor : listaDeProfesores){
            if (profesor.getCodigoDeProfesor().equals(codigoProfesor)){
                this.listaDeProfesores.remove(profesor);
                System.out.println("El profesor ha abandonado el curso.");
                break;
            }
        }
    }

    public void altaAlumno(String nombre, String apellido, Integer codigoAlumno){
        Alumno unAlumno = new Alumno(nombre,apellido, codigoAlumno);
        this.listaDeAlumnos.add(unAlumno);
        System.out.println("El alumno se ha inscripto correctamente.");
    }







}
