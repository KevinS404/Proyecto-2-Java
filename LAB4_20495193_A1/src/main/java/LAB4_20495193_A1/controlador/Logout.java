/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB4_20495193_A1.controlador;

/**
 *
 * @author Admin
 */
public class Logout {
     /**
     * Metodo que cierra la sesion de un usuario, para esto cambia la opcion que
     * mantiene el bucle do while de main a 6 y se le indica al usuario que la sesion
     * se esta cerrando.
     * @param cambiarOpcion
     * @return 
     */
    public int logout(int cambiarOpcion){
        System.out.println("Cerrando sesion.");
        cambiarOpcion = 6;
        return cambiarOpcion;
        
    }
}
