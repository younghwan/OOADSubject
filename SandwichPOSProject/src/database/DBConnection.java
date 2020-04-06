package database;

import java.sql.*;

public class DBConnection {

    private Connection con;
    private Statement st;
    private ResultSet rs;

    public DBConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
            st = con.createStatement();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isAdmin(String adminID, String adminPassword){
        try{
            String SQL = "SELECT * FROM ADMIN WHERE adminID = '" + adminID +"' and adminPassword = '"+ adminPassword + "'";
            rs = st.executeQuery(SQL);
            if(rs.next())
            {
                return true;
            }
        }catch (Exception e){
            System.out.println("DB오류 : "+e.getMessage());
            e.printStackTrace();
        }
        return false;
    }

}
