/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB4_20495193_A1.controlador;

import LAB4_20495193_A1.modelo.Stack;

/**
 * Clase que se encarga de almacenar todos los datos para que un usuario se
 * registre, para esto cuenta con un String para el nombre y otro para la 
 * contraseña
 * 
 */

public class Register {
    private String nombre;
    private String contrasena;


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

    /**
     * Metodo que verifica si es que los datos del usuario no se encuentran previamente
     * en el stack, si es que este es el caso devolvera un 0, pero si no entonces devolvera
     * un 1 y el usuario se guardara en el stack.
     * @param stackPrincipal
     * @param user
     * @return int
     */
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
            //agregamos al usuario a la lista con una reputacion inicial de 500 puntos
            stackPrincipal.agregarUsuario(nombreRegistro, contrasenaRegistro, 500);
        }
        return verificador;
    }


}
