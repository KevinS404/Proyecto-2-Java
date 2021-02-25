/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB4_20495193_A1.controlador;

import LAB4_20495193_A1.modelo.Pregunta;
import LAB4_20495193_A1.modelo.Respuesta;
import LAB4_20495193_A1.modelo.Stack;
import LAB4_20495193_A1.modelo.Usuario;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Accept {
        /**
     * Metodo para aceptar la respuesta a una de las preguntas del usuario
     * como resultado se cierra la pregunta y el autor de la respuesta 
     * se lleva la recompensa que tenga la pregunta acumulada hasta ese momento
     * @param stack
     * @param user 
     */
    public void accept(Stack stack, Usuario user){
        /**
         * Primero se genera un ArrayList de pregunta para almacenar las futuras
         * preguntas disponibles del usuario que esten aun abiertas, si es que
         * esta pregunta tiene 0 respuestas, se le notificara al usuario, en cambio,
         * si la pregunta tiene respuestas estas se le mostraran al usuario
         */
        ArrayList<Pregunta> preguntasDisponibles = new ArrayList<>();
        int j = 1;//variable auxiliar para mostrar al usuario el numero de la pregunta
        for(int i = 0; i < stack.getPreguntas().size();i++){
            //si la pregunta esta abierta entonces agregamos a preguntasDisponibles
            if("abierta".equals(stack.getPreguntas().get(i).getEstado()) && user.getNombre().equals(stack.getPreguntas().get(i).getAutor())){
                preguntasDisponibles.add(stack.getPreguntas().get(i));
                System.out.println("Pregunta" + " "+ j + ": "+ stack.getPreguntas().get(i).getTitulo()); //se le muestra al usuario la pregunta
                //caso en que la pregunta tenga 0 respuestas
                if(stack.getPreguntas().get(i).getCantidadRespuestas() == 0){
                    System.out.println("Aun no hay respuestas para esta pregunta.");
                }
                //este es el caso de que la pregunta si tenga respuestas
                else{
                    for(int k = 0; k < stack.getPreguntas().get(i).getCantidadRespuestas();i++){
                        if(stack.getRespuestas().get(i).getIdPregunta() == stack.getPreguntas().get(i).getIdPregunta()){
                            System.out.println("Respuesta de: " + stack.getRespuestas().get(i).getAutor());
                            System.out.println("Contenido: " + stack.getRespuestas().get(i).getContenido());
                        }   
                    }
                }
                j++;
            }
        }
        /**
         * Ahora queda el usuario eliga una respuesta para recompensar, si es que la lista de preguntas disponibles
         * no esta vacia entonces se le pedira al usuario que eliga una pregunta, si esta pregunta tiene 0 respuestas
         * entonces se le notificara al usuario que nadie ha respondido esta pregunta, si este no es el caso entonces
         * se le mostraran al usuario todas las respuestas disponibles para aceptar
         */
        //caso en que no hayan preguntas disponibles para elegir
        if(preguntasDisponibles.isEmpty()){
            System.out.println("No tiene preguntas disponibles para realizar esta accion");
        }
        //caso en el que hayan al menos una pregunta disponible
        else if(preguntasDisponibles.size() >= 1){
            int eleccion;
            System.out.println("Escriba el numero de la pregunta a elegir: ");
            Scanner aux = new Scanner(System.in);
            eleccion = aux.nextInt();
            Pregunta seleccion = preguntasDisponibles.get(eleccion-1);
            //si es que la pregunta no tiene respuestas, se le notificara al usuario
            if(seleccion.getCantidadRespuestas() == 0){
                System.out.println("Lo sentimos, esta pregunta no tiene respuestas aun");
            }
            //si es que la pregunta tiene respuestas, entonces le mostraremos todas las respuestas de la pregunta
            else if (seleccion.getCantidadRespuestas() >= 1){
                int aceptada;//variable auxiliar para almacenar la opcion 
                ArrayList<Respuesta> disponibles = new ArrayList<>();
                j = 1; //devolvemos esta variable a 1 para repetir un proceso similiar con las respuestas
                int id = seleccion.getIdPregunta();
                for(int i = 0;i < seleccion.getCantidadRespuestas();i++){
                    if(stack.getRespuestas().get(i).getIdPregunta() == id){
                        System.out.println("opcion numero: "+j);
                        System.out.println("Respuesta de: " + stack.getRespuestas().get(i).getAutor());
                        System.out.println("Contenido: " +stack.getRespuestas().get(i).getContenido());
                        disponibles.add(stack.getRespuestas().get(i));
                        j = j +1;
                    }
                }
            /**
             * hacemos que el usuario escoja una respuesta de las mostradas por pantalla
             * entonces haremos que esta respuesta sea guardada en una variable de tipo Respuesta,
             * tambien guardamos la recompensa acumulada de la pregunta en una variable y vaciamos
             * este atributo de la pregunta, para despues asignar esta recompensa al autor de la pregunta
             * que sera buscado mediante un ciclo,y finalmente dejar el estado de la pregunta como "cerrada"
             */
                System.out.println("Escoja la respuesta que desea aceptar: ");
                Scanner aux2 = new Scanner(System.in);
                aceptada = aux2.nextInt();
                Respuesta seleccionada = disponibles.get(aceptada-1);//variable para guardar la respuesta
                int recompensa = seleccion.getRecompensa();//variable para guardar la recompensa de la pregunta
                String usuario = seleccionada.getAutor();
                for (int i = 0;i < stack.getUsuarios().size();i++){
                    if(usuario == null ? stack.getUsuarios().get(i).getNombre() == null : usuario.equals(stack.getUsuarios().get(i).getNombre())){
                        System.out.println("Respuesta aceptada, la pregunta se marcara como cerrada");
                        int suma = stack.getUsuarios().get(i).getReputacion() + recompensa;
                        stack.getUsuarios().get(i).setReputacion(suma);
                        seleccion.setRecompensa(0);
                        seleccion.setEstado("cerrada");
                    }
                }
            }
        }
     System.out.println("\nOpciones disponibles: \n" +
                        "1. Agregar nueva pregunta\n" +
                        "2. Responder pregunta\n" +
                        "3. Dar recompensa\n" +
                        "4. Aceptar respuesta\n" +
                        "5. Cerrar sesion\n" +
                        "6. Salir del programa");    
    }
}
