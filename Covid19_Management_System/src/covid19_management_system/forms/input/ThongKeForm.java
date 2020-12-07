/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covid19_management_system.forms.input;

import covid19_management_system.forms.show.Show_CachLy_Form;
import covid19_management_system.forms.show.Show_DichTe_Form;
import covid19_management_system.forms.show.Show_Person_Form;
import javax.swing.JFrame;

/**
 *
 * @author HieuPhung
 */
public class ThongKeForm extends javax.swing.JFrame {

    /**
     * Creates new form ThongKe
     */
    public ThongKeForm() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenuThongKe = new javax.swing.JMenu();
        jMenuDichTeForm = new javax.swing.JMenu();
        jMenuItemDichTeADD = new javax.swing.JMenuItem();
        jMenuItemDichTeSHOW = new javax.swing.JMenuItem();
        jMenuCachLyForm = new javax.swing.JMenu();
        jMenuItemCachLyADD = new javax.swing.JMenuItem();
        jMenuItemCachLySHOW = new javax.swing.JMenuItem();
        jMenuPersonForm = new javax.swing.JMenu();
        jMenuItemPersonADD = new javax.swing.JMenuItem();
        jMenuItemPersonSHOW = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 56)); // NOI18N
        jLabel1.setText("KILL ALL CORONA VIRUSES");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 56)); // NOI18N
        jLabel2.setText("LET'S GOOOOOOOOOOO !!!!!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addContainerGap(224, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(562, Short.MAX_VALUE))
        );

        jMenuBar2.setPreferredSize(new java.awt.Dimension(446, 35));

        jMenuThongKe.setBackground(new java.awt.Color(51, 51, 255));
        jMenuThongKe.setBorder(null);
        jMenuThongKe.setText("Thống kê");
        jMenuThongKe.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuThongKe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenuThongKe.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jMenuBar2.add(jMenuThongKe);

        jMenuDichTeForm.setBackground(new java.awt.Color(255, 153, 0));
        jMenuDichTeForm.setBorder(null);
        jMenuDichTeForm.setText("Khai báo dịch tễ");
        jMenuDichTeForm.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuDichTeForm.setMargin(new java.awt.Insets(10, 10, 10, 10));

        jMenuItemDichTeADD.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItemDichTeADD.setText("Thêm mới");
        jMenuItemDichTeADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDichTeADDActionPerformed(evt);
            }
        });
        jMenuDichTeForm.add(jMenuItemDichTeADD);

        jMenuItemDichTeSHOW.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItemDichTeSHOW.setText("Xem");
        jMenuItemDichTeSHOW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDichTeSHOWActionPerformed(evt);
            }
        });
        jMenuDichTeForm.add(jMenuItemDichTeSHOW);

        jMenuBar2.add(jMenuDichTeForm);

        jMenuCachLyForm.setBackground(new java.awt.Color(255, 0, 51));
        jMenuCachLyForm.setBorder(null);
        jMenuCachLyForm.setText("Khai báo cách ly");
        jMenuCachLyForm.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuCachLyForm.setMargin(new java.awt.Insets(10, 10, 10, 10));

        jMenuItemCachLyADD.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItemCachLyADD.setText("Thêm mới");
        jMenuItemCachLyADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCachLyADDActionPerformed(evt);
            }
        });
        jMenuCachLyForm.add(jMenuItemCachLyADD);

        jMenuItemCachLySHOW.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItemCachLySHOW.setText("Xem");
        jMenuItemCachLySHOW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCachLySHOWActionPerformed(evt);
            }
        });
        jMenuCachLyForm.add(jMenuItemCachLySHOW);

        jMenuBar2.add(jMenuCachLyForm);

        jMenuPersonForm.setBackground(new java.awt.Color(0, 204, 51));
        jMenuPersonForm.setBorder(null);
        jMenuPersonForm.setText("Thông tin người dân");
        jMenuPersonForm.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuPersonForm.setHideActionText(true);
        jMenuPersonForm.setMargin(new java.awt.Insets(10, 10, 10, 10));

        jMenuItemPersonADD.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItemPersonADD.setText("Thêm mới");
        jMenuItemPersonADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPersonADDActionPerformed(evt);
            }
        });
        jMenuPersonForm.add(jMenuItemPersonADD);

        jMenuItemPersonSHOW.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItemPersonSHOW.setText("Xem");
        jMenuItemPersonSHOW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPersonSHOWActionPerformed(evt);
            }
        });
        jMenuPersonForm.add(jMenuItemPersonSHOW);

        jMenuBar2.add(jMenuPersonForm);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1238, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 817, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemDichTeADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDichTeADDActionPerformed
        
        // open the manage clients form
        DichTeForm dichTeForm = new DichTeForm();
        dichTeForm.setSize(1238, 867);
        dichTeForm.setVisible(true);
