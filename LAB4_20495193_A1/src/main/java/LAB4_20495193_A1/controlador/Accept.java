/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB4_20495193_A1.controlador;

import LAB4_20495193_A1.modelo.Pregunta;
import LAB4_20495193_A1.modelo.Respuesta;
import LAB4_20495193_A1.modelo.Stack;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Accept {
    Stack stack;
    Login usuario;

    public Accept(Stack stack, Login usuario) {
        this.stack = stack;
        this.usuario = usuario;
    }

    public Stack getStack() {
        return stack;
    }

    public void setStack(Stack stack) {
        this.stack = stack;
    }

    public Login getUsuario() {
        return usuario;
    }

    public void setUsuario(Login usuario) {
        this.usuario = usuario;
    }
    

        /**
     * Metodo para aceptar la respuesta a una de las preguntas del usuario
     * como resultado se cierra la pregunta y el autor de la respuesta 
     * se lleva la recompensa que tenga la pregunta acumulada hasta ese momento
     * @param stack
     * @param user 
     */
    public void accept(Stack stack, Login user, int respuestas,int id){
        /**
         * Primero se genera un ArrayList de pregunta para almacenar las futuras
         * preguntas disponibles del usuario que esten aun abiertas, si es que
         * esta pregunta tiene 0 respuestas, se le notificara al usuario, en cambio,
         * si la pregunta tiene respuestas estas se le mostraran al usuario
         */
        if(respuestas == 0){
            JOptionPane.showMessageDialog(null, "Esta pregunta no tiene respuestas");
        }
        else if (respuestas >= 1){
            for(int i = 0; i < stack.getPreguntas().size();i++){
                //si la pregunta esta abierta entonces agregamos a preguntasDisponibles
                if("abierta".equals(stack.getPreguntas().get(i).getEstado()) && user.getNombre().equals(stack.getPreguntas().get(i).getAutor())){
                    if(stack.getPreguntas().get(i).getCantidadRespuestas() == 0){
                    }
                    //este es el caso de que la pregunta si tenga respuestas
                    else{
                        for(int k = 0; k < stack.getPreguntas().get(i).getCantidadRespuestas();i++){
                            if(stack.getRespuestas().get(i).getIdPregunta() == stack.getPreguntas().get(i).getIdPregunta()){
                                //mostrar el titulo y el autor de la pregunta
                            }   
                        }
                    }
                }
            }
        }
    }
       
}
