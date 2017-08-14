package com.arief.Belajar.Handling;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Created by Arief on 7/20/2017.
 */
public class CRUD {
    private Connection con;

    public CRUD(){}


    public CRUD(Connection con){
        this.con=con;
    }

    public ArrayList<String> getAll(){
        ArrayList<String> nama= null;
        try{
            nama = new ArrayList<String>();
            Statement st = con.createStatement();
            String query = "select * from test_tabel";
            ResultSet rs = st.executeQuery(query);
            System.out.println("Fetching data from table....");

            while(rs.next()){
                String name = rs.getString("nama");
                nama.add(name);
            }

        }catch (SQLException ex){
            System.err.println(ex.toString());
        }
        return nama;
    }

}
