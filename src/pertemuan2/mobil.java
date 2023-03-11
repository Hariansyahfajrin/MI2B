/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan2;

/**
 *
 * @author ASUS
 */
public class mobil {
    int tahunPembuatan ;
    String namaModel;
    
    public mobil(int tahun,String nama){
        tahunPembuatan = tahun ;
        namaModel = nama ;
    }
     public static void main (String []args){
        mobil m = new mobil( 2020, "Avanza");
        System.out.print("nama model :" +m.namaModel +
        "\n tahun Pembuatan :"+m.tahunPembuatan );
     }
        
}
