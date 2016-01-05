/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author ujjwal
 */
import java.sql.*;
import java.util.ArrayList;

public class SqlUtil {

    public static final String sqluser = "root";
    public static final String sqlpwd = "";
    public static final String driver = "com.mysql.jdbc.Driver";
    public static final String url = "jdbc:mysql://localhost/edc";
    public static Connection con;

    static {
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, sqluser, sqlpwd);

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        return con;
    }
 
 public static ResultSet getData(String query) throws SQLException, ClassNotFoundException {
        //Connection con = getConnection();
        Statement ps = con.createStatement();
        ResultSet rs = ps.executeQuery(query);
        return rs;
    }
    public static ResultSet getData(String query, ArrayList al) throws SQLException, ClassNotFoundException {
        //Connection con = getConnection();
        PreparedStatement ps = con.prepareStatement(query);
        if ((al != null) && (al.size() > 0)) {
            for (int index = 0; index < al.size(); index++) {
                ps.setObject(index + 1, al.get(index));
            }
        }
        ResultSet rs = ps.executeQuery();
        return rs;
    }

    public static int ins_upd_del(String query, ArrayList al) throws ClassNotFoundException, SQLException {
      //  Connection con = getConnection();
        PreparedStatement ps = con.prepareStatement(query);
        if (al != null && al.size() > 0) {
            for (int index = 0; index < al.size(); index++) {
                ps.setObject(index + 1, al.get(index));
            }
        }
        int rowAff = ps.executeUpdate();
        return rowAff;
    }
}
