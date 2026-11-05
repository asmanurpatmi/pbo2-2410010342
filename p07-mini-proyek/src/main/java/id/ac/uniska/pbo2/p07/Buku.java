/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.uniska.pbo2.p07;

public class Buku {
    private String kode;
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private boolean tersedia;

    public Buku(String kode, String judul, String penulis,
                int tahunTerbit, boolean tersedia) {
        this.kode = kode;
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.tersedia = tersedia;
    }

    public String getKode() {
        return kode;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public boolean isTersedia() {
        return tersedia;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia;
    }
}
