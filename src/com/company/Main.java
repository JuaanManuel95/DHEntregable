package com.company;

public class Main {

    public static void main(String[] args) {
        DigitalHouseManager digitalHouseManager = new DigitalHouseManager();

        digitalHouseManager.altaProfesorTitular("Albus","Dumbledore", 001, "Artes Oscuras");
        digitalHouseManager.altaProfesorTitular("Severus", "Snape", 002, "pociones");
        digitalHouseManager.altaProfesorAdjunto("Remus", "Lupin", 003);
        digitalHouseManager.altaProfesorAdjunto("Dolores", "Umbridge", 004);

        digitalHouseManager.altaCurso("Full Stack", 20001, 3);
        digitalHouseManager.altaCurso("Android", 20002, 2);

        digitalHouseManager.asignarProfesores(20001, 001, 003);
        digitalHouseManager.asignarProfesores(20002, 002, 004);

        digitalHouseManager.altaAlumno("Harry", "Potter", 100);
        digitalHouseManager.altaAlumno("Ronald", "Weasley", 101);
        digitalHouseManager.altaAlumno("Hermione", "Granger", 102);

        digitalHouseManager.inscribirAlumno(100, 20001);
        digitalHouseManager.inscribirAlumno(101, 20001);
        digitalHouseManager.inscribirAlumno(100, 20002);
        digitalHouseManager.inscribirAlumno(101, 20002);
        digitalHouseManager.inscribirAlumno(102, 20002);

        digitalHouseManager.bajaProfesor(004);

        digitalHouseManager.bajaCurso(20001);






    }
}
