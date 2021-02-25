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
public class Login {
    private String nombre;
    private String contrasena;

    public Login(String nombre, String contrasena) {
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
    
    
    
    public int login(Stack stackPrincipal,Login user){
        String nombreInicio = this.getNombre();
        String contrasenaInicio = this.getContrasena();
        /**
         * Una vez se tienen las variables de nombre y contrasena se genera un verificador que
         * nos dira si es que el usuario pudo ser logeado o no. Esto se hace mediante un ciclo en
         * el cual se itera toda la lista de usuarios buscando si el nombre y la contraseña ya se encuentra ingresado,
         * si es que se encuentran entonces cambiamos el valor del user creado en main al usuario guardado
         * a la vez que cambiamos el valor del verificador.
         */
        int verificador = 0;
        for(int i = 0; i < stackPrincipal.getUsuarios().size();i++){
            if(user.getNombre().equals(stackPrincipal.getUsuarios().get(i).getNombre()) && user.getContrasena().equals(stackPrincipal.getUsuarios().get(i).getContrasena())){
                verificador = 1;
           }
        }
        /**
         * Una vez listo este proceso el programa verifica que valor tiene el verificador
         * si este tiene el valor de 0 entonces no se encontro que el usuario o la contraseña
         * estuviera registrado por lo que se le dira que los datos no son validos
         */
        return verificador;
    }
}
