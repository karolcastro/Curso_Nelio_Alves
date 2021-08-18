package br.com.cursoNelioAlves.orientacaoAObjetos.exercicioComOrientacaoAObjetos.retangulo.application;

import br.com.cursoNelioAlves.orientacaoAObjetos.exercicioComOrientacaoAObjetos.retangulo.entities.RetanguloEntities;

import java.util.Locale;
import java.util.Scanner;

public class RetanguloProgram {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner start = new Scanner(System.in);

        RetanguloEntities retanguloEntities = new RetanguloEntities();

        System.out.println("Enter the width: ");
        retanguloEntities.width = start.nextDouble();

        System.out.println("Enter the heigth: ");
        retanguloEntities.height = start.nextDouble();

        System.out.println("AREA = " + retanguloEntities.area());
        System.out.println("PERIMETER = " + retanguloEntities.perimeter());
        System.out.printf("DIAGONAL = %.2f%n ", retanguloEntities.diagonal());
    }
}