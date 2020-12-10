/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covid19_management_system.forms.input;

import covid19_management_system.MY_CONNECTION;
import covid19_management_system.entity.Person;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HieuPhung
 */
public class PersonForm extends javax.swing.JFrame {

    /**
     * Creates new form PersonForm
     */
    Person person = new Person();
    MY_CONNECTION my_connection = new MY_CONNECTION();
    ButtonGroup bg = new ButtonGroup();
    
    public PersonForm() {
        initComponents();
        this.setTitle("Khai thông tin cá nhân");
        
        // create a button group for the radioButtons
        
        bg.add(jRadioButtonPersonBHYT_YES);
        bg.add(jRadioButtonPersonBHYT_NO);
    }
    
    public void clearFiles() {
        
        // remove text from all jtextfields
        jTextPersonID.setText(null);
        jTextPersonName.setText(null);
        jDateChooserPersonBirthday.setDate(new Date());
        jComboBoxPersonGender.setSelectedIndex(0);
        bg.clearSelection();
        jTextFieldPersonMSYT.setText(null);
        jTextFieldPersonCMT.setText(null);
        jTextFieldPersonHOKHAU.setText(null);
        jTextFieldPersonPhone.setText(null);
        jTextFieldPersonGmail.setText(null);
        jTextAreaPersonAddress.setText(null);
        
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldPersonCMT = new javax.swing.JTextField();
        jTextFieldPersonHOKHAU = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldPersonPhone = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldPersonGmail = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jRadioButtonPersonBHYT_YES = new javax.swing.JRadioButton();
        jRadioButtonPersonBHYT_NO = new javax.swing.JRadioButton();
        jComboBoxPersonGender = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaPersonAddress = new javax.swing.JTextArea();
        jButtonEDIT = new javax.swing.JButton();
        jButtonADD = new javax.swing.JButton();
        jButtonREMOVE = new javax.swing.JButton();
        jButtonCLEAR = new javax.swing.JButton();
        jTextPersonID = new javax.swing.JTextField();
        jTextPersonName = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jDateChooserPersonBirthday = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextFieldPersonMSYT = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jButtonSEARCH = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 0, 204));

        jPanel2.setBackground(new java.awt.Color(204, 0, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("KHAI BÁO THÔNG TIN CÁ NHÂN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(317, 317, 317)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Họ và tên: ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CMT/CCCD: ");

        jTextFieldPersonCMT.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        jTextFieldPersonHOKHAU.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Mã hộ khẩu: ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Số điện thoại: ");

        jTextFieldPersonPhone.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Gmail: ");

        jTextFieldPersonGmail.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        jPanel4.setBackground(new java.awt.Color(51, 0, 204));

        jRadioButtonPersonBHYT_YES.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jRadioButtonPersonBHYT_YES.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonPersonBHYT_YES.setText("Có");

        jRadioButtonPersonBHYT_NO.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jRadioButtonPersonBHYT_NO.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonPersonBHYT_NO.setText("Không");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jRadioButtonPersonBHYT_YES)
                .addGap(18, 18, 18)
                .addComponent(jRadioButtonPersonBHYT_NO))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jRadioButtonPersonBHYT_YES)
                .addComponent(jRadioButtonPersonBHYT_NO))
        );

        jComboBoxPersonGender.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jComboBoxPersonGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Chọn giới tính -", "Nam", "Nữ", "Khác" }));
        jComboBoxPersonGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPersonGenderActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Địa chỉ: ");

        jTextAreaPersonAddress.setColumns(20);
        jTextAreaPersonAddress.setFont(new java.awt.Font("Monospaced", 0, 20)); // NOI18N
        jTextAreaPersonAddress.setRows(5);
        jScrollPane1.setViewportView(jTextAreaPersonAddress);

        jButtonEDIT.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jButtonEDIT.setText("Sửa");
        jButtonEDIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEDITActionPerformed(evt);
            }
        });

        jButtonADD.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jButtonADD.setText("Thêm mới");
        jButtonADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonADDActionPerformed(evt);
            }
        });

        jButtonREMOVE.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jButtonREMOVE.setText("Xóa");
        jButtonREMOVE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonREMOVEActionPerformed(evt);
            }
        });

        jButtonCLEAR.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jButtonCLEAR.setText("Làm mới");
        jButtonCLEAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCLEARActionPerformed(evt);
            }
        });

        jTextPersonID.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        jTextPersonName.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Ngày sinh: ");

        jDateChooserPersonBirthday.setDateFormatString("dd/MM/yyyy");
        jDateChooserPersonBirthday.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Giới tính: ");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Thẻ BHYT: ");

        jTextFieldPersonMSYT.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Mã số thẻ: ");

        jButtonSEARCH.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jButtonSEARCH.setText("Tìm kiếm");
        jButtonSEARCH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSEARCHActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 75, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(105, 105, 105)
                        .addComponent(jTextPersonID, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(jDateChooserPersonBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jTextPersonName, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel14))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(jComboBoxPersonGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(12, 12, 12)
                                .addComponent(jTextFieldPersonMSYT, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(185, 185, 185)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldPersonCMT, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldPersonHOKHAU, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldPersonPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldPersonGmail))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jButtonSEARCH, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonADD, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(jButtonEDIT, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(jButtonREMOVE, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(206, 206, 206))
                            .addComponent(jButtonCLEAR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(114, 114, 114))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextPersonID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldPersonCMT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(32, 32, 32)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextPersonName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                        .addGap(32, 32, 32))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldPersonHOKHAU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(34, 34, 34)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(jDateChooserPersonBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(jComboBoxPersonGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldPersonPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldPersonGmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(34, 34, 34)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldPersonMSYT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(162, 162, 162)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEDIT, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonADD, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonREMOVE, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCLEAR, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSEARCH, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(93, 93, 93))
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

    private void jComboBoxPersonGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPersonGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxPersonGenderActionPerformed

    private void jButtonADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonADDActionPerformed
        
        try {
            
            String name = jTextPersonName.getText();
            // date
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // theo chuan cua db dang sd
            String birthday = dateFormat.format(jDateChooserPersonBirthday.getDate());
            // combobox
            String gender = (String) jComboBoxPersonGender.getSelectedItem();
            // radio
            String bhyt = null;
            if(jRadioButtonPersonBHYT_YES.isSelected()){
                bhyt = "Có";
            }
            if(jRadioButtonPersonBHYT_NO.isSelected()){
                bhyt = "Không";
            }
            
            String bhyt_num = jTextFieldPersonMSYT.getText();
            String cmt = jTextFieldPersonCMT.getText();
            String ho_khau = jTextFieldPersonHOKHAU.getText();
            String phone = jTextFieldPersonPhone.getText();
            String email = jTextFieldPersonGmail.getText();
            String address = jTextAreaPersonAddress.getText();

            if (person.addPerson(name, birthday, gender, bhyt, bhyt_num, cmt, ho_khau, phone, email, address)) {
                JOptionPane.showMessageDialog(rootPane, "New person added successfully !", "Add Person", JOptionPane.INFORMATION_MESSAGE);
                this.clearFiles();
                
            } else {
                JOptionPane.showMessageDialog(rootPane, "Person not added !", "Add Person Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage() + " - Enter the person fields number !", "Person Fields Type Number Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jButtonADDActionPerformed

    private void jButtonSEARCHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSEARCHActionPerformed
       
        String cmt = null;
        cmt = jTextFieldPersonCMT.getText().trim();
        
        if (cmt.trim().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Enter your CMT/CCCD to search !", "Empty CMT/CCCD", 2);
        } else {
            
            // search the person with person's CMT
            if(person.searchPerson(cmt) == false){
                JOptionPane.showMessageDialog(rootPane, "Person not found !", "Search Person", JOptionPane.INFORMATION_MESSAGE);
            } else {
                int id = 0;
                String name = null;
                String birthday = null;
                String gender = null;
                String bhyt = null;
                String bhyt_num = null;
                String ho_khau = null;
                String phone = null;
                String email = null;
                String address = null;
                
                // connect to database to get data with cmt/cccd
                PreparedStatement ps;
                ResultSet rs;
                String searchQuery = "SELECT `id`,`name`,`birthday`,`gender`,`bhyt`,`bhyt_num`,`ho_khau`,`phone`,`email`,`address` FROM `people` WHERE `cmt`=?";
                try {
                    ps = my_connection.createConnection().prepareStatement(searchQuery);
                    ps.setString(1, cmt);

                    rs = ps.executeQuery();

                    while(rs.next()){
                        id = rs.getInt(1);
                        name = rs.getString(2);
                        birthday = rs.getString(3);
                        gender = rs.getString(4);
                        bhyt = rs.getString(5);
                        bhyt_num = rs.getString(6);
                        ho_khau = rs.getString(7);
                        phone = rs.getString(8);
                        email = rs.getString(9);
                        address = rs.getString(10);
                        
                    }

                } catch (SQLException ex) {
                    Logger.getLogger(PersonForm.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
                // đổ dữ liệu ra các trường của form:
                
                jTextPersonID.setText(Integer.toString(id).trim());
                jTextPersonName.setText(name);
                
                // 1. set the date
                try {
                    Date dateIn = (Date) new SimpleDateFormat("yyyy-MM-dd").parse(birthday);
                    jDateChooserPersonBirthday.setDate(dateIn);
                } catch (ParseException ex) {
                    Logger.getLogger(PersonForm.class.getName()).log(Level.SEVERE, null, ex);
                }

                // 2. set the combobox
                jComboBoxPersonGender.setSelectedItem(gender);
                
                // 3. set the radio
                if (bhyt.equals("Có")){
                    jRadioButtonPersonBHYT_YES.setSelected(true);
                } else if (bhyt.equals("Không")) {
                    jRadioButtonPersonBHYT_NO.setSelected(true);
                }
                
                
                jTextFieldPersonMSYT.setText(bhyt_num);
                jTextFieldPersonHOKHAU.setText(ho_khau);
                jTextFieldPersonPhone.setText(phone);
                jTextFieldPersonGmail.setText(email);
                jTextAreaPersonAddress.setText(address);
                
            }
        }
    }//GEN-LAST:event_jButtonSEARCHActionPerformed

    private void jButtonCLEARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCLEARActionPerformed
        
        this.clearFiles();
        
    }//GEN-LAST:event_jButtonCLEARActionPerformed

    private void jButtonEDITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEDITActionPerformed

        int idPerson = 0;
        try {
            idPerson = Integer.valueOf(jTextPersonID.getText());
            
            String name = jTextPersonName.getText();
            // date
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // theo chuan cua db dang sd
            String birthday = dateFormat.format(jDateChooserPersonBirthday.getDate());
            // combobox
            String gender = (String) jComboBoxPersonGender.getSelectedItem();
            // radio
            String bhyt = null;
            if(jRadioButtonPersonBHYT_YES.isSelected()){
                bhyt = "Có";
            }
            if(jRadioButtonPersonBHYT_NO.isSelected()){
                bhyt = "Không";
            }
            
            String bhyt_num = jTextFieldPersonMSYT.getText();
            String cmt = jTextFieldPersonCMT.getText();
            String ho_khau = jTextFieldPersonHOKHAU.getText();
            String phone = jTextFieldPersonPhone.getText();
            String email = jTextFieldPersonGmail.getText();
            String address = jTextAreaPersonAddress.getText();

            if (person.editPerson(idPerson, name, birthday, gender, bhyt, bhyt_num, cmt, ho_khau, phone, email, address)) {
                JOptionPane.showMessageDialog(rootPane, "Person updated successfully !", "Update Person", JOptionPane.INFORMATION_MESSAGE);
                this.clearFiles();
                
            } else {
                JOptionPane.showMessageDialog(rootPane, "Person not updated !", "Update Person Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage() + " - Enter the person fields number !", "Person Fields Type Number Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jButtonEDITActionPerformed

    private void jButtonREMOVEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonREMOVEActionPerformed
        
        // deleted the selected client
        try {
            int idPerson = Integer.valueOf(jTextPersonID.getText());

            // trong check if duoi, da co edit database !!!
            if (person.removePerson(idPerson)) {
                JOptionPane.showMessageDialog(rootPane, "Person deleted successfully !", "Remove Person", JOptionPane.INFORMATION_MESSAGE);
                this.clearFiles();
                
            } else {
                JOptionPane.showMessageDialog(rootPane, "Person not deleted !", "Remove Person Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage() + " - Enter the person's id (Number) !", "Person Id Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jButtonREMOVEActionPerformed

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
            java.util.logging.Logger.getLogger(PersonForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersonForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonADD;
    private javax.swing.JButton jButtonCLEAR;
    private javax.swing.JButton jButtonEDIT;
    private javax.swing.JButton jButtonREMOVE;
    private javax.swing.JButton jButtonSEARCH;
    private javax.swing.JComboBox<String> jComboBoxPersonGender;
    private com.toedter.calendar.JDateChooser jDateChooserPersonBirthday;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButtonPersonBHYT_NO;
    private javax.swing.JRadioButton jRadioButtonPersonBHYT_YES;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaPersonAddress;
    private javax.swing.JTextField jTextFieldPersonCMT;
    private javax.swing.JTextField jTextFieldPersonGmail;
    private javax.swing.JTextField jTextFieldPersonHOKHAU;
    private javax.swing.JTextField jTextFieldPersonMSYT;
    private javax.swing.JTextField jTextFieldPersonPhone;
    private javax.swing.JTextField jTextPersonID;
    private javax.swing.JTextField jTextPersonName;
    // End of variables declaration//GEN-END:variables
}
