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

/**
 * Clase que se encarga de guardar los datos de lo que busca el usuario cuando 
 * usa esta funcionalidad
 * 
 */
public class Search {
    private Stack stack;
    
    public Search(Stack stack) {
        this.stack = stack;
    }
    
    
     /**
     * Metodo que se encarga de buscar en el stack una pregunta de
     * un String con los caracteres buscados que se le pediran
     * ingresar por teclado al usuario.
     * @param stack
     * @param busqueda 
     */
    public ArrayList<Pregunta> search1(Stack stack,String busqueda){
        ArrayList<Pregunta> preguntasEncontradas = new ArrayList<>();
        for(int i  = 0;i <stack.getPreguntas().size();i++){
            //si la pregunta contiene el criterio en su titulo o en su contenido entonces le mostramos al usuario esto
            if(stack.getPreguntas().get(i).getTitulo().contains(busqueda) || stack.getPreguntas().get(i).getContenido().contains(busqueda)){
                    preguntasEncontradas.add(stack.getPreguntas().get(i));
                }
            }
        return preguntasEncontradas;
    }
    /**
     * Metodo que se encarga de buscar en el stack una respuesta de
     * un String con los caracteres buscados que se le pediran
     * ingresar por teclado al usuario.
     * @param stack
     * @param busqueda
     * @return 
     */
    public ArrayList<Respuesta> search2(Stack stack,String busqueda){

        ArrayList<Respuesta> respuestasEncontradas = new ArrayList<>();
        for(int i  = 0;i <stack.getRespuestas().size();i++){
            //si la respuesta contiene el criterio en su contenido entonces le mostramos al usuario esto
            if(stack.getRespuestas().get(i).getContenido().contains(busqueda)){
                    respuestasEncontradas.add(stack.getRespuestas().get(i));
                }
            }
        return respuestasEncontradas;
    }
     /**
     * Metodo que se encarga de buscar en el stack una respuesta de
     * un String con los caracteres buscados que se le pediran
     * ingresar por teclado al usuario.
     * @param stack
     * @param busqueda
     * @return 
     */
     public ArrayList<ArrayList<String>>  search3(Stack stack,String busqueda){
        ArrayList<ArrayList<String>> etiquetasEncontradas = new ArrayList<>();
        for(int i  = 0;i <stack.getEtiquetas().size();i++){
            
            if(stack.getEtiquetas().get(i).get(0).contains(busqueda) || stack.getEtiquetas().get(i).get(1).contains(busqueda)){
                    etiquetasEncontradas.add(stack.getEtiquetas().get(i));
                }
            }
        return etiquetasEncontradas;
    }
    
}
