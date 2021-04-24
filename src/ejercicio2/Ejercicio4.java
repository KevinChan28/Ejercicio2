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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dia;


 Scanner teclado=new Scanner (System.in);
        System.out.println("Ingrese un dia de la semana");
        dia=teclado.nextInt();
                 diasemana(dia,true);
    }
    public static void diasemana(int dia,boolean tiposemana){
            
       if(tiposemana){     
       if (dia>=1 && dia<=7) {
           switch (dia) {
               case 1:
                   System.out.println("Domingo");
                   break;
                   case 2:
                   System.out.println("Lunes");
                   break;
                   case 3:
                   System.out.println("Martes");
                   break;
                   case 4:
                   System.out.println("Miercoles");
                   break;
                   case 5:
                   System.out.println("Jueves");
                   break;
                   case 6:
                   System.out.println("Viernes");
                   break;
                   case 7:
                   System.out.println("Sabado");
                   break;
               default:
                   
           }
       }
       } else{
           if (dia>=1 && dia<=7) {
           switch (dia) {
               case 1:
                   System.out.println("Lunes");
                   break;
                   case 2:
                   System.out.println("Martes");
                   break;
                   case 3:
                   System.out.println("Miercoles");
                   break;
                   case 4:
                   System.out.println("Jueves");
                   break;
                   case 5:
                   System.out.println("Viernes");
                   break;
                   case 6:
                   System.out.println("Sabado");
                   break;
                   case 7:
                   System.out.println("Domingo");
                   break;
               default:
                   
           }
       }else{
           System.out.println("El numero ingresado es incorrecto");
       }
    
}
    }
}
