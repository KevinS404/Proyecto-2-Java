/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB4_20495193_A1.controlador;

import LAB4_20495193_A1.modelo.Stack;
import java.util.ArrayList;

/**
 * Clase que almacena los datos de una pregunta para despues poder generar una
 * clase Pregunta y almacenarla en el stack. Para esto recibe todos los datos que
 * se requieren en una clase pregunta
 * 
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
     * Metodo que se encarga de agregar la pregunta al stack con sus respectivos datos
     * @param stack
     * @param user
     * @return 
     */
    
    public int ask (Stack stack, Login user, String etiqueta){
        String titulo = this.getTitulo();
        String contenido = this.getContenido();
        String fechaDePublicacion = this.getFechaDePublicacion();
        //String contenido = this.getContenido();
        String autor = user.getNombre();
        ArrayList<String> etiquetaP = new ArrayList<>();
        if(etiqueta != null){
            etiquetaP.add(etiqueta);
        }
        int idPregunta = this.getIdPregunta();
        stack.agregarPregunta(idPregunta,0,etiquetaP, titulo, contenido, fechaDePublicacion, autor, "abierta", 0);
       return 0;
    }

}
