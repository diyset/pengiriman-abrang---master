/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diansetiyadi.DAO;

import com.diansetiyadi.Model.Tarif;
import com.diansetiyadi.Model.provinsiKota;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class TarifFileDAO {

    private ArrayList<Tarif> listTarif = new ArrayList<>();

    public TarifFileDAO() {
    }

    public void findTarif() {
        //  Tarif tarif = new Tarif();
        try {
            Scanner scan;

            // scan = new Scanner(new File("E:/tarifData.txt"));
            scan = new Scanner(new File(TarifFileDAO.class.getResource("/com/diansetiyadi/asset/tarifData.txt").getFile()));
            while (scan.hasNextLine()) {
                String barisFile = scan.nextLine();
                String[] dataTarif = barisFile.split(",");
                String kota = (dataTarif[0]);

                String tarifReguler = (dataTarif[1]);
                String tarifKilat = (dataTarif[2]);
                String tarifSDS = (dataTarif[3]);
                String tarifONS = (dataTarif[4]);
                String tarifHDS = (dataTarif[5]);
                Tarif tarif = new Tarif(kota, tarifReguler, tarifKilat,
                        tarifSDS, tarifONS, tarifHDS);
                getListTarif().add(tarif);
            }

        } catch (FileNotFoundException e) {

        }

    }

    /**
     * @return the listTarif
     */
    public ArrayList<Tarif> getListTarif() {
        return listTarif;
    }

    /**
     * @param listTarif the listTarif to set
     */
    public void setListTarif(ArrayList<Tarif> listTarif) {
        this.listTarif = listTarif;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    

}
