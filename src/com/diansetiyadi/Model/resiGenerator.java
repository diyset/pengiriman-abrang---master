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
public final class resiGenerator {
    
      public static String generateResiNumber(){
        String noResi = "CGK";
        
        int code = (int) (Math.ceil(Math.random() * 1000000000) * 1);
        noResi += code;
        return noResi;
    }
    
}
