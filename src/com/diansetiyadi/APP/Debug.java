/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diansetiyadi.APP;

import com.diansetiyadi.DAO.TarifFileDAO;

import com.diansetiyadi.Model.DataPengirimanPaket;
import com.diansetiyadi.Model.Insurance;
import com.diansetiyadi.Model.Pengirim;
import com.diansetiyadi.Model.Tarif;
import java.lang.reflect.Array;
import java.text.ParseException;
import java.util.List;

/**
 *
 * @author user
 */
public class Debug {

    /**
     * @param args the command line arguments
     */
    Tarif tarif;
    Pengirim pengirim;
    List<Tarif> kumpulan;
    Insurance insurance;

    public static void main(String[] args) throws ParseException {
        Tarif tarif = new Tarif();
        Pengirim pengirim = new Pengirim();
        Insurance insurance = new Insurance();
        DataPengirimanPaket dpk = new DataPengirimanPaket();
        TarifFileDAO tfd = new TarifFileDAO();
        
        tfd.findTarif();
        tarif.setPengirim(pengirim);
        insurance.setDpk(dpk);
        tarif.setInsurance(insurance);
        
        
        
        
        dpk.setHargaBarang(10000.0);

        insurance.calculateInsuranceBarang();
        tarif.setKota("bandung");
        tarif.getPengirim().setBeratBarang(3);
    
        tarif.hargaPaketReguler();
        tarif.calculatedOnkgirBarang();
        System.out.println("Tujuyan : "+tarif.getKota());
        System.out.println("Pelayanan : "+tarif.getPilihLayanan());
        System.out.println("Tarif Pelayanan : "+tarif.getTarifSementara());
        System.out.println("Tarif Ongkir : "+tarif.calculatedOnkgirBarang());
        System.out.println("Tarif Asuransi Barang : " +insurance.calculateInsuranceBarang());
        System.out.println("Tarif Total : "+tarif.calculateTotalOngkirAfterInsurance());
    }

}
