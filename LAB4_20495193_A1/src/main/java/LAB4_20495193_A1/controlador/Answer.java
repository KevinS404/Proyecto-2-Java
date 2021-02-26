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
    private int idPregunta;
    private int idRespuesta;
    private String autor;
    private String fecha;
    private String contenido;

    public Answer(int idPregunta, int idRespuesta, String autor, String fecha, String contenido) {
        this.idPregunta = idPregunta;
        this.idRespuesta = idRespuesta;
        this.autor = autor;
        this.fecha = fecha;
        this.contenido = contenido;
    }

    public int getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(int idPregunta) {
        this.idPregunta = idPregunta;
    }

    public int getIdRespuesta() {
        return idRespuesta;
    }

    public void setIdRespuesta(int idRespuesta) {
        this.idRespuesta = idRespuesta;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
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
    
    public int answer(Stack stack, Pregunta eleccion,int id,Usuario user){
        String contenido = this.getContenido();
        this.idRespuesta = idRespuesta;
        eleccion.setCantidadRespuestas(idRespuesta);
        this.autor = user.getNombre();

        String fechaDePublicacion;
        //stack.agregarRespuesta(idPregunta,id, user.getNombre(), fechaDePublicacion, contenido);

        
        return 1;
    } 
    
}
