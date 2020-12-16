/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covid19_management_system.controllers.nhankhauController;

import covid19_management_system.MY_CONNECTION;
import covid19_management_system.views.NhanKhauManage;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HieuPhung
 */
public class ShowTableNhanKhauController {
    MY_CONNECTION my_connection = new MY_CONNECTION();
    
    public void showNhanKhau(JTable table) { 
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        String query = "SELECT `ID`, `hoTen`, `ngaySinh`, `gioiTinh`, `diaChi`, `soDienThoai` FROM `nhan_khau` WHERE 1";
        try {
            preparedStatement = my_connection.createConnection().prepareStatement(query);        
            resultSet = preparedStatement.executeQuery();
            
            DefaultTableModel tableModel = (DefaultTableModel)table.getModel();
            for( int i = tableModel.getRowCount() - 1; i >= 0; i-- ) {
                tableModel.removeRow(i);
            }
            Object[] row;
           
            while(resultSet.next()){
                row = new Object[6];
                row[0] = resultSet.getInt(1);
                row[1] = resultSet.getString(2);
                
                // ngaySinh
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                row[2] = dateFormat.format(resultSet.getDate(3));
                
                // gioiTinh
                int gioiTinh = resultSet.getInt(4);
                switch (gioiTinh) {
                    case 0:
                        row[3] = "";
                        break;
                    case 1:
                        row[3] = "Nam";
                        break;
                    case 2:
                        row[3] = "Nữ";
                        break;
                    case 3:
                        row[3] = "Khác";
                        break;
                    default:
                        break;
                }
                row[4] = resultSet.getString(5);
                row[5] = resultSet.getString(6);
                
                tableModel.addRow(row);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ShowTableNhanKhauController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void showNhanKhauWithCMT(JTable table, String chungMinhThu) { 
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        String query = "SELECT `ID`, `hoTen`, `ngaySinh`, `gioiTinh`, `diaChi`, `soDienThoai` FROM `nhan_khau` WHERE `chungMinhThu`=?";
        try {
            preparedStatement = my_connection.createConnection().prepareStatement(query);
            preparedStatement.setString(1, chungMinhThu);
            resultSet = preparedStatement.executeQuery();
            
            DefaultTableModel tableModel = (DefaultTableModel)table.getModel();
            for( int i = tableModel.getRowCount() - 1; i >= 0; i-- ) {
                tableModel.removeRow(i);
            }
            Object[] row;
            
            while(resultSet.next()){
                row = new Object[6];
                row[0] = resultSet.getInt(1);
                row[1] = resultSet.getString(2);
                
                // ngaySinh
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                row[2] = dateFormat.format(resultSet.getDate(3));
                
                // gioiTinh
                int gioiTinh = resultSet.getInt(4);
                switch (gioiTinh) {
                    case 0:
                        row[3] = "";
                        break;
                    case 1:
                        row[3] = "Nam";
                        break;
                    case 2:
                        row[3] = "Nữ";
                        break;
                    case 3:
                        row[3] = "Khác";
                        break;
                    default:
                        break;
                }
                row[4] = resultSet.getString(5);
                row[5] = resultSet.getString(6);
                
                tableModel.addRow(row);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ShowTableNhanKhauController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String searchCMTByID(int ID) {
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        String query = "SELECT `chungMinhThu` FROM `nhan_khau` WHERE `ID`=?";
        try {
            preparedStatement = my_connection.createConnection().prepareStatement(query);

            preparedStatement.setInt(1, ID);
            resultSet = preparedStatement.executeQuery();
            if(resultSet.next()) {
                return resultSet.getString(1);
            } else {
                return null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ShowTableNhanKhauController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }  
    }
    
}
