/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiposprimitivo;

import java.util.Scanner;

/**
 *
 * @author Home
 */
public class TiposPrimitivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("escreva o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.print("escreva a nota do aluno: ");
        float nota = teclado.nextFloat();
        System.out.format("a nota de %s é %.1f \n"  , nome, nota );
    }
    
}
