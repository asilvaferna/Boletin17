/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin17;

import static java.lang.Math.E;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 *
 * @author Adri
 */
public class Boletin17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Ejercicio 1
        int numero[] = new int[6];
        Operations.initArray(numero, 50, 1);
        Operations.showArray(numero);
        //Ejercicio 2
        int alumnos[] = new int[30];
        Operations.initArray(alumnos, 10, 0);
        Operations.showArray(alumnos);
        System.out.println("Average: " + Operations.avgArray(alumnos));
        Operations.passAndFail(alumnos);
        Operations.highestGrade(alumnos);
        //Ejercicio 3
        String clase[][] = new String[5][2];
        Operations.initMatrix(clase);
        //  Operations.showMatrix(clase);
        String alumno = "Carlos";
         //Operations.showGrade(clase, alumno);
         System.out.println(Operations.letraNIF(53194793));
         System.out.println(Operations.letraNIF(45146277));

    }

}
