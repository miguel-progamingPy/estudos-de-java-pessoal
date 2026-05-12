/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication19;

import java.util.Scanner;

/**
 *
 * @author Home
 */
public class JavaApplication19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("digite o nome do aluno: ");
        String nome =  teclado.nextLine();
        System.out.print("digite a nota do aluno: ");
        float nota = teclado.nextFloat();
        System.out.format("a nota de %s é %.1f", nome, nota);
        
    }
    
    
}
