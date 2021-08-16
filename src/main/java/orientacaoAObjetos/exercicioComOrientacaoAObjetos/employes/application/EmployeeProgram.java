package orientacaoAObjetos.exercicioComOrientacaoAObjetos.employes.application;

import orientacaoAObjetos.exercicioComOrientacaoAObjetos.employes.entities.EmployeeEntities;

import java.util.Locale;
import java.util.Scanner;

public class EmployeeProgram {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner start = new Scanner(System.in);

        EmployeeEntities employeeEntities = new EmployeeEntities();

        System.out.println("The name of employee:");
        employeeEntities.name = start.next();

        System.out.println("The gross salary:");
        employeeEntities.grossSalary = start.nextDouble();

        System.out.println("The tax:");
        employeeEntities.tax = start.nextDouble();

        System.out.println("Employee: " + employeeEntities);

        System.out.println();
        System.out.println("wich percentage to increase salary: ");
        double percentage = start.nextDouble();
        employeeEntities.increaseSalary(percentage);

        System.out.println();
        System.out.println("Upadate data: " + employeeEntities);



    }
}
