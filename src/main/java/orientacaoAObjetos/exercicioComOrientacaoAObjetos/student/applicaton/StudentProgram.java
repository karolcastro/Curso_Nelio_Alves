package orientacaoAObjetos.exercicioComOrientacaoAObjetos.student.applicaton;

import orientacaoAObjetos.exercicioComOrientacaoAObjetos.student.entities.StudentEntities;

import java.util.Locale;
import java.util.Scanner;

public class StudentProgram {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner start = new Scanner(System.in);

        StudentEntities studentEntities = new StudentEntities();

        System.out.println("Students's name: ");
        studentEntities.name = start.nextLine();

        System.out.println("Students's grade 1: ");
        studentEntities.grade1 = start.nextDouble();

        System.out.println("Students's grade 2: ");
        studentEntities.grade2 = start.nextDouble();

        System.out.println("Students's grade 3: ");
        studentEntities.grade3 = start.nextDouble();

        System.out.printf("Final grade = %.2f%n", studentEntities.finalGrade());

        System.out.println();
        if (studentEntities.finalGrade() < 60.00) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n" , studentEntities.missingPoint());
        } else {
            System.out.println("PASS");
        }

        start.close();
    }
}