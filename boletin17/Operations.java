/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin17;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author Adri
 */
public class Operations {

    public static int[] initArray(int numero[], int x, int y) {
        for (int i = 0; i < numero.length; i++) {
            numero[i] = (int) (Math.random() * x) + y;
        }
        return numero;
    }

    public static int[] showArray(int numero[]) {
        for (int i = numero.length - 1; i >= 0; i--) {
            System.out.println(numero[i]);
        }
        return numero;
    }

    public static int avgArray(int numero[]) {
        int sum = 0;
        for (int i = 0; i < numero.length; i++) {
            sum += numero[i];
        }
        return sum / numero.length;
    }

    public static void passAndFail(int numero[]) {
        int pass = 0;
        int fail = 0;
        for (int i = 0; i < numero.length; i++) {
            if (numero[i] < 5) {
                fail++;
            } else {
                pass++;
            }
        }
        System.out.println("Passes: " + pass);
        System.out.println("Fails: " + fail);
    }

    public static double highestGrade(int numero[]) {
        int max = numero[0];
        for (int i = 0; i < numero.length; i++) {
            if (numero[i] > max) {
                max = numero[i];
            }
        }
        return max;
    }

    public static String[][] initMatrix(String matrix[][]) {
        String str[] = new String[]{"Arturo", "Carlos", "Daniel", "Ana", "Isabel"};
        for (String[] i : matrix) {
            for (int j = 0; j < i.length; j++) {
                if (j == 0) {
                    i[j] = str[(int) (Math.random() * 5)];
                } else {
                    i[j] = String.valueOf((int) (Math.random() * 10) + 1);
                }
            }
        }
        return matrix;
    }

    public static void showMatrix(String matrix[][]) {
        for (String[] i : matrix) {
            for (String j : i) {
                JOptionPane.showMessageDialog(null, j);
            }
        }

    }

    public static void showGrade(String matrix[][], String alumno) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][0].equals(alumno)) {
                    JOptionPane.showMessageDialog(null, "Grade of " + alumno + ": " + matrix[i][1]);
                    System.exit(0);
                } else {
                    JOptionPane.showMessageDialog(null, "Name not found");

                }

            }
        }
    }

    public static void passList(String matrix[][]) {
        ArrayList<String> namePass = new ArrayList<String>(); //Creamos arraylist
        for (int i = 0; i < matrix.length; i++) {
            //Metemos los nombres de los alumnos aprobados en el arraylist
            if (Integer.parseInt(matrix[i][1]) >= 5) {
                namePass.add(matrix[i][0]);
            }
        }
        Iterator<String> aux = namePass.iterator(); //Iterador para recorrer el arraylist
        while (aux.hasNext()) {
            System.out.println(aux.next());
        }
    }

//    public ArrayList<String> funcion1(String matrix[][]) {
//        ArrayList<String> toRet = new ArrayList<String>();
//        int max = 10;
//        String persona = null;
//        for (int i = 0; i < matrix.length; i++) {
//            if (Integer.parseInt(matrix[i][1]) >= 5 && Integer.parseInt(matrix[i][1]) < max) {
//                max = Integer.parseInt(matrix[i][1]);
//                persona = matrix[i][0];
//                matrix[i][1] = "0";
//
//            }
//        }
//
//    }
    public static String letraNIF(int nif) {
        String letras[] = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        return letras[nif%23];
    }
}
