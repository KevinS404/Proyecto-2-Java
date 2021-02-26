/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB4_20495193_A1.vista;

import LAB4_20495193_A1.modelo.Stack;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class MainMenu extends javax.swing.JFrame {

    Stack stackPrincipal;

    /**
     * Creates new form MainMenu
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
        stackPrincipal.agregarPregunta(1,2,etiqueta1, "titulo1", "contenido1" , "fechaDePublicacion1", "usuario1", "cerrada", 0);
        stackPrincipal.agregarPregunta(2,0,etiqueta2, "titulo2", "contenido2" , "fechaDePublicacion2", "usuario2", "abierta", 15);
        stackPrincipal.agregarPregunta(3,5,etiqueta3, "titulo3", "contenido3" , "fechaDePublicacion3", "usuario3", "cerrada", 0);
        stackPrincipal.agregarPregunta(4,1,etiqueta1, "titulo4", "contenido4" , "fechaDePublicacion4", "usuario4", "abierta", 0);
        stackPrincipal.agregarPregunta(5,6,etiqueta4, "titulo5", "contenido5" , "fechaDePublicacion4", "usuario1", "cerrada", 0);

        //10 respuestas de ejemplo
        stackPrincipal.agregarRespuesta(1,1, "usuario1", "27/07/2020", "contenido1");
        stackPrincipal.agregarRespuesta(2,2, "usuario1", "07/01/2021", "contenido2");
        stackPrincipal.agregarRespuesta(3,1, "usuario2", "10/07/2020", "contenido3");
        stackPrincipal.agregarRespuesta(2,1, "usuario2", "27/03/2020", "contenido4");
        stackPrincipal.agregarRespuesta(1,2, "usuario2", "02/01/2021", "contenido5");
        stackPrincipal.agregarRespuesta(3,2, "usuario3", "30/11/2020", "contenido6");
        stackPrincipal.agregarRespuesta(2,3, "usuario3", "20/09/2020", "contenido7");
        stackPrincipal.agregarRespuesta(2,4, "usuario3", "12/12/2020", "contenido8");
        stackPrincipal.agregarRespuesta(4,5, "usuario4", "06/07/2020", "contenido9");
        stackPrincipal.agregarRespuesta(5,5, "usuario4", "15/01/2020", "contenido10");
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

    private void JBregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBregisterActionPerformed
        // TODO add your handling code here:
        Fregistro nuevo = new Fregistro(stackPrincipal);
        nuevo.setVisible(true);
    }//GEN-LAST:event_JBregisterActionPerformed

    private void JBloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBloginActionPerformed
        // TODO add your handling code here:
        FInicioSesion iniciar = new FInicioSesion(stackPrincipal);
        iniciar.setVisible(true);
    }//GEN-LAST:event_JBloginActionPerformed

    private void JBexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBexitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_JBexitActionPerformed

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
