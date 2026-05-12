/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication24;

import java.util.Scanner;

/**
 *
 * @author Home
 */
public class JavaApplication24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("digite o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.println("digite a nota do aluno ");
        float nota = teclado.nextFloat();
        System.out.printf("a note de %s é %.2f", nome, nota);   
        
    }
    
}
