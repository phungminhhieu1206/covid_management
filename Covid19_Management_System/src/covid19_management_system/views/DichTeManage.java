/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covid19_management_system.views;

import covid19_management_system.controllers.dichTeController.DeleteDichTeController;
import covid19_management_system.controllers.dichTeController.ShowTableDichTeController;
import covid19_management_system.controllers.nhankhauController.DeleteNhanKhauController;
import covid19_management_system.controllers.nhankhauController.ShowTableNhanKhauController;
import covid19_management_system.views.DichTe.AddDichTe;
import covid19_management_system.views.DichTe.EditDichTe;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HieuPhung
 */
public class DichTeManage extends javax.swing.JFrame {

    /**
     * Creates new form DichTeManage
     */
    ShowTableDichTeController showTableDichTeController = new ShowTableDichTeController();
    ShowTableNhanKhauController showTableNhanKhauController = new ShowTableNhanKhauController();
    DeleteNhanKhauController deleteNhanKhauController = new DeleteNhanKhauController();
    DeleteDichTeController deleteDichTeController = new DeleteDichTeController();

    public DichTeManage() {
        initComponents();
        this.setTitle("Quản lý thông tin khai báo dịch tễ cá nhân");

        this.settingTableShowDichTe();
        showTableDichTeController.showDichTe(jTableKhaiDichTe);

        // confirm de thuc hien dong
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                if (JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn đóng không ?", "Xác nhận thao tác", JOptionPane.YES_NO_OPTION) == 0) {
                    dispose();
                }
            }
        });
    }

    public void settingTableShowDichTe() {
        jTableKhaiDichTe.setAutoResizeMode(JTable.AUTO_RESIZE_NEXT_COLUMN);
        jTableKhaiDichTe.getColumnModel().getColumn(0).setPreferredWidth(1);
        jTableKhaiDichTe.getColumnModel().getColumn(1).setPreferredWidth(115);
        jTableKhaiDichTe.getColumnModel().getColumn(2).setPreferredWidth(50);
        jTableKhaiDichTe.getColumnModel().getColumn(3).setPreferredWidth(20);
        jTableKhaiDichTe.getColumnModel().getColumn(4).setPreferredWidth(150);
        jTableKhaiDichTe.getColumnModel().getColumn(5).setPreferredWidth(50);
        jTableKhaiDichTe.getColumnModel().getColumn(6).setPreferredWidth(50);
        jTableKhaiDichTe.getColumnModel().getColumn(7).setPreferredWidth(20);
        jTableKhaiDichTe.getColumnModel().getColumn(8).setPreferredWidth(20);
        jTableKhaiDichTe.getColumnModel().getColumn(9).setPreferredWidth(170);
        jTableKhaiDichTe.getColumnModel().getColumn(10).setPreferredWidth(170);

        jTableKhaiDichTe.setRowHeight(30);
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
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTFSearchByCMT = new javax.swing.JTextField();
        jButtonSearch = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButtonShowInfoDichTe = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableKhaiDichTe = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jButtonAddDichTe = new javax.swing.JButton();
        jButtonEditDichTe = new javax.swing.JButton();
        jButtonDeleteDichTe = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButtonXemChiTiet = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("QUẢN LÝ THÔNG TIN KHAI BÁO DỊCH TỄ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(538, 538, 538)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));

        jTFSearchByCMT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButtonSearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonSearch.setText("TÌM KIẾM");
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("TÌM KIẾM THEO CMT:");

        jButtonShowInfoDichTe.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonShowInfoDichTe.setText("SHOW ALL");
        jButtonShowInfoDichTe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonShowInfoDichTeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTFSearchByCMT, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonSearch)
                .addGap(18, 18, 18)
                .addComponent(jButtonShowInfoDichTe)
                .addContainerGap(350, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFSearchByCMT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSearch)
                    .addComponent(jLabel2)
                    .addComponent(jButtonShowInfoDichTe))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 204, 204));

        jTableKhaiDichTe.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jTableKhaiDichTe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Họ và tên", "Ngày sinh", "Giới tính", "Địa chỉ", "Số điện thoại", "Ngày khai", "TxCovid", "Từ vùng dịch", "Triệu chứng", "Bệnh"
            }
        )

        // make the jtable cells not edittable
        {public boolean isCellEditTable(int row, int column){
            return false;
        }}

    );
    jTableKhaiDichTe.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    jTableKhaiDichTe.setGridColor(new java.awt.Color(255, 255, 0));
    jTableKhaiDichTe.setRowHeight(25);
    jTableKhaiDichTe.setSelectionBackground(new java.awt.Color(0, 102, 51));
    jTableKhaiDichTe.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jTableKhaiDichTeMouseClicked(evt);
        }
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            jTableKhaiDichTeMouseEntered(evt);
        }
    });
    jScrollPane1.setViewportView(jTableKhaiDichTe);

    javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
    jPanel4.setLayout(jPanel4Layout);
    jPanel4Layout.setHorizontalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 0, Short.MAX_VALUE)
        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 962, Short.MAX_VALUE)
                .addContainerGap()))
    );
    jPanel4Layout.setVerticalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 527, Short.MAX_VALUE)
        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                .addContainerGap()))
    );

    jPanel5.setBackground(new java.awt.Color(255, 204, 204));

    jButtonAddDichTe.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jButtonAddDichTe.setText("THÊM MỚI");
    jButtonAddDichTe.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonAddDichTeActionPerformed(evt);
        }
    });

    jButtonEditDichTe.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jButtonEditDichTe.setText("SỬA");
    jButtonEditDichTe.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonEditDichTeActionPerformed(evt);
        }
    });

    jButtonDeleteDichTe.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jButtonDeleteDichTe.setText("XÓA");
    jButtonDeleteDichTe.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonDeleteDichTeActionPerformed(evt);
        }
    });

    jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel3.setText("Nhập mã hộ khẩu:");

    jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

    jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jButton5.setText("SHOW");
    jButton5.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton5ActionPerformed(evt);
        }
    });

    jButtonXemChiTiet.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jButtonXemChiTiet.setText("CHI TIẾT");
    jButtonXemChiTiet.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonXemChiTietActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
    jPanel5.setLayout(jPanel5Layout);
    jPanel5Layout.setHorizontalGroup(
        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel5Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addComponent(jLabel3)
                    .addGap(0, 2, Short.MAX_VALUE))
                .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addContainerGap())
        .addGroup(jPanel5Layout.createSequentialGroup()
            .addGap(22, 22, 22)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jButtonXemChiTiet, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonAddDichTe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonEditDichTe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonDeleteDichTe, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel5Layout.setVerticalGroup(
        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel5Layout.createSequentialGroup()
            .addGap(72, 72, 72)
            .addComponent(jButtonAddDichTe)
            .addGap(18, 18, 18)
            .addComponent(jButtonEditDichTe)
            .addGap(18, 18, 18)
            .addComponent(jButtonDeleteDichTe)
            .addGap(18, 18, 18)
            .addComponent(jButtonXemChiTiet)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel3)
            .addGap(18, 18, 18)
            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(jButton5)
            .addGap(134, 134, 134))
    );

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void jButtonAddDichTeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddDichTeActionPerformed
        jTFSearchByCMT.setText("");
        AddDichTe temp = new AddDichTe();
        temp.setLocationRelativeTo(null);
        temp.setResizable(false);
        temp.setVisible(true);

        temp.getjButtonAddDichTe().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    temp.addNewDichTe();
                } catch (SQLException ex) {
                    Logger.getLogger(DichTeManage.class.getName()).log(Level.SEVERE, null, ex);
                }

                settingTableShowDichTe();
                showTableDichTeController.showDichTe(jTableKhaiDichTe);
            }
        });
    }//GEN-LAST:event_jButtonAddDichTeActionPerformed

    private void jButtonEditDichTeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditDichTeActionPerformed
        if (jTFSearchByCMT.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Chọn khai báo dịch tễ muốn chỉnh sửa", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            String chungMinhThu = jTFSearchByCMT.getText().trim();
            jTFSearchByCMT.setText("");
            EditDichTe temp = new EditDichTe(chungMinhThu);
            temp.setSize(1188, 628);
            temp.setLocationRelativeTo(null);
            temp.setResizable(false);
            temp.setVisible(true);

            temp.getjButtonEditDichTe().addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        temp.editDichTe();
                    } catch (SQLException ex) {
                        Logger.getLogger(DichTeManage.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    settingTableShowDichTe();
                    showTableDichTeController.showDichTe(jTableKhaiDichTe);
                }
            });
        }
    }//GEN-LAST:event_jButtonEditDichTeActionPerformed

    private void jButtonDeleteDichTeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteDichTeActionPerformed
        if (jTFSearchByCMT.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Chọn khai báo dịch tễ muốn xóa trên bảng", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            String chungMinhThu = jTFSearchByCMT.getText().trim();
            int ID = 0;
            ID = deleteNhanKhauController.searchIDFromCMT(chungMinhThu);
            if (JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn xóa không ?", "Xác nhận thao tác", JOptionPane.YES_NO_OPTION) == 0) {
                try {
                    // xóa
                    if (deleteDichTeController.removeDichTe(ID)) {
                        deleteDichTeController.removeTrieuChung(ID);
                        deleteDichTeController.removeBenh(ID);
                        JOptionPane.showMessageDialog(rootPane, "Successfully !", "Infomation", JOptionPane.INFORMATION_MESSAGE);
                        jTFSearchByCMT.setText("");
                        this.settingTableShowDichTe();
                        showTableDichTeController.showDichTe(jTableKhaiDichTe);
                        
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Fail !", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(DichTeManage.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else {
                return;
            }
        }
    }//GEN-LAST:event_jButtonDeleteDichTeActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTableKhaiDichTeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableKhaiDichTeMouseClicked
        DefaultTableModel model = (DefaultTableModel) jTableKhaiDichTe.getModel();
        int rowIndex = jTableKhaiDichTe.getSelectedRow();
        // display data
        int ID = 0;
        ID = (int) model.getValueAt(rowIndex, 0);
//        jTFSearchByCMT.setText(model.getValueAt(rowIndex, 0).toString());
        String chungMinhThu = showTableNhanKhauController.searchCMTByID(ID).trim();
        jTFSearchByCMT.setText(chungMinhThu);
    }//GEN-LAST:event_jTableKhaiDichTeMouseClicked

    private void jTableKhaiDichTeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableKhaiDichTeMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableKhaiDichTeMouseEntered

    private void jButtonShowInfoDichTeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonShowInfoDichTeActionPerformed
        jTFSearchByCMT.setText("");
        this.settingTableShowDichTe();
        showTableDichTeController.showDichTe(jTableKhaiDichTe);
    }//GEN-LAST:event_jButtonShowInfoDichTeActionPerformed

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed
        if (jTFSearchByCMT.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Nhập chứng minh thư để tìm kiếm ", "Information", JOptionPane.INFORMATION_MESSAGE);
            this.settingTableShowDichTe();
            showTableDichTeController.showDichTe(jTableKhaiDichTe);
            return;
        } else {
            String chungMinhThu = jTFSearchByCMT.getText().trim();
            if (checkDesignCMT()) {
                showTableDichTeController.showDichTeWithCMT(jTableKhaiDichTe, chungMinhThu);
                if (jTableKhaiDichTe.getRowCount() == 0) {
                    this.settingTableShowDichTe();
                    showTableDichTeController.showDichTe(jTableKhaiDichTe);
                    JOptionPane.showMessageDialog(rootPane, "Không có nhân khẩu có CMT: " + chungMinhThu, "Information", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Tìm thấy. Hiện trên bảng kìa.", "Information", JOptionPane.INFORMATION_MESSAGE);
                }
                return;
            }

        }
    }//GEN-LAST:event_jButtonSearchActionPerformed

    private void jButtonXemChiTietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonXemChiTietActionPerformed
