/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covid19_management_system.entity;

import covid19_management_system.MY_CONNECTION;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HieuPhung
 */
public class CachLy {
    
    MY_CONNECTION my_connection = new MY_CONNECTION();
    
    /* 1 - Các phương thức ADD đối tượng cho các bảng*/
    public boolean addCachLy(int idPerson, String ngayKhaiCL, int type, int level, String dateStart, String addressCL, int roomN, int bedN, String nameRoommate) {

        PreparedStatement ps;
        String addQuery = "INSERT INTO `cach_ly`(`id_person`, `ngay_khai_cl`, `type`, `level`, `cl_date_start`, `cl_address`, `room_num`, `bed_num`, `roommate_name`) VALUES (?,?,?,?,?,?,?,?,?)";
        
        try {
            // add client on mysql database
            ps = my_connection.createConnection().prepareStatement(addQuery);
            
            // theo thu tu dau ?
            ps.setInt(1, idPerson);
            ps.setString(2, ngayKhaiCL);
            ps.setInt(3, type);
            ps.setInt(4, level);
            ps.setString(5, dateStart);
            ps.setString(6, addressCL);
            ps.setInt(7, roomN);
            ps.setInt(8, bedN);
            ps.setString(9, nameRoommate);
            
            return (ps.executeUpdate() > 0);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(CachLy.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    
}
