/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication17;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Home
 */
public class JavaApplication17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Calendar cal = GregorianCalendar.getInstance();
        System.out.println(cal.get(Calendar.YEAR));
    }
    
}
