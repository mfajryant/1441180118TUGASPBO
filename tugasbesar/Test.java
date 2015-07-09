package com.company;

/**
 * Created by lenovo on 08/07/2015.
 */
public class Test {

    public static void main(String[] args) {

        Liga Perancis = new Liga("Liga Perancis");

        Divisi satu = new Divisi("Ligue 1");
        Divisi dua = new Divisi("Ligue 2");

        Klub satu1 = new Klub("Olympique Lyon",satu, Perancis);
        Klub satu2 = new Klub("Olympique Marseille", satu, Perancis);
        Klub dua1 = new Klub("Aj Auxerre", dua, Perancis);
        Klub dua2 = new Klub("CA Bastia", dua, Perancis);

        Perancis.setDaftarDivisi(satu);
        Perancis.setDaftarDivisi(dua);

        Perancis.setDaftarKlub(satu1);
        Perancis.setDaftarKlub(satu2);
        Perancis.setDaftarKlub(dua1);
        Perancis.setDaftarKlub(dua2);

        satu.setDaftarKlub(satu1);
        satu.setDaftarKlub(satu2);
        dua.setDaftarKlub(dua1);
        dua.setDaftarKlub(dua2);

        System.out.println("Liga : " +Perancis.getNamaLiga());
        System.out.println("Divisi : " +Perancis.getDaftarDivisi());

        System.out.println("\n");

        System.out.println("Liga : " +Perancis.getNamaLiga());
        System.out.println("Klub : " +Perancis.getDaftarKlub());
        System.out.println("\n");
        System.out.println("Liga : " +Perancis.getNamaLiga());
        System.out.println("Klub : " +satu.getDaftarKlub());
        System.out.println("\n");
        System.out.println("Liga : " +Perancis.getNamaLiga());
        System.out.println("Klub : " +dua.getDaftarKlub());
        System.out.println("\n");
        System.out.println("Liga   : " + satu1.getLiga());
        System.out.println("Klub   : " + satu1.getNamaKlub());
        System.out.println("Divisi : " + satu1.getDivisi());
        System.out.println("\n");
        System.out.println("Liga   : " + dua2.getLiga());
        System.out.println("Klub   : " + dua2.getNamaKlub());
        System.out.println("Divisi : " + dua2.getDivisi());


    }
}
