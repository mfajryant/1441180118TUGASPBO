package com.company;

public class Sepeda {
    private String merkSepeda;
    private String jenisSepeda;
    private String warnaSepeda;
    private int tahunPembuatanSepeda;

    public Sepeda() {
        }

    public Sepeda(String merkSepeda, String jenisSepeda, String warnaSepeda, int tahunPembuatanSepeda) {
        this.merkSepeda = merkSepeda;
        this.jenisSepeda = jenisSepeda;
        this.warnaSepeda = warnaSepeda;
        this.tahunPembuatanSepeda = tahunPembuatanSepeda;
    }

    public String getMerkSepeda() {
        return merkSepeda;
    }

    public void setMerkSepeda(String merkSepeda) {
        this.merkSepeda = merkSepeda;
    }

    public String getJenisSepeda() {
        return jenisSepeda;
    }

    public void setJenisSepeda(String jenisSepeda) {
        this.jenisSepeda = jenisSepeda;
    }

    public String getWarnaSepeda() {
        return warnaSepeda;
    }

    public void setWarnaSepeda(String warnaSepeda) {
        this.warnaSepeda = warnaSepeda;
    }

    public int getTahunPembuatanSepeda() {
        return tahunPembuatanSepeda;
    }

    public void setTahunPembuatanSepeda(int tahunPembuatanSepeda) {
        this.tahunPembuatanSepeda = tahunPembuatanSepeda;
    }

    @Override
    public String toString() {
        return "Sepeda{" +
                "merkSepeda='" + merkSepeda + '\'' +
                ", jenisSepeda='" + jenisSepeda + '\'' +
                ", warnaSepeda='" + warnaSepeda + '\'' +
                ", tahunPembuatanSepeda=" + tahunPembuatanSepeda +
                '}';
    }
}
