package com.company;

/**
 * Created by lenovo on 08/07/2015.
 */
public class Klub {
    private String namaKlub;
    private com.company.Divisi Divisi;
    private Liga liga;

    public Klub(String namaKlub) {
        this.namaKlub = namaKlub;
    }

    public Klub(String namaKlub, Klub Divisi) {
        this.namaKlub = namaKlub;
        Divisi = Divisi;
    }

    public Klub(String namaKlub, com.company.Divisi divisi, Liga liga) {
        this.namaKlub = namaKlub;
        Divisi = divisi;
        this.liga = liga;
    }

    public String getNamaKlub() {
        return namaKlub;
    }

    public void setNamaKlub(String namaKlub) {
        this.namaKlub = namaKlub;
    }

    public com.company.Divisi getDivisi() {
        return Divisi;
    }

    public void setDivisi(Divisi Divisi) {
        this.Divisi = Divisi;
    }

    public Liga getLiga() {
        return liga;
    }

    public void setLiga(Liga liga) {
        this.liga = liga;
    }

    @Override
    public String toString() {
        return "Klub{" +
                "namaKlub='" + namaKlub + '\'' +
                '}';
    }
}
