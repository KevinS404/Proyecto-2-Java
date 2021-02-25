/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB4_20495193_A1.controlador;

import LAB4_20495193_A1.modelo.Pregunta;
import LAB4_20495193_A1.modelo.Stack;
import LAB4_20495193_A1.modelo.Usuario;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Reward {
     /**
    * Metodo mediante el cual un usuario recompensa una pregunta, para esto almacena
    * la pregunta mediante un metodo de la clase Stack el cual muestra las preguntas 
    * disponibles y el usuario elige la pregunta, el metodo entonces retornara esta pregunta
    * y empezara el proceso de premiacion en el cual se le dira al usuario cuanta reputacion tiene
    * y cuanta quiere dar, si esta es menor que la reputacion que tiene entonces el programa le dira que no
    * no tiene suficientes puntos. Si es que el usuario tiene los suficientes puntos,entonces se calculara la
    * diferencia entre la reputacion actual y la que quiere premiar y se le asignara esta a la reputacion del usuario
    * y la recompensa a la pregunta.
    * @param stack
    * @param user 
    */
    /*
       public void reward(Stack stack,Usuario user){
        Pregunta eleccion = stack.mostrarPreguntas(stack);
        int recompensa,diferencia;
        int repUsuario = user.getReputacion();
        System.out.println("usted tiene actualmente una reputacion de: " + repUsuario);
        System.out.println("Ingrese la cantidad de puntos de reputacion que premiara:");
        Scanner aux = new Scanner(System.in);
        recompensa = aux.nextInt();
       
        if (recompensa <= user.getReputacion()){
            eleccion.setRecompensa(recompensa);
            diferencia =user.getReputacion() - recompensa;
            user.setReputacion(diferencia);
            System.out.println("\nRecompensa otorgada.\n");
            System.out.println("Escoja su opcion: \n" +
                            "1. Agregar nueva pregunta\n" +
                            "2. Responder pregunta\n" +
                            "3. Dar recompensa\n" +
                            "4. Aceptar respuesta\n" +
                            "5. Cerrar sesion\n" +
                            "6. Salir del programa");
        }
        else{
            System.out.println("No tiene suficientes puntos.");
            System.out.println("Escoja su opcion: \n" +
                            "1. Agregar nueva pregunta\n" +
                            "2. Responder pregunta\n" +
                            "3. Dar recompensa\n" +
                            "4. Aceptar respuesta\n" +
                            "5. Cerrar sesion\n" +
                            "6. Salir del programa"); 
        }
    }  
       */
}
