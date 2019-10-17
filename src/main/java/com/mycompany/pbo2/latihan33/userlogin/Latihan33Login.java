/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pbo2.latihan33.userlogin;
import java.util.Scanner;
/**
 *
 * @author Tendy
 * Nama     : Tendy Hermansyah
 * Kelas    : PBO2
 * Nim      : 10118083
 * Deskripsi Tugas : User Login
 */
public class Latihan33Login {
    private static String usName;
    private static String passWord;
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        User user = new User();
        
        System.out.print("Masukan Username = ");
        usName = scanner.next();
        System.out.print("Masukan Password = ");
        passWord = scanner.next();
        user.pengecekkanLogin(usName, passWord);
        
    }
}
