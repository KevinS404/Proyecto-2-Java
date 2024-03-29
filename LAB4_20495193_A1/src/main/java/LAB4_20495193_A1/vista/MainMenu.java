/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB4_20495193_A1.vista;

import LAB4_20495193_A1.modelo.Stack;
import java.util.ArrayList;

/**
 * frame que se encarga de mostrar el menu principal donde estaran como opciones
 * las opciones de registrarse, iniciar sesion, buscar o salir. cuando se crea esta clase
 * se crea junto a un stack con usuarios,preguntas y respuestas de ejemplo para probar
 * las funcionalidades del programa
 * @author Admin
 */
public class MainMenu extends javax.swing.JFrame {

    Stack stackPrincipal;

    /**
     * constructor del frame junto al stack que servira como la base de datos
     * del programa
     */
    public MainMenu() {
        this.stackPrincipal = new Stack();
        //1 stack inicial
        //4 usuarios registrados de ejemplo
        stackPrincipal.agregarUsuario("usuario1", "contrasena1",500);
        stackPrincipal.agregarUsuario("usuario2", "contrasena2",200);
        stackPrincipal.agregarUsuario("usuario3", "contrasena3",10);
        stackPrincipal.agregarUsuario("usuario4", "contrasena4",27);
        //4 etiquetas de ejemplo
        stackPrincipal.agregarEtiqueta("java","lenguaje orientado a objetos");
        stackPrincipal.agregarEtiqueta("prolog","lenguaje de paradigma logico");
        stackPrincipal.agregarEtiqueta("scheme","lenguaje de paradigma funcional");
        stackPrincipal.agregarEtiqueta("c++","lenguaje orientado a objetos");
        //auxiliares para generar 5 preguntas con sus etiquetas respectivas
        ArrayList<String> etiqueta1 = new ArrayList<>();
        etiqueta1.add("java");
        ArrayList<String> etiqueta2 = new ArrayList<>();
        etiqueta1.add("prolog");
        ArrayList<String> etiqueta3 = new ArrayList<>();
        etiqueta1.add("scheme");
        ArrayList<String> etiqueta4 = new ArrayList<>();
        etiqueta1.add("c++");
        //5 preguntas de ejemplo
        stackPrincipal.agregarPregunta(1,2,etiqueta1, "titulo1", "contenido1" , "27/12/2020", "usuario1", "cerrada", 0);
        stackPrincipal.agregarPregunta(2,4,etiqueta2, "titulo2", "contenido2" , "15/08/2020", "usuario2", "abierta", 15);
        stackPrincipal.agregarPregunta(3,2,etiqueta3, "titulo3", "contenido3" , "02/06/2020", "usuario3", "cerrada", 0);
        stackPrincipal.agregarPregunta(4,1,etiqueta1, "titulo4", "contenido4" , "20/02/2020", "usuario4", "abierta", 0);
        stackPrincipal.agregarPregunta(5,1,etiqueta4, "titulo5", "contenido5" , "17/04/2020", "usuario1", "cerrada", 0);
        //10 respuestas de ejemplo
        stackPrincipal.agregarRespuesta(1,1, "usuario1", "27/07/2020", "contenido1");
        stackPrincipal.agregarRespuesta(2,2, "usuario1", "07/01/2021", "contenido2");
        stackPrincipal.agregarRespuesta(3,3, "usuario2", "10/07/2020", "contenido3");
        stackPrincipal.agregarRespuesta(2,4, "usuario2", "27/03/2020", "contenido4");
        stackPrincipal.agregarRespuesta(1,5, "usuario2", "02/01/2021", "contenido5");
        stackPrincipal.agregarRespuesta(3,6, "usuario3", "30/11/2020", "contenido6");
        stackPrincipal.agregarRespuesta(2,7, "usuario3", "20/09/2020", "contenido7");
        stackPrincipal.agregarRespuesta(2,8, "usuario3", "12/12/2020", "contenido8");
        stackPrincipal.agregarRespuesta(4,9, "usuario4", "06/07/2020", "contenido9");
        stackPrincipal.agregarRespuesta(5,10, "usuario4", "15/01/2020", "contenido10");
        initComponents();
    }

    public Stack getStackPrincipal() {
        return stackPrincipal;
    }

    public void setStackPrincipal(Stack stackPrincipal) {
        this.stackPrincipal = stackPrincipal;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JBregister = new javax.swing.JButton();
        JBlogin = new javax.swing.JButton();
        JBsearch = new javax.swing.JButton();
        JBexit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JBregister.setText("Register");
        JBregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBregisterActionPerformed(evt);
            }
        });

        JBlogin.setText("Log in");
        JBlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBloginActionPerformed(evt);
            }
        });

        JBsearch.setText("Search");
        JBsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBsearchActionPerformed(evt);
            }
        });

        JBexit.setText("Salir");
        JBexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBexitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JBlogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JBsearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JBregister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JBexit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(178, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(JBregister)
                .addGap(33, 33, 33)
                .addComponent(JBlogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(JBsearch)
                .addGap(44, 44, 44)
                .addComponent(JBexit)
                .addGap(57, 57, 57))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Si el usuario presionara el boton de registro entonces comenzara el evento 
     * que lleva el proceso de registro
     * @param evt 
     */
    private void JBregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBregisterActionPerformed
        
        Fregistro nuevo = new Fregistro(stackPrincipal);
        nuevo.setVisible(true);
    }//GEN-LAST:event_JBregisterActionPerformed
    /**
    * Si el usuario presionara el boton de iniciar sesion entonces comenzara el evento 
    * que lleva el proceso de inicio de sesion
    * @param evt 
    */
    private void JBloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBloginActionPerformed
        
        FInicioSesion iniciar = new FInicioSesion(stackPrincipal);
        iniciar.setVisible(true);
    }//GEN-LAST:event_JBloginActionPerformed
    /**
     * Si el usuario presiona el boton Salir entonces el menu se cerrara y el programa
     * se detendra
     * @param evt 
     */
    private void JBexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBexitActionPerformed
        
        dispose();
    }//GEN-LAST:event_JBexitActionPerformed
    /**
     * Si el usuario presiona el boton de search entonces comenzara el evento que
     * lleva el proceso de busqueda.
     * @param evt 
     */
    private void JBsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBsearchActionPerformed
        
        new Fsearch(stackPrincipal).setVisible(true);
    }//GEN-LAST:event_JBsearchActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
                //primero se incluyen todas las estructuras de ejemplo solicitadas


        /* Create and display the form */
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBexit;
    private javax.swing.JButton JBlogin;
    private javax.swing.JButton JBregister;
    private javax.swing.JButton JBsearch;
    // End of variables declaration//GEN-END:variables
}
