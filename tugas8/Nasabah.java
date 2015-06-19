package com.company;

public class Nasabah {

    private String namaNasabah;
    private String alamatNasabah;
    private Rekening rekeningNasabah;

    public Nasabah(String namaNasabah, String alamatNasabah) {
        this.namaNasabah = namaNasabah;
        this.alamatNasabah = alamatNasabah;
    }

    public Nasabah(String namaNasabah, String alamatNasabah, Rekening rekeningNasabah) {
        this.namaNasabah = namaNasabah;
        this.alamatNasabah = alamatNasabah;
        this.rekeningNasabah = rekeningNasabah;
    }

    public String getNamaNasabah() {
        return namaNasabah;
    }

    public void setNamaNasabah(String namaNasabah) {
        this.namaNasabah = namaNasabah;
    }

    public String getAlamatNasabah() {
        return alamatNasabah;
    }

    public void setAlamatNasabah(String alamatNasabah) {
        this.alamatNasabah = alamatNasabah;
    }

    public Rekening getRekeningNasabah() {
        return rekeningNasabah;
    }

    public void setRekeningNasabah(Rekening rekeningNasabah) {
        this.rekeningNasabah = rekeningNasabah;
    }

    @Override
    public String toString() {
        return "Nasabah{" +
                "namaNasabah='" + namaNasabah + '\'' +
                ", alamatNasabah='" + alamatNasabah + '\'' +
                ", rekeningNasabah='" + rekeningNasabah + '\'' +
                '}';
    }
}


