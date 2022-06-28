/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ItemEvent;
import java.awt.geom.Area;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelo.ConnectionMDB;
import modelo.Usuario;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author hermo
 */
public class ChartUser extends javax.swing.JFrame {

    /**
     * Creates new form ChartUser
     */
    public ChartUser() {
        initComponents();
        Usuario user = new Usuario();

        //jTextFieldUserId.setVisible(false);
        DefaultComboBoxModel modelBox = new DefaultComboBoxModel(user.mostrarUsuario());

        jComboBoxUsers.setModel(modelBox);
        AutoCompleteDecorator.decorate(jComboBoxUsers);
        //center the window
        this.setLocationRelativeTo(null);

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
        jLabelLogin = new javax.swing.JLabel();
        jLabelMinimize = new javax.swing.JLabel();
        jLabelClose = new javax.swing.JLabel();
        jComboBoxUsers = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jButtonDeleteUser1 = new javax.swing.JButton();
        jComboBoxUsers1 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jComboBoxUsers2 = new javax.swing.JComboBox<>();
        jLabelReturnMenu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 600));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabelLogin.setFont(new java.awt.Font("SansSerif", 1, 38)); // NOI18N
        jLabelLogin.setForeground(new java.awt.Color(0, 0, 0));
        jLabelLogin.setText("Produccion");

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 304, Short.MAX_VALUE)
        );

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel8.setText("Fecha: ");

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

        jComboBoxUsers1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxUsers1ItemStateChanged(evt);
            }
        });
        jComboBoxUsers1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxUsers1ActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel9.setText("Proceso: ");

        jComboBoxUsers2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxUsers2ItemStateChanged(evt);
            }
        });
        jComboBoxUsers2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxUsers2ActionPerformed(evt);
            }
        });

        jLabelReturnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arrow-back-32x32-1518595.png"))); // NOI18N
        jLabelReturnMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabelReturnMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelReturnMenuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelReturnMenu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxUsers2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 163, Short.MAX_VALUE)
                                .addComponent(jLabelMinimize)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelClose))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonDeleteUser1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxUsers1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelClose, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelReturnMenu))
                        .addGap(5, 5, 5)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jComboBoxUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jComboBoxUsers1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxUsers2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonDeleteUser1)
                .addContainerGap())
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

    private void jLabelMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizeMouseClicked
        //minimize the frame with the minimizum label
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinimizeMouseClicked

    private void jLabelMinimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizeMouseEntered
        // Border jlabel_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        // jLabelMinimize.setBorder(jlabel_border);
        jLabelMinimize.setForeground(Color.white);
    }//GEN-LAST:event_jLabelMinimizeMouseEntered

    private void jLabelMinimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizeMouseExited
        //set border for de  - label
        //Border jlabel_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        // jLabelMinimize.setBorder(jlabel_border);
        jLabelMinimize.setForeground(Color.black);
    }//GEN-LAST:event_jLabelMinimizeMouseExited

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabelCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseEntered
        //Border jlabel_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        // jLabelClose.setBorder(jlabel_border);
        jLabelClose.setForeground(Color.white);
    }//GEN-LAST:event_jLabelCloseMouseEntered

    private void jLabelCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseExited
        //Border jlabel_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        //jLabelClose.setBorder(jlabel_border);
        jLabelClose.setForeground(Color.black);
    }//GEN-LAST:event_jLabelCloseMouseExited

    private void jComboBoxUsersItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxUsersItemStateChanged
        //si alguno de los paises es seleccionado
        if (evt.getStateChange() == ItemEvent.SELECTED) {
             
                repaint();
            Usuario user = (Usuario) jComboBoxUsers.getSelectedItem();
            System.out.println("ID_USUARIO: " + user.getId_usuario());

            PreparedStatement ps;
            ResultSet rs;

            //create a select query to heck if the username and the password exist in the database
            String query = "select p.nombre, p.hora_inicio, p.hora_termino from proceso as p join proceso_usuario as u \n"
                    + "on  p.id_proceso = u.id_proceso where u.id_usuario = " + user.getId_usuario();

            try {

                ConnectionMDB con = new ConnectionMDB();
                Connection conexion = con.getConnection();
                DefaultCategoryDataset datos = new DefaultCategoryDataset();

                ps = conexion.prepareStatement(query);
                rs = ps.executeQuery();
                Area area = new Area();

                while (rs.next()) {
                    System.out.println("asdasdasdasd");
                    System.out.println(String.valueOf(rs.getDate("p.hora_inicio")));
                    datos.setValue(50, user.getNombre(), rs.getString("p.nombre"));

                }

                JFreeChart grafico_barras = ChartFactory.createBarChart3D(
                        "Graficas de produccion",
                        "Usuario",
                        "produccion",
                        datos,
                        PlotOrientation.VERTICAL,
                        true,
                        true,
                        false
                );

                ChartPanel panel = new ChartPanel(grafico_barras);
                panel.setMouseWheelEnabled(true);
                panel.setPreferredSize(new Dimension(400, 300));

                jPanel2.setLayout(new BorderLayout());
                jPanel2.add(panel, BorderLayout.NORTH);
grafico_barras.fireChartChanged();
               pack();
                
               //repaint();
                

                conexion.close();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Connection failed", "Users Error", 2);
                System.out.println(ex);
            }
        }
    }//GEN-LAST:event_jComboBoxUsersItemStateChanged

    private void jComboBoxUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxUsersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxUsersActionPerformed

    private void jButtonDeleteUser1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonDeleteUser1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonDeleteUser1MouseClicked

    private void jButtonDeleteUser1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonDeleteUser1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonDeleteUser1MouseEntered

    private void jButtonDeleteUser1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonDeleteUser1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonDeleteUser1MouseExited

    private void jButtonDeleteUser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteUser1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonDeleteUser1ActionPerformed

    private void jComboBoxUsers1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxUsers1ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxUsers1ItemStateChanged

    private void jComboBoxUsers1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxUsers1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxUsers1ActionPerformed

    private void jComboBoxUsers2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxUsers2ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxUsers2ItemStateChanged

    private void jComboBoxUsers2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxUsers2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxUsers2ActionPerformed

    private void jLabelReturnMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelReturnMenuMouseClicked
        //show the mainmenu window
        UsersMenu menu = new UsersMenu();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabelReturnMenuMouseClicked

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
            java.util.logging.Logger.getLogger(ChartUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChartUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChartUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChartUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChartUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDeleteUser1;
    private javax.swing.JComboBox<String> jComboBoxUsers;
    private javax.swing.JComboBox<String> jComboBoxUsers1;
    private javax.swing.JComboBox<String> jComboBoxUsers2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelLogin;
    private javax.swing.JLabel jLabelMinimize;
    private javax.swing.JLabel jLabelReturnMenu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
