/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MI2B;

/**
 *
 * @author ASUS
 */
public class Mahasiswa {
    String nama,nobp,kelas,prodi,jurusan;
    public static void main(String[] args) {
        Mahasiswa mhs =new Mahasiswa();
        mhs.nama ="Hari";
        mhs.nobp="2101092050";
        mhs.kelas="Mi2B";
        mhs.prodi="MI";
        mhs.jurusan="TI";
        
        System.out.print("nama : "+mhs.nama+ "\n"
        +"nobp:"+mhs.nobp+"\n"
        +"jurusan :"+mhs.jurusan+"\n"
        +"Prodi :"+mhs.prodi+"\n" 
        +"Kelas :"+mhs.kelas+"\n");
        
        System.out.println("");
        Mahasiswa mhs2 =new Mahasiswa();
        mhs2.nama ="Rian";
        mhs2.nobp="2101092050";
        mhs2.kelas="Mi2B";
        mhs2.prodi="MI";
        mhs2.jurusan="TI";
        
          System.out.print("nama : "+mhs2.nama+ "\n"
        +"nobp:"+mhs2.nobp+"\n"
        +"jurusan :"+mhs2.jurusan+"\n"
        +"Prodi :"+mhs2.prodi+"\n" 
        +"Kelas :"+mhs2.kelas+"\n");
        
        
    }
    
}
