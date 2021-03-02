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

/**
 *
 * @author Admin
 */
public class Accept {
    Stack stack;
    private String idPregunta;
    private String idRespuesta;

    public Accept(Stack stack, String idPregunta, String idRespuesta) {
        this.stack = stack;
        this.idPregunta = idPregunta;
        this.idRespuesta = idRespuesta;
    }

    public Stack getStack() {
        return stack;
    }

    public void setStack(Stack stack) {
        this.stack = stack;
    }

    /**
     * Metodo para aceptar la respuesta a una de las preguntas del usuario
     * como resultado se cierra la pregunta y el autor de la respuesta 
     * se lleva la recompensa que tenga la pregunta acumulada hasta ese momento
     * @param stack
     * @param user 
     */
    public void accept(){
        int i;
        int idP = Integer.parseInt(idPregunta);
        int idR = Integer.parseInt(idRespuesta);
        Pregunta prg = null;
        Respuesta rps = null;
        Usuario user = null;
        for(i = 0; i < stack.getPreguntas().size();i++){
            if(stack.getPreguntas().get(i).getIdPregunta() == idP){
                prg = stack.getPreguntas().get(i);
            }
        }
        for(i = 0; i < stack.getRespuestas().size();i++){
            if(stack.getRespuestas().get(i).getIdRespuesta() == idR){
                rps = stack.getRespuestas().get(i);
            }
        }
        for(i = 0;i < stack.getUsuarios().size();i++){
            if(stack.getUsuarios().get(i).getNombre() == null ? rps.getAutor() == null : stack.getUsuarios().get(i).getNombre().equals(rps.getAutor()))
                user = stack.getUsuarios().get(i);
        }
        int recompensa = prg.getRecompensa();
        int recompensaTotal = recompensa + user.getReputacion();
        user.setReputacion(recompensaTotal);
        prg.setEstado("cerrada");
        
    }
       
}
