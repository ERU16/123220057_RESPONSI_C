/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author PC PRAKTIKUM
 */
public class databuku {
      private int id;
      private String nama_penyewa;
      private String judul_buku;
      private String jenis_buku;
      private String nomor;
      private int durasi;
      private int totalb;

    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public String getNama_penyewa() {
        return nama_penyewa;
    }
    
    public void setNama_penyewa(String nama_penyewa) {
        this.nama_penyewa = nama_penyewa;
    }

    public String getJudul_buku() {
        return judul_buku;
    }
    
    public void setJudul_buku(String judul_buku) {
        this.judul_buku = judul_buku;
    }

    public String getNomor() {
        return nomor;
    }
    
    public void setNomor(String nomor) {
        this.nomor = nomor;
    }

    public int getDurasi() {
        return durasi;
    }
    
    public void setDurasi(int durasi) {
        this.durasi = durasi;
    }

    public int getTotalb(){
        if(this.durasi <= 2){
            totalb = this.durasi*10000;
            return totalb;
        }
        else{
            int sisah = this.durasi-2;
            totalb = (2*10000)+(sisah*5000);
            return totalb;
        }
    }

    public void setTotalb(int totalb) {
        this.totalb = totalb;
    }

    public String getJenis_buku() {
        return jenis_buku;
    }

    public void setJenis_buku(String jenis_buku) {
        this.jenis_buku = jenis_buku;
    }
     
}