//        dichTeForm.pack();
        dichTeForm.setLocationRelativeTo(null);
        dichTeForm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }//GEN-LAST:event_jMenuItemDichTeADDActionPerformed

    private void jMenuItemDichTeSHOWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDichTeSHOWActionPerformed
       
        // open the manage clients form
        Show_DichTe_Form dichTeShowForm = new Show_DichTe_Form();
        dichTeShowForm.setVisible(true);
        dichTeShowForm.pack();
        dichTeShowForm.setLocationRelativeTo(null);
        dichTeShowForm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }//GEN-LAST:event_jMenuItemDichTeSHOWActionPerformed

    private void jMenuItemCachLyADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCachLyADDActionPerformed
        
        // open the manage clients form
        CachLyForm cachLyForm = new CachLyForm();
        cachLyForm.setVisible(true);
        cachLyForm.pack();
        cachLyForm.setLocationRelativeTo(null);
        cachLyForm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }//GEN-LAST:event_jMenuItemCachLyADDActionPerformed

    private void jMenuItemCachLySHOWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCachLySHOWActionPerformed
        
        // open the manage clients form
        Show_CachLy_Form cachLyShowForm = new Show_CachLy_Form();
        cachLyShowForm.setVisible(true);
        cachLyShowForm.pack();
        cachLyShowForm.setLocationRelativeTo(null);
        cachLyShowForm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }//GEN-LAST:event_jMenuItemCachLySHOWActionPerformed

    private void jMenuItemPersonADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPersonADDActionPerformed
        
        // open the manage clients form
        PersonForm personForm = new PersonForm();
        personForm.setVisible(true);
        personForm.pack();
        personForm.setLocationRelativeTo(null);
        personForm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }//GEN-LAST:event_jMenuItemPersonADDActionPerformed

    private void jMenuItemPersonSHOWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPersonSHOWActionPerformed
        
        // open the manage clients form
        Show_Person_Form personShowForm = new Show_Person_Form();
        personShowForm.setVisible(true);
        personShowForm.pack();
        personShowForm.setLocationRelativeTo(null);
        personShowForm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }//GEN-LAST:event_jMenuItemPersonSHOWActionPerformed

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
            java.util.logging.Logger.getLogger(ThongKeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThongKeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThongKeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThongKeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThongKeForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenu jMenuCachLyForm;
    private javax.swing.JMenu jMenuDichTeForm;
    private javax.swing.JMenuItem jMenuItemCachLyADD;
    private javax.swing.JMenuItem jMenuItemCachLySHOW;
    private javax.swing.JMenuItem jMenuItemDichTeADD;
    private javax.swing.JMenuItem jMenuItemDichTeSHOW;
    private javax.swing.JMenuItem jMenuItemPersonADD;
    private javax.swing.JMenuItem jMenuItemPersonSHOW;
    private javax.swing.JMenu jMenuPersonForm;
    private javax.swing.JMenu jMenuThongKe;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}