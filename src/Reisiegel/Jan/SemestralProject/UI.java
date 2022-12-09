/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reisiegel.Jan.SemestralProject;

import java.util.Scanner;

/**
 *
 * @author jan
 */
public class UI {
    static Scanner sc =new Scanner(System.in);
    private UI() {}
    
    public static int displayMenu(){
            System.out.println("Co si prejete?");
            System.out.println("    1 - Vanocni uloha");
            System.out.println("    2 - Semestralni projekt");
            System.out.println("    0 - Konec");
            return sc.nextInt();
    }
}
