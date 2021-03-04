/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB4_20495193_A1.vista;

import LAB4_20495193_A1.controlador.Search;
import LAB4_20495193_A1.modelo.Pregunta;
import LAB4_20495193_A1.modelo.Respuesta;
import LAB4_20495193_A1.modelo.Stack;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * Frame que se encarga de mostrar el proceso de busqueda segun el criterio
 * del usuario, este tiene como atributo un stack para tener los datos donde consultar
 * @author Admin
 */
public class Fsearch extends javax.swing.JFrame {
    private Stack stack;
    /**
     * Constructor de la clase el cual recibe como parametro un stack
     */
    public Fsearch(Stack stack) {
        this.stack = stack;
        initComponents();
    }

    private Fsearch() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JBpreguntas = new javax.swing.JButton();
        JBrespuestas = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        criterio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        JBetiquetas = new javax.swing.JButton();
        JBback = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JBpreguntas.setText("Pregunta");
        JBpreguntas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBpreguntasActionPerformed(evt);
            }
        });

        JBrespuestas.setText("Respuesta");
        JBrespuestas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBrespuestasActionPerformed(evt);
            }
        });

        jLabel1.setText("Palabra para la busqueda:");

        jLabel2.setText("Elija el criterio de busqueda: ");

        JBetiquetas.setText("Etiquetas");
        JBetiquetas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBetiquetasActionPerformed(evt);
            }
        });

        JBback.setText("Volver al menu");
        JBback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBbackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(criterio, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JBback)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JBpreguntas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JBrespuestas)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JBetiquetas)
                .addGap(74, 74, 74))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(criterio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBpreguntas)
                    .addComponent(JBrespuestas)
                    .addComponent(JBetiquetas))
                .addGap(36, 36, 36)
                .addComponent(JBback)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Si es que el usuario presiona el boton de pregunta entonces se comenzara 
     * el evento que tiene como criterio de busqueda las preguntas. En este caso
     * se captura lo que el usuario escribio en el campo en un variable, luego se genera
     * una clase Search y un arrayList de preguntas, el cual almacenara lo que encuentre
     * el metodo search con el criterio que ingreso el usuario para las preguntas,
     * si es que al retornar el tama�o de este array fuera 1 o mayor entonces se 
     * genera un Frame de busqueda para que el usuario vea las preguntas encontradas.
     * Por otro lado si el tama�o del array fuera 0 entonces se le indicara al usuario
     * que no se encontro nada y se volvera al menu principal
     * @param evt 
     */
    private void JBpreguntasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBpreguntasActionPerformed
       
        String contenido = criterio.getText();
        Search busqueda = new Search(stack);
        ArrayList<Pregunta> preguntas = busqueda.search1(stack,contenido);
        if(preguntas.size() >= 1){
            new Fbusqueda(stack,1,null,preguntas,null).setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null, "No se ha encontrado preguntas con el criterio solicitado");
        }
        dispose();
    }//GEN-LAST:event_JBpreguntasActionPerformed
    /**
     * Si es que el usuario presiona el boton de respuesta entonces se comenzara 
     * el evento que tiene como criterio de busqueda las respuestas. En este caso
     * se captura lo que el usuario escribio en el campo en un variable, luego se genera
     * una clase Search y un arrayList de respuestas, el cual almacenara lo que encuentre
     * el metodo search con el criterio que ingreso el usuario para las respuestas,
     * si es que al retornar el tama�o de este array fuera 1 o mayor entonces se 
     * genera un Frame de busqueda para que el usuario vea las respuestas encontradas.
     * Por otro lado si el tama�o del array fuera 0 entonces se le indicara al usuario
     * que no se encontro nada y se volvera al menu principal
     * @param evt 
     */
    private void JBrespuestasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBrespuestasActionPerformed
        String contenido = criterio.getText();
        Search busqueda = new Search(stack);
        ArrayList<Respuesta> respuestas = busqueda.search2(stack,contenido);
        if(respuestas.size() >= 1){
            new Fbusqueda(stack,2,respuestas,null,null).setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null, "No se han encontrado respuestas con el criterio solicitado");
            
        }
        dispose();
    }//GEN-LAST:event_JBrespuestasActionPerformed
    /**
     * Si es que el usuario presiona el boton de etiqueta entonces se comenzara 
     * el evento que tiene como criterio de busqueda las etiquetas. En este caso
     * se captura lo que el usuario escribio en el campo en un variable, luego se genera
     * una clase Search y un arrayList de etiquetas, el cual almacenara lo que encuentre
     * el metodo search con el criterio que ingreso el usuario para las etiquetas,
     * si es que al retornar el tama�o de este array fuera 1 o mayor entonces se 
     * genera un Frame de busqueda para que el usuario vea las etiquetas encontradas.
     * Por otro lado si el tama�o del array fuera 0 entonces se le indicara al usuario
     * que no se encontro nada y se volvera al menu principal
     * @param evt 
     */
    private void JBetiquetasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBetiquetasActionPerformed
        String contenido = criterio.getText();
        Search busqueda = new Search(stack);
        ArrayList<ArrayList<String>> etiquetas  = busqueda.search3(stack,contenido);
        if(etiquetas.size() >= 1){
            new Fbusqueda(stack,3,null,null,etiquetas).setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null, "No se han encontrado etiquetas con el criterio solicitado");
            
        }
        dispose();    
    }//GEN-LAST:event_JBetiquetasActionPerformed
    /**
     * Si es que el usuario presiona el boton de volver al menu, se cierra este frame
     * y se vuelve al menu principal
     * @param evt 
     */
    private void JBbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBbackActionPerformed
        dispose();
    }//GEN-LAST:event_JBbackActionPerformed

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
            java.util.logging.Logger.getLogger(Fsearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fsearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fsearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fsearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fsearch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBback;
    private javax.swing.JButton JBetiquetas;
    private javax.swing.JButton JBpreguntas;
    private javax.swing.JButton JBrespuestas;
    private javax.swing.JTextField criterio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
