/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diansetiyadi.Model;

import com.diansetiyadi.DAO.TarifFileDAO;

/**
 *
 * @author user
 */
public class Tarif {

    TarifFileDAO tfd = new TarifFileDAO();
    private String kota;
    private String tarifReguler;
    private String tarifKilat;
    private String tarifSDS;
    private String tarifONS;
    private String tarifHDS;
    private double tarifSementara;
    private String pilihLayanan;
    private Pengirim pengirim;
    private Insurance insurance;
    private boolean asuransi;
    private double totalHargaAfterInsurance;
    private double ongkirBarang;

//    Tarif tarifPaket = TarifFileDAO.findTarif(this.getKota());
    public Tarif() {
    }

    public Tarif(String kota, String tarifReguler, String tarifKilat,
            String tarifSDS, String tarifONS, String tarifHDS) {
        this.kota = kota;
        this.tarifReguler = tarifReguler;
        this.tarifKilat = tarifKilat;
        this.tarifSDS = tarifSDS;
        this.tarifONS = tarifONS;
        this.tarifHDS = tarifHDS;

    }

    /**
     * @return the kota
     */
    public String getKota() {
        return kota;
    }

    /**
     * @param kota the kota to set
     */
    public void setKota(String kota) {
        this.kota = kota;
    }

    /**
     * @return the tarifReguler
     */
    public String getTarifReguler() {
        return tarifReguler;
    }

    /**
     * @param tarifReguler the tarifReguler to set
     */
    public void setTarifReguler(String tarifReguler) {
        this.tarifReguler = tarifReguler;
    }

    /**
     * @return the tarifKilat
     */
    public String getTarifKilat() {
        return tarifKilat;
    }

    /**
     * @param tarifKilat the tarifKilat to set
     */
    public void setTarifKilat(String tarifKilat) {
        this.tarifKilat = tarifKilat;
    }

    /**
     * @return the tarifSDS
     */
    public String getTarifSDS() {
        return tarifSDS;
    }

    /**
     * @param tarifSDS the tarifSDS to set
     */
    public void setTarifSDS(String tarifSDS) {
        this.tarifSDS = tarifSDS;
    }

    /**
     * @return the tarifONS
     */
    public String getTarifONS() {
        return tarifONS;
    }

    /**
     * @param tarifONS the tarifONS to set
     */
    public void setTarifONS(String tarifONS) {
        this.tarifONS = tarifONS;
    }

    /**
     * @return the tarifHDS
     */
    public String getTarifHDS() {
        return tarifHDS;
    }

    /**
     * @param tarifHDS the tarifHDS to set
     */
    public void setTarifHDS(String tarifHDS) {
        this.tarifHDS = tarifHDS;
    }

    public double calculatedOnkgirBarang() {
        double ongkir = this.getTarifSementara() * pengirim.getBeratBarang();
        return ongkir;
    }

    public double calculateTotalOngkirAfterInsurance() {
        double ongkir = calculatedOnkgirBarang() + getInsurance().calculateInsuranceBarang();
        return ongkir;
    }

    public void hargaPaketReguler() {
        tfd.findTarif();

        for (Tarif tarif : tfd.getListTarif()) {
            if (this.getKota().equalsIgnoreCase(tarif.getKota())) {
                setTarifSementara(Double.parseDouble(tarif.getTarifReguler()));
                //setPilihLayanan("Reguler");
            }
        }
    }

    public void hargaPaketKilat() {
        tfd.findTarif();

        for (Tarif tarif : tfd.getListTarif()) {
            if (this.getKota().equalsIgnoreCase(tarif.getKota())) {
                setTarifSementara(Double.parseDouble(tarif.getTarifKilat()));
                //setPilihLayanan("Kilat");
            }
        }
    }

    public void hargaPaketSDS() {
        tfd.findTarif();

        for (Tarif tarif : tfd.getListTarif()) {
            if (this.getKota().equalsIgnoreCase(tarif.getKota())) {
                setTarifSementara(Double.parseDouble(tarif.getTarifSDS()));
               // setPilihLayanan("SDS");
            }
        }
    }

    public void hargaPaketONS() {
        tfd.findTarif();

        for (Tarif tarif : tfd.getListTarif()) {
            if (this.getKota().equalsIgnoreCase(tarif.getKota())) {
                setTarifSementara(Double.parseDouble(tarif.getTarifONS()));
              //  setPilihLayanan("ONS");
            }
        }
    }

    public void hargaPaketHDS() {
        tfd.findTarif();

        for (Tarif tarif : tfd.getListTarif()) {
            if (this.getKota().equalsIgnoreCase(tarif.getKota())) {
                setTarifSementara(Double.parseDouble(tarif.getTarifHDS()));
              //  setPilihLayanan("HDS");
            }
        }
    }

    /**
     * @return the tarifSementara
     */
    public double getTarifSementara() {
        return tarifSementara;
    }

    /**
     * @param tarifSementara the tarifSementara to set
     */
    public void setTarifSementara(double tarifSementara) {
        this.tarifSementara = tarifSementara;
    }

    /**
     * @return the pilihLayanan
     */
    public String getPilihLayanan() {
        return pilihLayanan;
    }

    /**
     * @param pilihLayanan the pilihLayanan to set
     */
    public void setPilihLayanan(String pilihLayanan) {
        this.pilihLayanan = pilihLayanan;
    }

    /**
     * @return the pengirim
     */
    public Pengirim getPengirim() {
        return pengirim;
    }

    /**
     * @param pengirim the pengirim to set
     */
    public void setPengirim(Pengirim pengirim) {
        this.pengirim = pengirim;
    }

    /**
     * @return the insurance
     */
    public Insurance getInsurance() {
        return insurance;
    }

    /**
     * @param insurance the insurance to set
     */
    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    /**
     * @return the asuransi
     */
    public boolean isAsuransi() {
        return asuransi;
    }

    /**
     * @param asuransi the asuransi to set
     */
    public void setAsuransi(boolean asuransi) {
        this.asuransi = asuransi;
    }

    /**
     * @return the totalHargaAfterInsurance
     */
    public double getTotalHargaAfterInsurance() {
        return totalHargaAfterInsurance;
    }

    /**
     * @param totalHargaAfterInsurance the totalHargaAfterInsurance to set
     */
    public void setTotalHargaAfterInsurance() {
        if (this.asuransi == true) {
            this.totalHargaAfterInsurance = this.calculatedOnkgirBarang() + getInsurance().calculateInsuranceBarang();
        } else if (this.asuransi == false) {
            this.totalHargaAfterInsurance = this.calculatedOnkgirBarang();
        }
    }

    /**
     * @return the ongkirBarang
     */
    public double getOngkirBarang() {
        return ongkirBarang;
    }

    /**
     * @param ongkirBarang the ongkirBarang to set
     */
    public void setOngkirBarang() {
        this.ongkirBarang = this.getTarifSementara() * pengirim.getBeratBarang();
    }

}
