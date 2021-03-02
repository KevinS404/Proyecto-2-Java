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
 *
 * @author Admin
 */
public class Search {
    private Stack stack;
    
    public Search(Stack stack) {
        this.stack = stack;
    }
    
    
     /**
     * Metodo que se encarga de buscar en el stack una pregunta o respuesta mediante
     * un criterio a eleccion y un String con los caracteres buscados que se le pediran
     * ingresar por teclado al usuario en Main.
     * @param stack
     * @param criterio
     * @param busqueda 
     */
    public ArrayList<Pregunta> search1(Stack stack,String busqueda){
        /**
         * Si se escoge el primer criterio entonces buscaremos en las preguntas con un ciclo
         * que evaluara si es que la pregunta contiene al string de busqueda en su titulo o en su contenido
         * si es que esto ocurre mostrara por pantalla el contenido de la pregunta correspondiente al titulo
         * autor, contenido y etiquetas.
         */
        ArrayList<Pregunta> preguntasEncontradas = new ArrayList<>();
        for(int i  = 0;i <stack.getPreguntas().size();i++){
            //si la pregunta contiene el criterio en su titulo o en su contenido entonces le mostramos al usuario esto
            if(stack.getPreguntas().get(i).getTitulo().contains(busqueda) || stack.getPreguntas().get(i).getContenido().contains(busqueda)){
                    preguntasEncontradas.add(stack.getPreguntas().get(i));
                }
            }
        return preguntasEncontradas;
    }
        public ArrayList<Respuesta> search2(Stack stack,String busqueda){
        /**
         * Si se escoge el primer criterio entonces buscaremos en las preguntas con un ciclo
         * que evaluara si es que la pregunta contiene al string de busqueda en su titulo o en su contenido
         * si es que esto ocurre mostrara por pantalla el contenido de la pregunta correspondiente al titulo
         * autor, contenido y etiquetas.
         */
        ArrayList<Respuesta> respuestasEncontradas = new ArrayList<>();
        for(int i  = 0;i <stack.getRespuestas().size();i++){
            //si la pregunta contiene el criterio en su titulo o en su contenido entonces le mostramos al usuario esto
            if(stack.getRespuestas().get(i).getContenido().contains(busqueda)){
                    respuestasEncontradas.add(stack.getRespuestas().get(i));
                }
            }
        return respuestasEncontradas;
    }
       public ArrayList<ArrayList<String>>  search3(Stack stack,String busqueda){
        /**
         * Si se escoge el primer criterio entonces buscaremos en las preguntas con un ciclo
         * que evaluara si es que la pregunta contiene al string de busqueda en su titulo o en su contenido
         * si es que esto ocurre mostrara por pantalla el contenido de la pregunta correspondiente al titulo
         * autor, contenido y etiquetas.
         */
        
        ArrayList<ArrayList<String>> etiquetasEncontradas = new ArrayList<>();
        for(int i  = 0;i <stack.getEtiquetas().size();i++){
            //si la pregunta contiene el criterio en su titulo o en su contenido entonces le mostramos al usuario esto
            if(stack.getEtiquetas().get(i).get(0).contains(busqueda) || stack.getEtiquetas().get(i).get(1).contains(busqueda)){
                    etiquetasEncontradas.add(stack.getEtiquetas().get(i));
                }
            }
        return etiquetasEncontradas;
    }
    
}
