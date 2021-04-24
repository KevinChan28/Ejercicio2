/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado= new Scanner (System.in);
        String valor="";
        System.out.println("Elija una acción");
        valor=teclado.nextLine();
        switch (valor) {
            case "correr":
                System.out.println("Usted esta corriendo");
                break;
        case "saltar":
                System.out.println("Usted esta saltando");
                break;
        case "dormir":
                System.out.println("Usted esta durmiendo");
                break; 
        case "comer":
                System.out.println("Usted esta comiendo");
                break;       
        case "estudiar":
                System.out.println("Usted esta estudiando");
                break;        
            default:
    }
    
}
}
