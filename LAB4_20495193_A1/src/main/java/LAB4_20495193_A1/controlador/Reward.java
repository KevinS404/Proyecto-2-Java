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
 * Clase que se encarga de almacenar los datos para recompensar una pregunta, para esto
 * tiene como atributo al stack, un String para la recompensa y el usuario que la da
 * 
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
    * Metodo que se encarga de otorgar la recompensa a la pregunta que el usuario
    * quiere recompensar, para esto calcula la diferencia entre la reputacion del usuario
    * y la que quiere entregar, si esta no es menor que 0 entonces la recompensa sera entregada,
    * pero si es menor que 0 entonces no se otorgara nada y se dira por pantalla que no fue posible
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
