/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB4_20495193_A1.controlador;

import LAB4_20495193_A1.modelo.Etiqueta;
import LAB4_20495193_A1.modelo.Pregunta;
import LAB4_20495193_A1.modelo.Stack;
import LAB4_20495193_A1.modelo.Usuario;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */

public class Ask {
    /**
     * metodo que permite a un usuario agregar una pregunta, en este caso se
     * le pedira al usuario que primero ingrese el titulo y contenido de la pregunta
     * seguido se le dara la opcion de elegir si quiere agregar etiquetas o no, para esto
     * se le dan 3 opciones que se repetiran siempre y cuando no elija la tercera.
     * La primera opcion le mostrara la lista de la cual tendra que una etiqueta y 
     * escribir el nombre de la etiqueta que prefiera, la opcion 2 es que
     * agregue una etiqueta propia con una descripcion de esta y finalmente la tercera 
     * opcion es para no añadir ninguna etiqueta. Listo este proceso entonces se le pedira
     * que ingrese la fecha de publicacion de la pregunta para luego añadir la pregunta
     * a la lista de preguntas y mostrar por pantalla que la pregunta ya fue publicada.
     * @param stack
     * @param user
     * @return 
     */
    /*
    public int ask (Stack stack, Usuario user){
        System.out.println("Ingrese el titulo de la pregunta: ");
        Scanner aux1 = new Scanner(System.in);
        titulo = aux1.nextLine();
        
        System.out.println("Ingrese el contenido de la pregunta: ");
        Scanner aux2 = new Scanner(System.in);
        contenido = aux2.nextLine();
        autor = user.getNombre();
        
        int opcion,opcion2;
        int verificador = 0;
        String etiqueta,nombre,descripcion;
        ArrayList<String> etiquetaP = new ArrayList<>();
        do{
            System.out.println("\nOpcion para etiquetas\n1.Lista de etiquetas disponibles.\n2.Agregar etiqueta.\n3.No agregar etiqueta.\nEscoja una opcion: ");
            Scanner aux = new Scanner(System.in);
            opcion = aux.nextInt();
            if(opcion == 1){
                System.out.println(stack.getEtiquetas());
                System.out.println("\nEscriba el nombresu eleccion: ");
                Scanner aux3 = new Scanner(System.in);
                etiqueta = aux3.nextLine();
                etiquetaP.add(etiqueta);
                
            }
            else if(opcion == 2){
                System.out.println("Ingrese el nombre de la etiqueta: ");
                Scanner aux3 = new Scanner(System.in);
                nombre = aux3.nextLine();
                System.out.println("Ingrese una breve descripcion: ");
                Scanner aux4 = new Scanner(System.in);
                descripcion = aux4.nextLine();
                Etiqueta etiquetaNueva = new Etiqueta(nombre,descripcion);
                etiquetaP.add(nombre);
             
            }
            else if(opcion == 3){
                verificador = 1;
            }
            if(verificador == 0){
                System.out.println("¿Desea continuar agregando etiquetas?\n1.Si\n2.No\nEscoja una opcion: ");
                Scanner aux5 = new Scanner(System.in);
                opcion2 = aux5.nextInt();
                if(opcion2 == 2){
                    verificador = 1;
                }
            }
        }while(verificador == 0);
        String fechaDePublicacion;
        System.out.println("Ingrese la fecha de publicacion con formato dd/mm/aaaa: ");
        Scanner aux = new Scanner(System.in);
        fechaDePublicacion = aux.nextLine();
        
        stack.agregarPregunta(idPregunta,0,etiquetas, titulo, contenido, fechaDePublicacion, autor, "abierta", 0);
        System.out.println("\nPregunta publicada.\n");
        System.out.println("Escoja su opcion: \n" +
                        "1. Agregar nueva pregunta\n" +
                        "2. Responder pregunta\n" +
                        "3. Dar recompensa\n" +
                        "4. Aceptar respuesta\n" +
                        "5. Cerrar sesion\n" +
                        "6. Salir del programa"); 
       return 0;
    }
*/
}
