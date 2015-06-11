package com.company;

/**
 * Created by lenovo on 11/06/2015.
 */
public class Rider {
    private String namaRider;
    private String alamatRider;
    private int umurRider;
    private Sepeda modif;

    public Rider() {
    }

    public Rider(String namaRider, String alamatRider, int umurRider, Sepeda modif) {
        this.namaRider = namaRider;
        this.alamatRider = alamatRider;
        this.umurRider = umurRider;
        this.modif = modif;
    }

    public String getNamaRider() {
        return namaRider;
    }

    public void setNamaRider(String namaRider) {
        this.namaRider = namaRider;
    }

    public String getAlamatRider() {
        return alamatRider;
    }

    public void setAlamatRider(String alamatRider) {
        this.alamatRider = alamatRider;
    }

    public int getUmurRider() {
        return umurRider;
    }

    public void setUmurRider(int umurRider) {
        this.umurRider = umurRider;
    }

    public Sepeda getModif() {
        return modif;
    }

    public void setModif(Sepeda modif) {
        this.modif = modif;
    }

    @Override
    public String toString() {
        return "Rider{" +
                "namaRider='" + namaRider + '\'' +
                ", alamatRider='" + alamatRider + '\'' +
                ", umurRider=" + umurRider +
                ", modif=" + modif +
                '}';
    }
}
