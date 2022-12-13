/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.problema03;

/**
 *
 * @author roberto
 */
public class Problema03 {

    public static void main(String[] args) {
        int contador;
        double fahrenheit = 20;
        double celcius;
        String mensaje = "";
        mensaje = mensaje + "F°\tC°\n";

        for (contador = 1; contador <= 20; contador++) {
            celcius = (fahrenheit - 32) * 5 / 9;
            mensaje = String.format("""
                                    %s%.2f\t%.2f
                                    """, mensaje, fahrenheit,
                    celcius);
            fahrenheit += 4;
            // el (+=) sirve para suma y asignacion
        }
        System.out.println(mensaje);
    }

}
