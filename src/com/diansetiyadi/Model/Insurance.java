/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diansetiyadi.Model;

/**
 *
 * @author user
 */
public class Insurance {

    private final double insurancepercent = 0.1;
    private String insuranceCetak;
    private DataPengirimanPaket dpk;

    public Insurance() {
    }


    public double calculateInsuranceBarang() {

        double insurancebarang = dpk.getHargaBarang() * getInsurancepercent();
        return insurancebarang;
    }

    /**
     * @return the insurancepercent
     */
    public double getInsurancepercent() {
        return insurancepercent;
    }
    
    

    /**
     * @param insurancepercent the insurancepercent to set
     */
    

    /**
     * @return the insuranceCetak
     */
    public String getInsuranceCetak() {
        return insuranceCetak;
    }

    /**
     * @param insuranceCetak the insuranceCetak to set
     */
    public void setInsuranceCetak(String insuranceCetak) {
        this.insuranceCetak = insuranceCetak;
    }

    /**
     * @return the dpk
     */
    public DataPengirimanPaket getDpk() {
        return dpk;
    }

    /**
     * @param dpk the dpk to set
     */
    public void setDpk(DataPengirimanPaket dpk) {
        this.dpk = dpk;
    }

}
