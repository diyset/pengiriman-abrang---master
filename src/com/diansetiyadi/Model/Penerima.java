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
public class Penerima {
   private String nama;
   private String alamat;
   private int kodepos;
   private String telepone;

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
     * @return the kodepos
     */
    public int getKodepos() {
        return kodepos;
    }

    /**
     * @param kodepos the kodepos to set
     */
    public void setKodepos(int kodepos) {
        this.kodepos = kodepos;
    }

    /**
     * @return the telepone
     */
    public String getTelepone() {
        return telepone;
    }

    /**
     * @param telepone the telepone to set
     */
    public void setTelepone(String telepone) {
        this.telepone = telepone;
    }
}
