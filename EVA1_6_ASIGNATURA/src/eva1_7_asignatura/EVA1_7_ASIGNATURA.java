/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_7_asignatura;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_7_ASIGNATURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CLAVE, NOMBRE, CREDITOS, HrTEORICAS, HrPracticas, CARRERA, TipoMATERIA
        String clave, nombre, carrera;
        int creditos, Horas_de_teoria, Horas_de_practicas;
        boolean Tipo_de_materia;
        //CAPTURA
        Scanner captura = new Scanner(System.in);
        
        System.out.println("¿Cuál es la clave de tú materia?");
        clave = captura.nextLine();
        System.out.println("¿Como se llama tú materia?");
        nombre = captura.nextLine();
        System.out.println("¿Cuál es tú carrera?");
        carrera = captura.nextLine();
        System.out.println("¿Cuantos creditos tienes?");
        creditos = captura.nextInt();
        System.out.println("¿Cuantas horas teoricas son de la asignatura?");
        Horas_de_teoria = captura.nextInt();
        System.out.println("¿Cuantas horas practicas?");
        Horas_de_practicas = captura.nextInt();
        System.out.println("Introduce que tipo de asignatura es [TRUE_--> Generica --> FALSE_ESPECIALIDAD]");
        Tipo_de_materia = captura.nextBoolean();
        
        System.out.println("Datos de la asignatura:");
        System.out.println(clave);
        System.out.println(nombre);
        System.out.println(carrera);
        System.out.println(creditos);
        System.out.println(Horas_de_teoria);
        System.out.println(Horas_de_practicas);
        System.out.println(Tipo_de_materia);
    }
    
}
