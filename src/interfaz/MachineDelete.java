/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.awt.Color;
import java.awt.event.ItemEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.geom.Area;
import modelo.ConnectionMDB;
import modelo.Usuario;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author hermo
 */
public class MachineDelete extends javax.swing.JFrame {

    public MachineDelete() {

        initComponents();
        Usuario user = new Usuario();
        
        jTextFieldUserId.setVisible(false);

        DefaultComboBoxModel modelBox = new DefaultComboBoxModel(user.mostrarUsuario());
        
        jComboBoxUsers.setModel(modelBox);
        AutoCompleteDecorator.decorate(jComboBoxUsers);
        //center the window
        this.setLocationRelativeTo(null);

        //create border for the username and password field
        Border fieldBorder = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.black);
        // jTextFieldUsername.setBorder(fieldBorder);
        //jPasswordField.setBorder(fieldBorder);
        
                Border bordeLogin = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.black);
        jLabelLogin.setBorder(bordeLogin);

        //Border bordeLogin = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.black);
        //jLabelLogin.setBorder(bordeLogin);
        //jLabelMinimize.setBorder(bordeLogin);
        //jLabelClose.setBorder(bordeLogin);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabelMinimize = new javax.swing.JLabel();
        jLabelClose = new javax.swing.JLabel();
        jLabelLogin = new javax.swing.JLabel();
        jLabelReturnMenu = new javax.swing.JLabel();
        jComboBoxUsers = new javax.swing.JComboBox<>();
        jDateChooser = new com.toedter.calendar.JDateChooser();
        jTextFieldUserId = new javax.swing.JTextField();
        jTextFieldYears = new javax.swing.JTextField();
        jTextFieldName = new javax.swing.JTextField();
        jButtonLogin = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(673, 575));

        jLabelMinimize.setBackground(new java.awt.Color(255, 255, 255));
        jLabelMinimize.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelMinimize.setForeground(new java.awt.Color(0, 0, 0));
        jLabelMinimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/expand-more-24x24-1518579.png"))); // NOI18N
        jLabelMinimize.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabelMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelMinimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelMinimizeMouseExited(evt);
            }
        });

        jLabelClose.setBackground(new java.awt.Color(255, 255, 255));
        jLabelClose.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelClose.setForeground(new java.awt.Color(0, 0, 0));
        jLabelClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close-24x24-1518581.png"))); // NOI18N
        jLabelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseExited(evt);
            }
        });

        jLabelLogin.setFont(new java.awt.Font("SansSerif", 1, 38)); // NOI18N
        jLabelLogin.setForeground(new java.awt.Color(0, 0, 0));
        jLabelLogin.setText("Borrar Usuario");

        jLabelReturnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arrow-back-32x32-1518595.png"))); // NOI18N
        jLabelReturnMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabelReturnMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelReturnMenuMouseClicked(evt);
            }
        });

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

        jDateChooser.setDateFormatString("yyyy/MM/d");

        jTextFieldName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNameActionPerformed(evt);
            }
        });

        jButtonLogin.setBackground(new java.awt.Color(0, 203, 255));
        jButtonLogin.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 24)); // NOI18N
        jButtonLogin.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLogin.setText("Borrar");
        jButtonLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonLoginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonLoginMouseExited(evt);
            }
        });
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/remove-user.png"))); // NOI18N

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel7.setText("Nombre: ");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel8.setText("Edad:");

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel10.setText("Fecha ingreso: ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(270, 270, 270)
                                .addComponent(jLabel3)
                                .addGap(21, 21, 21))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabelReturnMenu)
                                .addGap(375, 375, 375)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelMinimize)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelClose))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(jButtonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(111, 111, 111)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addGap(6, 6, 6)
                                                        .addComponent(jLabel10))
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jComboBoxUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jLabel8)))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldYears, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(19, 19, 19)
                                                .addComponent(jTextFieldUserId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(335, 335, 335)
                                        .addComponent(jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 387, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelClose, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelReturnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel3)
                .addGap(24, 24, 24)
                .addComponent(jComboBoxUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jTextFieldUserId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                        .addComponent(jTextFieldName))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldYears, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jButtonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 990, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 742, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed

    }//GEN-LAST:event_jButtonLoginActionPerformed

    private void jButtonLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonLoginMouseEntered
        // TODO add your handling code here:
        jButtonLogin.setBackground(new Color(0, 150, 199));
    }//GEN-LAST:event_jButtonLoginMouseEntered

    private void jButtonLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonLoginMouseExited
        //set jbutton background
        jButtonLogin.setBackground(new Color(0, 203, 255));
    }//GEN-LAST:event_jButtonLoginMouseExited

    private void jButtonLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonLoginMouseClicked

        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            System.out.println("cool");
            ConnectionMDB con = new ConnectionMDB();
            Connection conexion = con.getConnection();

            ps = conexion.prepareStatement("DELETE FROM usuario Where id_usuario = ?");
            ps.setInt(1, Integer.parseInt(jTextFieldUserId.getText()));

            int result = ps.executeUpdate();
            if (result > 0) {
                JOptionPane.showMessageDialog(null, "Borrado");
            }
        } catch (Exception ex) {
            System.out.println("error al insertar");
            System.out.println(ex);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonLoginMouseClicked

    private void jTextFieldNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNameActionPerformed

    private void jComboBoxUsersItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxUsersItemStateChanged
        //si alguno de los paises es seleccionado
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            Usuario user = (Usuario) jComboBoxUsers.getSelectedItem();

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
                    jTextFieldName.setText(user.getNombre() + "");
                    jTextFieldYears.setText(user.getEdad() + "");
                    jTextFieldUserId.setText(user.getId_usuario() + "");
                    jDateChooser.setDate(user.getFecha_ingreso());
                  //  System.out.println("AQUUIII" + area.MostrarArea(area.getId_area()));
                   // DefaultComboBoxModel modeloDos = new DefaultComboBoxModel(area.MostrarArea(area.getId_area()));
                    //jComboBoxArea.setModel(modeloDos);

                }
                conexion.close();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Connection failed", "Users Error", 2);
                System.out.println(ex);
            }
        }
    }//GEN-LAST:event_jComboBoxUsersItemStateChanged

    private void jLabelReturnMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelReturnMenuMouseClicked
        //show the mainmenu window
        UserMenu menu = new UserMenu();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabelReturnMenuMouseClicked

    private void jLabelCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseExited
        //Border jlabel_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        //jLabelClose.setBorder(jlabel_border);
        jLabelClose.setForeground(Color.black);
    }//GEN-LAST:event_jLabelCloseMouseExited

    private void jLabelCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseEntered
        //Border jlabel_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        // jLabelClose.setBorder(jlabel_border);
        jLabelClose.setForeground(Color.white);
    }//GEN-LAST:event_jLabelCloseMouseEntered

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabelMinimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizeMouseExited
        //set border for de  - label
        //Border jlabel_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        // jLabelMinimize.setBorder(jlabel_border);
        jLabelMinimize.setForeground(Color.black);
    }//GEN-LAST:event_jLabelMinimizeMouseExited

    private void jLabelMinimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizeMouseEntered
        // Border jlabel_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        // jLabelMinimize.setBorder(jlabel_border);
        jLabelMinimize.setForeground(Color.white);
    }//GEN-LAST:event_jLabelMinimizeMouseEntered

    private void jLabelMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizeMouseClicked
        //minimize the frame with the minimizum label
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinimizeMouseClicked

    private void jComboBoxUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxUsersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxUsersActionPerformed

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
            java.util.logging.Logger.getLogger(MachineDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MachineDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MachineDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MachineDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new MachineDelete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JComboBox<String> jComboBoxUsers;
    private com.toedter.calendar.JDateChooser jDateChooser;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelLogin;
    private javax.swing.JLabel jLabelMinimize;
    private javax.swing.JLabel jLabelReturnMenu;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldUserId;
    private javax.swing.JTextField jTextFieldYears;
    // End of variables declaration//GEN-END:variables
}
