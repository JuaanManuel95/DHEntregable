package com.company;

//--------- PUNTO K --------
//En el UML, dentro de la clase "Alumno", le agregaría el atributo "-listaDeInscripciones: List<Inscripcion>"
// y el método correspondiente para recorrer dicha lista y asi ver en que cursos se ha anotado.

import com.digitalhouse.DHException;
import com.digitalhouse.DigitalException;
import com.digitalhouse.OtherException;

public class Main {

    public static void main(String[] args) {

        Alumno unAlumno = new Alumno("Ciro", "Gonzalez", 420, true);
        DigitalHouseManager digitalHouseManager = new DigitalHouseManager();

        digitalHouseManager.altaProfesorTitular("Albus", "Dumbledore", 001, "Artes Oscuras");
        digitalHouseManager.altaProfesorTitular("Severus", "Snape", 002, "pociones");
        digitalHouseManager.altaProfesorAdjunto("Remus", "Lupin", 003, 4);
        digitalHouseManager.altaProfesorAdjunto("Dolores", "Umbridge", 004, 3);

        digitalHouseManager.altaCurso("Full Stack", 20001, 3);
        digitalHouseManager.altaCurso("Android", 20002, 2);

        digitalHouseManager.asignarProfesores(20001, 001, 003);
        digitalHouseManager.asignarProfesores(20002, 002, 004);

        digitalHouseManager.altaAlumno("Harry", "Potter", 100, false);
        digitalHouseManager.altaAlumno("Ronald", "Weasley", 101, false);
        digitalHouseManager.altaAlumno("Hermione", "Granger", 102, true);

        digitalHouseManager.inscribirAlumno(100, 20001);
        digitalHouseManager.inscribirAlumno(101, 20001);
        digitalHouseManager.inscribirAlumno(100, 20002);
        digitalHouseManager.inscribirAlumno(101, 20002);
        digitalHouseManager.inscribirAlumno(102, 20002);

        digitalHouseManager.bajaProfesor(004);

        digitalHouseManager.bajaCurso(20001);


        try {
            DigitalException.inscripcionDH(unAlumno);
        } catch (DHException e) {
            e.printStackTrace();
            System.out.println("Venir al colearning.");
        } catch (OtherException e) {
            e.printStackTrace();
            System.out.println("Hablar con alumnos.");
        }

    }

}





