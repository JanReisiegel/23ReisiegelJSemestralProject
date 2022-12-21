/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Reisiegel.Jan.SemestralProject;

import static Reisiegel.Jan.SemestralProject.UI.*;

/**
 *
 * @author jan
 */
public class SemestralProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean isEnd = false;
        System.out.println("Vitejte v semestralni projektu.");
        while (!isEnd) {
            switch (displayMenu()) {
                case 0 -> {
                    isEnd = true;
                    break;
                }
                case 1 -> {
                    VanocniUloha.printGift();
                    break;
                }
                case 2 -> {
                    matrixTransform();
                    break;
                }

            }
        }
    }

    public static void matrixTransform() {
        while (true) {
            System.out.println("Pocet radku: ");
            int n = sc.nextInt();
            if (n <= 0) {
                return;
            }
            System.out.println("Pocet sloupcu: ");
            int m = sc.nextInt();
            System.out.println("Zadejte hodnoty matice: ");
            int[][] matrix = MatrixTools.loadInt(n, m);
            System.out.println("Matice: ");
            MatrixTools.display(matrix);
            while (true) {
                System.out.println("Zadej hodnotu transformace (-1=-90, 1=90 a 0=0): ");
                int tr = sc.nextInt();
                if (tr != 0 && Math.abs(tr) != 1) {
                    break;
                }
                matrix = MatrixTools.matrixTransform(matrix, tr);
                System.out.println("Transformovana matice: ");
                MatrixTools.display(matrix);
            }
        }
    }

}
