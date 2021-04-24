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
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado= new Scanner(System.in);
        int hora;
        System.out.println("Elije una hora del dia (con el formato de 24 horas)del dia Viernes");
        hora=teclado.nextInt();
        if (hora>=1 && hora<7) {
            System.out.println("Estoy durmiendo");
        }
        switch (hora) {
            case 7:
                System.out.println("Se esta despertando");
                break;
                case 8:
                System.out.println("Estoy preparando mi desayuno");
                break;
                case 9:
                System.out.println("Estoy desayunando");
                break;
                case 10:
                System.out.println("Entrando a clase de Calculo Integral");
                break;
                case 11:
                System.out.println("En clase de Calculo Integral");
                break;
                case 12:
                System.out.println("Entrando a clase de Organización Computacional");
                break;
                case 13:
                System.out.println("En clase de Organización Computacional");
                break;
                case 14:
                System.out.println("Saliendo de la clase de Organización Conmputacional");
                break;
                case 15:
                System.out.println("Es la hora de almorzar");
                break;
    
            default:
     
        }
        if (hora>=16 && hora<19) {
            System.out.println("Estoy durmiendo");
        }
        if (hora>=19 && hora<21) {
            System.out.println("Estoy en clase de Lenguaje de Programación");
        }
        if (hora>=21 && hora<24) {
            System.out.println("Juego con mi telefono o juego Xbox");
        }
        if (hora==24) {
            System.out.println("Es la hora de irme a dormir");
        }
    }
    
}
