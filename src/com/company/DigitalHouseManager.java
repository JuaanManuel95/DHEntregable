package com.company;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.List;

public class DigitalHouseManager {

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

    public void altaProfesorAdjunto(String nombre, String apellido, Integer codigoDeProfesor, Integer horasDeConsulta){
        Profesor unProfesorAdjunto = new ProfesorAdjunto(nombre, apellido, codigoDeProfesor,horasDeConsulta);
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

    public void inscribirAlumno(Integer codigoAlumno, Integer codigoCurso){
        Curso cursoAComenzar = null;
        Alumno alumnoASumar = null;
        for(Curso curso : listaDeCursos){
            if(codigoCurso.equals(curso.getCodigoDeCurso())){
                cursoAComenzar = curso;
                break;
            }
        }

        for(Alumno alumno : listaDeAlumnos){
            if(codigoAlumno.equals(alumno.getCodigoDeAlumno())){
                alumnoASumar = alumno;
                break;
            }
        }

        if(cursoAComenzar.agregarUnAlumno(alumnoASumar)) {
            Inscripcion nuevaInscripcion = new Inscripcion(alumnoASumar, cursoAComenzar);
            listaDeInscripcion.add(nuevaInscripcion);
            System.out.println("El alumno ha sido inscripto con éxito.");
        } else {
            System.out.println("El alumno no se ha podido incorporar.");
        }

    }

    public void asignarProfesores(Integer codigoCurso, Integer codigoProfesorTitular, Integer codigoProfesorAdjunto){
        ProfesorTitular asignarProfesorTitular = null;
        ProfesorAdjunto asignarProfesorAdjunto = null;
        Curso asignarCurso = null;
        for (Profesor profesor : listaDeProfesores){
            if(codigoProfesorTitular.equals(profesor.getCodigoDeProfesor())){
                asignarProfesorTitular = (ProfesorTitular) profesor;
                break;

            }
        } System.out.println("El profesor titular ha sido asignado.");

        for (Profesor profesor : listaDeProfesores){
            if(codigoProfesorAdjunto.equals(profesor.getCodigoDeProfesor())){
                asignarProfesorAdjunto = (ProfesorAdjunto) profesor;
                break;
            }
        }
        System.out.println("El profesor adjunto ha sido asignado.");

        for (Curso curso : listaDeCursos){
            if(codigoCurso.equals(curso.getCodigoDeCurso())){
                asignarCurso = curso;
                break;
            }
        }
        System.out.println("El curso ha sido asignado con éxito.");

    }

}
