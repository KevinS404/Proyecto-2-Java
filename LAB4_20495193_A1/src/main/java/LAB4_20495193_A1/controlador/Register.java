/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB4_20495193_A1.controlador;

import LAB4_20495193_A1.modelo.Stack;
import LAB4_20495193_A1.modelo.Usuario;
import java.util.Scanner;

/**
 *
 * @author Admin
 */

public class Register {
    private String nombre;
    private String contrasena;
    private int reputacion = 500; //por temas practicos todos inician con 500 puntos

    public Register(String nombre, String contrasena) {
        this.nombre = nombre;
        this.contrasena = contrasena;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public int getReputacion() {
        return reputacion;
    }

    public void setReputacion(int reputacion) {
        this.reputacion = reputacion;
    }

    public int register(Stack stackPrincipal,Register user){
        String nombreRegistro = this.getNombre();
        String contrasenaRegistro = this.getContrasena();

        int verificador = 1;
        for(int i = 0; i < stackPrincipal.getUsuarios().size();i++){
            if(nombreRegistro.equals(stackPrincipal.getUsuarios().get(i).getNombre())){
                //si el user existiera en la lista cambiamos el verificador a 0
                verificador = 0;
           }
        }
        //si el usuario no existe en el stack, indicamos por pantalla que el registro
        //se pudo hacer y agregamos el usuario al stack
        if(verificador == 1){
            this.nombre = nombreRegistro;
            this.contrasena = contrasenaRegistro;
            this.reputacion = 500;
            //agregamos al usuario a la lista con una reputacion inicial de 500 puntos
            stackPrincipal.agregarUsuario(nombreRegistro, contrasenaRegistro, 500);
        }
        //si el usuario existiera le indicaremos esto al usuario por pantalla
        //y le daremos la opcion de registrarse o de iniciar sesion
        else if(verificador == 0) {
        }
        return verificador;
    }


}
