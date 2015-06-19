package com.company;

public class TestATM {
    public static void main(String[] args) {
//      buat objek rekening

        Rekening aa = new Rekening (2000000.0);
        Nasabah bb = new Nasabah("Fajri","Tulungagung");
        System.out.println(bb.toString());
        bb.setRekeningNasabah(aa);
        System.out.println(bb.toString());

//tarik saldo sebesar 9 juta
        aa.tarik(9000000.0);
//tampilkan saldo sekarang
        System.out.println("Tarik tunai sebesar 9.000.000");
        System.out.println("Saldo anda sekarang = " +aa.getSaldoRekening());
//setor saldo sebesar 5 juta
        aa.setor(5000000.0);
//tampilkan saldo sekarang
        System.out.println("Menabung sebesar Rp. 5.000.000");
        System.out.println("Saldo anda sekarang =" +aa.getSaldoRekening());
    }

}
