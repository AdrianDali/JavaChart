/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.geom.Area;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import modelo.ConnectionMDB;
import modelo.Usuario;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author hermo
 */
public class UserChart extends javax.swing.JFrame {

    /**
     * Creates new form UserChart
     */
    public UserChart() {
        initComponents();
        //jTextFieldUserId.setVisible(false);

        Usuario user = new Usuario();
        DefaultComboBoxModel modelBox = new DefaultComboBoxModel(user.mostrarUsuario());
        jComboBoxUsers.setModel(modelBox);
        AutoCompleteDecorator.decorate(jComboBoxUsers);

        //modelo de combo box area
        this.setLocationRelativeTo(null);

        //create border for the username and password field
        Border fieldBorder = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.black);
        //jTextFieldUsername.setBorder(fieldBorder);
        //jPasswordField.setBorder(fieldBorder);

        Border bordeLogin = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.black);
        //jLabelLogin.setBorder(bordeLogin);
       

     
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
        jPanel2 = new javax.swing.JPanel();
        jComboBoxUsers = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabelReturnMenu2 = new javax.swing.JLabel();
        jLabelMinimize2 = new javax.swing.JLabel();
        jLabelClose2 = new javax.swing.JLabel();
        jButtonDeleteUser = new javax.swing.JButton();
        jButtonDeleteUser1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 522, Short.MAX_VALUE)
        );

        jComboBoxUsers.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxUsersItemStateChanged(evt);
            }
        });
        jComboBoxUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxUsersActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel7.setText("Nombre: ");

        jLabelReturnMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arrow-back-32x32-1518595.png"))); // NOI18N
        jLabelReturnMenu2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabelReturnMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelReturnMenu2MouseClicked(evt);
            }
        });

        jLabelMinimize2.setBackground(new java.awt.Color(255, 255, 255));
        jLabelMinimize2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelMinimize2.setForeground(new java.awt.Color(0, 0, 0));
        jLabelMinimize2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMinimize2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/expand-more-24x24-1518579.png"))); // NOI18N
        jLabelMinimize2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabelMinimize2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinimize2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelMinimize2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelMinimize2MouseExited(evt);
            }
        });

        jLabelClose2.setBackground(new java.awt.Color(255, 255, 255));
        jLabelClose2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelClose2.setForeground(new java.awt.Color(0, 0, 0));
        jLabelClose2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelClose2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close-24x24-1518581.png"))); // NOI18N
        jLabelClose2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabelClose2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelClose2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelClose2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelClose2MouseExited(evt);
            }
        });

        jButtonDeleteUser.setBackground(new java.awt.Color(0, 203, 255));
        jButtonDeleteUser.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 24)); // NOI18N
        jButtonDeleteUser.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDeleteUser.setText("Historial Usuario");
        jButtonDeleteUser.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonDeleteUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonDeleteUserMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonDeleteUserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonDeleteUserMouseExited(evt);
            }
        });
        jButtonDeleteUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteUserActionPerformed(evt);
            }
        });

        jButtonDeleteUser1.setBackground(new java.awt.Color(0, 203, 255));
        jButtonDeleteUser1.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 24)); // NOI18N
        jButtonDeleteUser1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDeleteUser1.setText("Historial Usuario");
        jButtonDeleteUser1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonDeleteUser1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonDeleteUser1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonDeleteUser1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonDeleteUser1MouseExited(evt);
            }
        });
        jButtonDeleteUser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteUser1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelReturnMenu2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelMinimize2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelClose2))
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 380, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(86, 86, 86))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonDeleteUser)
                                .addGap(26, 26, 26))))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jButtonDeleteUser1)
                    .addContainerGap(449, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelClose2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelReturnMenu2)
                    .addComponent(jLabelMinimize2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButtonDeleteUser, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(380, Short.MAX_VALUE)
                    .addComponent(jButtonDeleteUser1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(46, 46, 46)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDeleteUser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteUser1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonDeleteUser1ActionPerformed

    private void jButtonDeleteUser1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonDeleteUser1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonDeleteUser1MouseExited

    private void jButtonDeleteUser1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonDeleteUser1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonDeleteUser1MouseEntered

    private void jButtonDeleteUser1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonDeleteUser1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonDeleteUser1MouseClicked

    private void jButtonDeleteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteUserActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonDeleteUserActionPerformed

    private void jButtonDeleteUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonDeleteUserMouseExited
        // TODO add your handling code here:
        jButtonDeleteUser.setBackground(new Color(0,203,255));
    }//GEN-LAST:event_jButtonDeleteUserMouseExited

    private void jButtonDeleteUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonDeleteUserMouseEntered
        // TODO add your handling code here:
        jButtonDeleteUser.setBackground(new Color(0,150,199));
    }//GEN-LAST:event_jButtonDeleteUserMouseEntered

    private void jButtonDeleteUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonDeleteUserMouseClicked
        UserDelete delete = new UserDelete();
        delete.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonDeleteUserMouseClicked

    private void jLabelMinimize2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimize2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelMinimize2MouseExited

    private void jLabelMinimize2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimize2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelMinimize2MouseEntered

    private void jLabelMinimize2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimize2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelMinimize2MouseClicked

    private void jLabelReturnMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelReturnMenu2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelReturnMenu2MouseClicked

    private void jComboBoxUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxUsersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxUsersActionPerformed

    private void jComboBoxUsersItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxUsersItemStateChanged
        //si alguno de los paises es seleccionado
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            System.out.println("OKKKK");
            Usuario user = (Usuario) jComboBoxUsers.getSelectedItem();
            //System.out.println(user.getEdad());

            //DefaultTableModel model = new DefaultTableModel();
            //jTable1.setModel(model);
            //Area area = new Area();
            PreparedStatement ps;
            ResultSet rs;

            //create a select query to heck if the username and the password exist in the database
            String query = "Select id_area, id_usuario,nombre, fecha_ingreso, edad FROM usuario where id_usuario = " + user.getId_usuario();

            try {

                ConnectionMDB con = new ConnectionMDB();
                Connection conexion = con.getConnection();

                ps = conexion.prepareStatement(query);
                rs = ps.executeQuery();
                Area area = new Area();

                while (rs.next()) {
                    System.out.println("asdasdasdasd");
                    // area.setId_area(rs.getInt("id_area"));
                    user.setId_usuario(rs.getInt("id_usuario"));
                    user.setNombre(rs.getString("nombre"));
                    user.setFecha_ingreso(rs.getDate("fecha_ingreso"));
                    user.setEdad(rs.getInt("edad"));
                    System.out.println("aquiiiiiiiiiiii");

                }
                conexion.close();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Connection failed", "Users Error", 2);
                System.out.println(ex);
            }
        }
    }//GEN-LAST:event_jComboBoxUsersItemStateChanged

    private void jLabelClose2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelClose2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelClose2MouseExited

    private void jLabelClose2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelClose2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelClose2MouseEntered

    private void jLabelClose2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelClose2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelClose2MouseClicked

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
            java.util.logging.Logger.getLogger(UserChart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserChart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserChart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserChart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserChart().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDeleteUser;
    private javax.swing.JButton jButtonDeleteUser1;
    private javax.swing.JComboBox<String> jComboBoxUsers;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelClose2;
    private javax.swing.JLabel jLabelMinimize2;
    private javax.swing.JLabel jLabelReturnMenu2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
