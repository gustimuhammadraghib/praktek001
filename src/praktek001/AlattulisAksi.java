/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek001;

/**
 *
 * @author GMR
 */
public class AlattulisAksi {
    public static void main(String[] args) {
    Alattulis Buku       = new Alattulis();
    Alattulis Pulpen     = new Alattulis();
    Alattulis Penggaris  = new Alattulis();
    
    Buku.Jenis   = "Buku Tulis";
    Buku.Bentuk  = "Persegi";
    Buku.Panjang = "25 Cm";
    Buku.Bahan   = "Selulosa";
    Buku.Warna   = "Putih"; 

    Pulpen.Jenis   = "Pulpen Tinta";
    Pulpen.Bentuk  = "Silinder";
    Pulpen.Panjang = "15 Cm";
    Pulpen.Bahan   = "Plastik";
    Pulpen.Warna   = "Hitam";
    
    Penggaris.Jenis   = "Penggaris";
    Penggaris.Bentuk  = "Persegi Panjang";
    Penggaris.Panjang = "30 Cm";
    Penggaris.Bahan   = "Carbon";
    Penggaris.Warna   = "Abu-Abu";
    
    Buku.tampildata();
    Pulpen.tampildata();
    Penggaris.tampildata();
    }
}
