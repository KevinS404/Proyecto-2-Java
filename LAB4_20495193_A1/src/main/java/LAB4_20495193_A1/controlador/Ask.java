/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB4_20495193_A1.controlador;

import LAB4_20495193_A1.modelo.Pregunta;
import LAB4_20495193_A1.modelo.Stack;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */

public class Ask {
    private static int idIncremental = 0;
    private int idPregunta;
    private int cantidadRespuestas;
    private ArrayList<String> etiquetas = new ArrayList<>();
    private String titulo;
    private String contenido;
    private String fechaDePublicacion;
    private String autor;
    private String estado;
    private int recompensa;

    public Ask(String titulo,String contenido,String fechaP) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.fechaDePublicacion = fechaP;
    }

    public static int getIdIncremental() {
        return idIncremental;
    }

    public static void setIdIncremental(int idIncremental) {
        Ask.idIncremental = idIncremental;
    }

    public int getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(int idPregunta) {
        this.idPregunta = idPregunta;
    }

    public int getCantidadRespuestas() {
        return cantidadRespuestas;
    }

    public void setCantidadRespuestas(int cantidadRespuestas) {
        this.cantidadRespuestas = cantidadRespuestas;
    }

    public ArrayList<String> getEtiquetas() {
        return etiquetas;
    }

    public void setEtiquetas(ArrayList<String> etiquetas) {
        this.etiquetas = etiquetas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getFechaDePublicacion() {
        return fechaDePublicacion;
    }

    public void setFechaDePublicacion(String fechaDePublicacion) {
        this.fechaDePublicacion = fechaDePublicacion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getRecompensa() {
        return recompensa;
    }

    public void setRecompensa(int recompensa) {
        this.recompensa = recompensa;
    }
    

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
    
    public int ask (Stack stack, Login user){
        String titulo = this.getTitulo();
        String contenido = this.getContenido();
        String fechaDePublicacion = this.getFechaDePublicacion();
        //String contenido = this.getContenido();
        String autor = user.getNombre();
        String etiqueta,nombre,descripcion;
        ArrayList<String> etiquetaP = new ArrayList<>();
        int idPregunta = this.getIdPregunta();
        stack.agregarPregunta(idPregunta,0,etiquetas, titulo, contenido, fechaDePublicacion, autor, "abierta", 0);
       return 0;
    }

}
