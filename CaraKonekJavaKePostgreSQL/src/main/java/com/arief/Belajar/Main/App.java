package com.arief.Belajar.Main;

import com.arief.Belajar.Handling.CRUD;
import com.arief.Belajar.Setting.Koneksi;

/**
 * Created by Arief on 7/20/2017.
 */
public class App {
    public static void main(String []args){


        for(String v : new CRUD(Koneksi.panggilKoneksi()).getAll()){
            System.out.println(v);
        }

    }
}
