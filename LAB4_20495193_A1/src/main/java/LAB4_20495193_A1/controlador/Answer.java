/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB4_20495193_A1.controlador;

import LAB4_20495193_A1.modelo.Pregunta;
import LAB4_20495193_A1.modelo.Stack;
import LAB4_20495193_A1.modelo.Usuario;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Admin
 */

public class Answer {
    private String idPregunta;
    private Stack stack;
    private String contenido;
    private Login usuario;
    
    public Answer(Stack stack, String contenido, Login usuario, String id) {
        this.stack = stack;
        this.contenido = contenido;
        this.usuario = usuario;
        this.idPregunta = id;
    }
    public Answer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    public String getContenido() {
        return contenido;
    }
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    
    
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


    
    public int answer(Stack stack, String contenido,Login user,String id){
        int idPregunta = Integer.parseInt(id);
        String fechaDePublicacion = stack.fechita();
        stack.agregarRespuesta(idPregunta,idPregunta, user.getNombre(), fechaDePublicacion, contenido);
        return 1;
    } 
    
}
