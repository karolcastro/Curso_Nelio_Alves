package br.com.cursoNelioAlves.orientacaoAObjetos.exercicioComOrientacaoAObjetos.student.entities;

public class StudentEntities {

    public String name;
    public double grade1 = 30;
    public double grade2 = 35;
    public double grade3 = 35;

    public double finalGrade() {
        return grade1 + grade2 + grade3;
    }

    public double missingPoint() {
        if (finalGrade() < 60.00) {
            return 60.00 - finalGrade();
        }else {
            return 0.00;
        }
    }
}
