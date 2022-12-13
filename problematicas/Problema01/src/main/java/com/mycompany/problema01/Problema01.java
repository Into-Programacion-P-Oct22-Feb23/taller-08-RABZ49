/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author roberto
 */
public class Problema01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int control;
        int contador;
        String nombre;
        String posicion;
        int edad;
        int promedioE = 0;
        double estatura;
        double promedioEs = 0;
        String mensaje = "";
        String mensaje2 = "";

        System.out.println("Ingrese el número de jugadores a ingresar:");
        control = entrada.nextInt();

        for (contador = 1; contador <= control; contador++) {
            entrada.nextLine();
            System.out.println("Ingrese el nombre del jugador:");
            nombre = entrada.nextLine();
            System.out.println("Ingrese la posición en el campo:");
            posicion = entrada.nextLine();
            System.out.println("Ingrese la edad del jugador:");
            edad = entrada.nextInt();
            System.out.println("Ingrese la estatura del jugador:");
            estatura = entrada.nextDouble();
            promedioE = promedioE + edad;
            promedioEs = promedioEs + estatura;
            mensaje = String.format("""
                                    %s%d. %s -%s-, edad %d, estatura %.2f
                                    """, mensaje, contador,
                    nombre, posicion,
                    edad, estatura);
            mensaje2 = String.format("%s \n ->%s", mensaje2,
                    edad);
        }
        promedioE = promedioE / control;
        promedioEs = promedioEs / control;
        System.out.printf("""
                          %s 
                          Listado de edades.
                          %s
                           Promedio de edades:%s 
                           Promedio de estaturas:%.2f""", mensaje,
                mensaje2, promedioE, promedioEs);
    }

}
