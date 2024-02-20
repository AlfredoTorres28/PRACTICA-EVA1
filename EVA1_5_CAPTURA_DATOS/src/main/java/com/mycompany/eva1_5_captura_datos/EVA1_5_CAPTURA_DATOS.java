/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_5_captura_datos;

import java.util.Scanner;

/**
 *
 * @author jealt
 */
public class EVA1_5_CAPTURA_DATOS {

    public static void main(String[] args) {
        //DECLARAR NUESTRAS VARIABLES
        String nombre;
        int edad;
        System.out.println("Introduce tu nombre");
        //CREAR NUESTRO SCANNER
        
        Scanner captura = new Scanner(System.in);
        //CAPTURA
        
        nombre = captura.nextLine();
        System.out.println("Introduce tu edad");
        edad = captura.nextInt();
        System.out.println("Tu nombre es: ");
        System.out.println(nombre);
        System.out.println("Tu edad es: ");
        System.out.println(edad);
               
    }
}
