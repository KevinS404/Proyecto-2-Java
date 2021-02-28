/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB4_20495193_A1.controlador;

import LAB4_20495193_A1.modelo.Pregunta;
import LAB4_20495193_A1.modelo.Stack;
import LAB4_20495193_A1.modelo.Usuario;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Reward {
    Stack stack;
    String recompensa;
    Login usuario;

    public Reward(Stack stack, String recompensa, Login usuario) {
        this.stack = stack;
        this.recompensa = recompensa;
        this.usuario = usuario;
    }
    
     /**
    * Metodo mediante el cual un usuario recompensa una pregunta, para esto almacena
    * la pregunta mediante un metodo de la clase Stack el cual muestra las preguntas 
    * disponibles y el usuario elige la pregunta, el metodo entonces retornara esta pregunta
    * y empezara el proceso de premiacion en el cual se le dira al usuario cuanta reputacion tiene
    * y cuanta quiere dar, si esta es menor que la reputacion que tiene entonces el programa le dira que no
    * no tiene suficientes puntos.Si es que el usuario tiene los suficientes puntos,entonces se calculara la
 diferencia entre la reputacion actual y la que quiere premiar y se le asignara esta a la reputacion del usuario
 y la recompensa a la pregunta.
    * @param stack
    * @param user 
    * @param recompensa 
    * @param idPregunta 
    */
    public void reward(Stack stack,Login user,String recompensa,String idPregunta){
        String nombre = user.getNombre();
        Usuario aux = stack.buscarUsuario(stack,nombre);
        int id = Integer.parseInt(idPregunta);
        Pregunta prg = stack.buscarPregunta(stack,id);
        int diferencia,cantidad,recompensaTotal,reputacion;
        reputacion = aux.getReputacion();
        cantidad = Integer.parseInt(recompensa);
        diferencia = reputacion - cantidad;
        if(diferencia >= 0){
            aux.setReputacion(diferencia);
            recompensaTotal = cantidad + prg.getRecompensa();
            prg.setRecompensa(recompensaTotal);
            JOptionPane.showMessageDialog(null, "Recompensa entregada");
           }
        else{
            JOptionPane.showMessageDialog(null, "Puntos insuficientes, no se ha entregado la recompensa");
           }      
    }  
}