//        if (jTFSearchByCMT.getText().isEmpty()){
//            JOptionPane.showMessageDialog(rootPane, "Chọn nhân khẩu muốn xem chi tiết", "Warning", JOptionPane.WARNING_MESSAGE);
//        } else {
//            String chungMinhThu = jTFSearchByCMT.getText().trim();
//            InfoNhanKhau infoNhanKhau = new InfoNhanKhau(chungMinhThu);
//            infoNhanKhau.setLocationRelativeTo(null);
//            infoNhanKhau.setResizable(false);
//            infoNhanKhau.setVisible(true);
//        }
    }//GEN-LAST:event_jButtonXemChiTietActionPerformed

    private boolean checkDesignCMT() {
        // check dinh dang so chung minh thu
        try {
            long d = Long.parseLong(jTFSearchByCMT.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Số CMT không thể chứa các ký tự chữ cái", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        // kiem tra do dai cmt
        if (jTFSearchByCMT.getText().length() != 9 && jTFSearchByCMT.getText().length() != 12) {
            JOptionPane.showMessageDialog(rootPane, "Số CMT có 9 hoặc 12 số", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
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
            java.util.logging.Logger.getLogger(DichTeManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DichTeManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DichTeManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DichTeManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DichTeManage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButtonAddDichTe;
    private javax.swing.JButton jButtonDeleteDichTe;
    private javax.swing.JButton jButtonEditDichTe;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JButton jButtonShowInfoDichTe;
    private javax.swing.JButton jButtonXemChiTiet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFSearchByCMT;
    private javax.swing.JTable jTableKhaiDichTe;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
