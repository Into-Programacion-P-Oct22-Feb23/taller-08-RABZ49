/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.problemas02;

/**
 *
 * @author roberto
 */
public class Problemas02 {

    public static void main(String[] args) {
        int numero1 = 25;
        int numero2;
        int numero3;
        int numero4;
        int contador;
        String mensaje = "";
        mensaje = mensaje + "N°\tx2\tx3\tx4\n";
        
        for(contador = 25; contador >= 1; contador--){
            numero2 = numero1 * 2;
            numero3 = numero1 * 3;
            numero4 = numero1 * 4;
            mensaje = String.format("%s%d\t%d\t%d\t%d\n", mensaje,
                    numero1, numero2, numero3, numero4);
            numero1--;
            numero2--;
            numero3--;
            numero4--;
            // el (--) se usa para disminuir un número, (decrementar).
        }
        System.out.println(mensaje);   
    }
    
}