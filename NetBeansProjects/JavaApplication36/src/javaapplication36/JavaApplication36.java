package javaapplication36;

import java.util.Scanner;
/*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
// */


/**
 *
 * @author Home
 */
public class JavaApplication36 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner nome = new Scanner (System.in);
     System.out.println("Quantas vezes ?: ");
     int n = nome.nextInt();
     int cc = 1;
     while (cc<=n)  {
        System.out.println("cambalhota" +cc);
        cc++;
     }
   }
}

