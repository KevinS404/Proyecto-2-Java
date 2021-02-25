/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB4_20495193_A1.controlador;

import LAB4_20495193_A1.modelo.Stack;

/**
 *
 * @author Admin
 */
public class Search {
     /**
     * Metodo que se encarga de buscar en el stack una pregunta o respuesta mediante
     * un criterio a eleccion y un String con los caracteres buscados que se le pediran
     * ingresar por teclado al usuario en Main.
     * @param stack
     * @param criterio
     * @param busqueda 
     */
    public void search(Stack stack,int criterio,String busqueda){
        int j = 1; // variable auxiliar para enumerar
        /**
         * Si se escoge el primer criterio entonces buscaremos en las preguntas con un ciclo
         * que evaluara si es que la pregunta contiene al string de busqueda en su titulo o en su contenido
         * si es que esto ocurre mostrara por pantalla el contenido de la pregunta correspondiente al titulo
         * autor, contenido y etiquetas.
         */
        if (criterio == 1){
            System.out.print("Preguntas que coindicen con el criterio de busqueda: \n\n");
            for(int i  = 0;i <stack.getPreguntas().size();i++){
                //si la pregunta contiene el criterio en su titulo o en su contenido entonces le mostramos al usuario esto
                if(stack.getPreguntas().get(i).getTitulo().contains(busqueda) || stack.getPreguntas().get(i).getContenido().contains(busqueda)){
                    System.out.println("Pregunta" + " "+ j + ": "+ stack.getPreguntas().get(i).getTitulo()+ ". Publicada por: " +  stack.getPreguntas().get(i).getAutor()+
                                    ". Etiquetas: "+ stack.getPreguntas().get(i).getEtiquetas());
                                    System.out.println("Su contenido es: ");
                                    System.out.println(stack.getPreguntas().get(i).getContenido()+"\n");
                    j++;
                }
            }
            
        }
        /**
         * Si se escoge el segundo criterio entonces buscaremos en las respuestas con un ciclo
         * que evaluara si es que la respuesta contiene al string de busqueda en su contenido,
         * si es que esto ocurre mostrara por pantalla el contenido de la respuesta correspondiente al 
         * contenido y el autor.
         */
        else if(criterio == 2){
            System.out.print("Respuestas que coindicen con el criterio de busqueda: \n\n");
            for(int i  = 0;i <stack.getRespuestas().size();i++){
                //si la pregunta contuviera lo que se se busca entonces se muestra su autor y su contenido
                if(stack.getRespuestas().get(i).getContenido().contains(busqueda)){
                        System.out.println("Respuesta de: " + stack.getRespuestas().get(i).getAutor());
                        System.out.println("Contenido: " +stack.getRespuestas().get(i).getContenido());
                }
            }
            
        }
        /**
         * Si se escoge el tercer criterio entonces buscaremos en las etiquetas con un ciclo
         * que evaluara si es que la respuesta contiene al string de busqueda en su nombre o en su descripcion,
         * si es que esto ocurre mostrara por pantalla el contenido de la etiqueta correspondiente al 
         * nombre y su descripcion.
         */
        else if(criterio == 3){
            System.out.print("Etiquetas que coindicen con el criterio de busqueda: \n\n");
            for(int i  = 0;i <stack.getEtiquetas().size();i++){
                if(stack.getEtiquetas().get(i).get(0).contains(busqueda) || stack.getEtiquetas().get(i).get(1).contains(busqueda)){
                    System.out.println("Nombre de etiqueta: " + stack.getEtiquetas().get(i).get(0));
                    System.out.println("Descripcion de etiqueta: " + stack.getEtiquetas().get(i).get(1));
                    
                }
            }
            
        }
    }
    
}
