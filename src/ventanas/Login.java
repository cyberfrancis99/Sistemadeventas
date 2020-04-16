/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import clases.DAO.DaoLog;
import clases.Dao_Ingreso;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author francis nathanael 
 */
public class Login extends javax.swing.JFrame {
   private DaoLog login;
    public static String userlogeado;
    
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        transpareciabtn();
        
        try {
            login = new DaoLog("192.168.56.102","final_fac","postgres","123456");
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_user = new javax.swing.JLabel();
        icon_user = new javax.swing.JLabel();
        lbl_user1 = new javax.swing.JLabel();
        txt_user = new javax.swing.JTextField();
        txt_pasword = new javax.swing.JPasswordField();
        Btn_entrar = new javax.swing.JButton();
        Btn_cancelar = new javax.swing.JButton();
        timbrado2 = new javax.swing.JLabel();
        Btn_salir = new javax.swing.JButton();
        fonfo_log = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_user.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbl_user.setText("Usuario");
        jPanel1.add(lbl_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, -1, -1));

        icon_user.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        icon_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario-registrados.png"))); // NOI18N
        jPanel1.add(icon_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 190, 240));

        lbl_user1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbl_user1.setText("Contraseña");
        jPanel1.add(lbl_user1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, -1, -1));

        txt_user.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txt_user.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(txt_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 220, 30));

        txt_pasword.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txt_pasword.setText("jPasswordField1");
        jPanel1.add(txt_pasword, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 220, 30));

        Btn_entrar.setBackground(java.awt.Color.white);
        Btn_entrar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Btn_entrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Ingresar.png"))); // NOI18N
        Btn_entrar.setText("Acceder");
        Btn_entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_entrarActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, -1, 40));

        Btn_cancelar.setBackground(java.awt.Color.white);
        Btn_cancelar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Btn_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/27818698-cancelar-icono-Foto-de-archivo.jpg"))); // NOI18N
        Btn_cancelar.setText("Cancelar");
        Btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_cancelarActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 120, 40));

        timbrado2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        timbrado2.setText("Inicio de Sesion");
        jPanel1.add(timbrado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, -1, -1));

        Btn_salir.setBackground(java.awt.Color.blue);
        Btn_salir.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        Btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_salirActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 50, 50));

        fonfo_log.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fundo_log.jpg"))); // NOI18N
        jPanel1.add(fonfo_log, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 260));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // ESte metodo me hace transparente el boton para que el icono se vea solo
    private void transpareciabtn (){
    Btn_salir.setOpaque(false);
    Btn_salir.setContentAreaFilled(false);
    Btn_salir.setBorderPainted(false);    
    }
    
    private void Btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_cancelarActionPerformed
        txt_user.setText("");
        txt_pasword.setText("");
        txt_user.requestFocus();
    }//GEN-LAST:event_Btn_cancelarActionPerformed

    private void Btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_salirActionPerformed
       System.exit(0);
        
    }//GEN-LAST:event_Btn_salirActionPerformed

    private void Btn_entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_entrarActionPerformed
       
      String var;
        var=txt_user.getText() + " "+ txt_pasword.getText();
        
        try {
            if ( login.permisoForUser(txt_user.getText(), txt_pasword.getText()))
            {
                JOptionPane.showMessageDialog(null, "El usuario esta permitido");
                Menuses jFrame= new Menuses();
                jFrame.setVisible(true);
                userlogeado = txt_user.getText();
                this.dispose();
                
            }
            else
                JOptionPane.showMessageDialog(null, "El usuario no esta permitido");
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }//GEN-LAST:event_Btn_entrarActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_cancelar;
    private javax.swing.JButton Btn_entrar;
    private javax.swing.JButton Btn_salir;
    private javax.swing.JLabel fonfo_log;
    private javax.swing.JLabel icon_user;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_user;
    private javax.swing.JLabel lbl_user1;
    private javax.swing.JLabel timbrado2;
    private javax.swing.JPasswordField txt_pasword;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables
}
