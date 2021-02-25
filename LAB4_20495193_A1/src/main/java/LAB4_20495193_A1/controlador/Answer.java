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

public class Answer {
        /**
     * metodo mediante el cual el usuario agrega una respuesta a una pregunta en concreto
     * para esto se le asigna a la pregunta en su variable de id de pregunta el id de esta misma
     * y se prosigue a pedirle al usuario el contenido de la respuesta, despues se asigna al autoe de la 
     * respuesta el nombre del usuario que inicio este metodo, se le pide la fecha y se le indica que 
     * su respuesta fue publicada.
     * @param stack
     * @param eleccion
     * @param contenido
     * @param id
     * @param user
     * @return 
     */
    /*
    public int answer(Stack stack, Pregunta eleccion,int id,Usuario user){
        this.idPregunta = eleccion.getIdPregunta();
        this.idRespuesta = idRespuesta;
        eleccion.setCantidadRespuestas(idRespuesta);
        System.out.println("Ingrese el contenido de la respuesta a la pregunta: ");
        Scanner aux = new Scanner(System.in);
        contenido = aux.nextLine();
        
        this.autor = user.getNombre();
 
        String fechaDePublicacion;
        System.out.println("Ingrese la fecha de publicacion con formato dd/mm/aaaa: ");
        Scanner aux2 = new Scanner(System.in);
        fechaDePublicacion = aux2.nextLine();
        stack.agregarRespuesta(idPregunta,id, user.getNombre(), fechaDePublicacion, contenido);
        System.out.println("\nRespuesta publicada.\n");
        System.out.println("Escoja su opcion: \n" +
                        "1. Agregar nueva pregunta\n" +
                        "2. Responder pregunta\n" +
                        "3. Dar recompensa\n" +
                        "4. Aceptar respuesta\n" +
                        "5. Cerrar sesion\n" +
                        "6. Salir del programa");
        
        return 1;
    } 
    */
}
