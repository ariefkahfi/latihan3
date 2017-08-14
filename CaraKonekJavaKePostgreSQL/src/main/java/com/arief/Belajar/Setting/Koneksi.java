package com.arief.Belajar.Setting;

/**
 * Created by Arief on 7/20/2017.
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Koneksi {

    public static Connection panggilKoneksi(){
        Connection con = null;
        try{

            Class.forName("org.postgresql.Driver");
            String host = "jdbc:postgresql://localhost:5432/konekjava";
            con = DriverManager.getConnection(host,"postgres","qwerty");
            System.out.println("Kelas Driver ditemukan & Koneksi ke database berhasil \n");

        } catch (SQLException ex){
            System.err.println(ex.toString());
        }catch (ClassNotFoundException ex){
            System.err.println(ex.toString());
        }
        return con;
    }
}
