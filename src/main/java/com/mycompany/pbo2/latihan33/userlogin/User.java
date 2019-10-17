/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pbo2.latihan33.userlogin;

/**
 *
 * @author Tendy
 * Nama     : Tendy Hermansyah
 * Kelas    : PBO2
 * Nim      : 10118083
 * Deskripsi Tugas : User Login
 */
public class User {
    private final String username = "RizkiAdam";
    private final String password = "terbaikselalu";
    private boolean statusAkun;
    
    private boolean cekAkun(String parUserName, String parPassword){
        return (username.equals(parUserName) && parPassword.equals(password));
    }
    private void hasilLogin(boolean status, String parUserName){
        
        System.out.println("");
        
        if (status) {
            System.out.println("****** HALLO " + parUserName + " ******");
            System.out.println("Selamat Datang di Aplikasi ini");
        } else
            System.out.println("Ooops, Username atau Password yang anda masukan salah");
    }
    public void pengecekkanLogin(String parUserName, String parPassword){
        statusAkun = cekAkun(parUserName, parPassword);
        hasilLogin(statusAkun, parUserName);
    }
}
