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
public class Pengirim {
 
    private String nama;
    private String alamat;
    private String kota;
    private String kodepos;
    private String telfon;
    private int beratBarang;

    public Pengirim() {
    }

    public Pengirim(String nama, String alamat, String kota, String kodepos, String telfon) {
        this.nama = nama;
        this.alamat = alamat;
        this.kota = kota;
        this.kodepos = kodepos;
        this.telfon = telfon;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
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
     * @return the kodepos
     */
    public String getKodepos() {
        return kodepos;
    }

    /**
     * @param kodepos the kodepos to set
     */
    public void setKodepos(String kodepos) {
        this.kodepos = kodepos;
    }

    /**
     * @return the telfon
     */
    public String getTelfon() {
        return telfon;
    }

    /**
     * @param telfon the telfon to set
     */
    public void setTelfon(String telfon) {
        this.telfon = telfon;
    }

    /**
     * @return the beratBarang
     */
    public int getBeratBarang() {
        return beratBarang;
    }

    /**
     * @param beratBarang the beratBarang to set
     */
    public void setBeratBarang(int beratBarang) {
        this.beratBarang = beratBarang;
    }
}
