package com.example.tfg_frutosgibaja;
import java.sql.*;
import java.util.ArrayList;

public class BBDD {
    private Connection cnx;
    private String url = "jdbc:mysql://192.168.0.100:3004/ciudadescolar";
    private String user = "root";
    private String passwd= "admin";
    public BBDD() throws SQLException{
        cnx = DriverManager.getConnection(url, user, passwd);
    }

    public void close() throws SQLException {
        this.cnx.close();
    }
    public ArrayList<Juego> getArrayJuegos() throws SQLException{
        ArrayList<Juego> array = new ArrayList<Juego>();
        Statement st = this.cnx.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM juegos");
        if(rs.next()) {
            do{
                array.add(new Juego(rs.getInt(1), rs.getString(2),rs.getDate(3),rs.getInt(4)));
            }while(rs.next());
        } else {
            System.out.println("No se ha recuperado nig�n juego.");
        }
        rs.close();
        st.close();

        return array;
    }
}
