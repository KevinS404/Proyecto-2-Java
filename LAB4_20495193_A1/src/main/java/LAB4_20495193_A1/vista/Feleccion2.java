/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB4_20495193_A1.vista;

import LAB4_20495193_A1.controlador.Answer;
import LAB4_20495193_A1.controlador.Login;
import LAB4_20495193_A1.modelo.Pregunta;
import LAB4_20495193_A1.modelo.Stack;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class Feleccion2 extends javax.swing.JFrame {
    private Stack stack;
    private Login usuario;
    /**
     * Creates new form Feleccion
     */
    public Feleccion2(Stack stack, Login usuario) {
        this.stack = stack;
        this.usuario = usuario;
        initComponents();
    }

    private Feleccion2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Stack getStack() {
        return stack;
    }

    public void setStack(Stack stack) {
        this.stack = stack;
    }

    public Login getUsuario() {
        return usuario;
    }

    public void setUsuario(Login usuario) {
        this.usuario = usuario;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JTpreguntas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        JTpreguntas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        JTpreguntas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTpreguntasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTpreguntas);

        jLabel1.setText("Tus preguntas:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 819, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(369, 369, 369)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        this.elegirPregunta();
    }//GEN-LAST:event_formWindowGainedFocus

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.elegirPregunta();
    }//GEN-LAST:event_formWindowOpened
    //cuando el usuario presione una pregunta entonces el programa ejecutara el proceso
    //de aceptar una respuesta
    private void JTpreguntasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTpreguntasMouseClicked
        DefaultTableModel tablita = (DefaultTableModel)JTpreguntas.getModel();
        int selectedRowIndex = JTpreguntas.getSelectedRow();
        String auxiliar = (String)JTpreguntas.getValueAt(JTpreguntas.getSelectedRow(), 0);
        //new Feleccion2(stack,usuario,auxiliar).setVisible(true);
        dispose();
    }//GEN-LAST:event_JTpreguntasMouseClicked
    //Se muestra por pantalla una tabla con los datos correspondientes a la pregunta
    //para que el usuario pueda elegir una
    private void elegirPregunta(){ 
        ArrayList<Pregunta> preguntasD;
        preguntasD = stack.buscarMisPreguntas(stack,usuario.getNombre());
        if(preguntasD.size() >= 1){
            DefaultTableModel tablita = new DefaultTableModel();
            tablita.addColumn("ID");
            tablita.addColumn("Autor");
            tablita.addColumn("Titulo");
            tablita.addColumn("Contenido");
            tablita.addColumn("Etiquetas");
            tablita.addColumn("Fecha publicacion");
            tablita.addColumn("Recompensa");
            JTpreguntas.setModel(tablita);
            String[] dato = new String[7];
            for(int i = 0; i < preguntasD.size();i++){
                Pregunta prg = preguntasD.get(i);
                dato[0] = prg.getIdPregunta()+"";
                dato[1] = prg.getAutor();
                dato[2] = prg.getTitulo();
                dato[3] = prg.getContenido();
                dato[4] = prg.getEtiquetas()+"";
                dato[5] = prg.getFechaDePublicacion();
                dato[6] = prg.getRecompensa()+ "";
                tablita.addRow(dato);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "No tiene preguntas disponibles");
            dispose();
        }
        
    }
    
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
            java.util.logging.Logger.getLogger(Feleccion2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Feleccion2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Feleccion2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Feleccion2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Feleccion2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTpreguntas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
