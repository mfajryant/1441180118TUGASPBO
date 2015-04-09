class TestLaptop{
public static void main(String[] args) {

		Laptop lpSatu = new Laptop();
		Laptop lpDua = new Laptop("Compaq","Putih");
		Laptop lpTiga = new Laptop("Asus", "Hitam", "Terputus");
		Laptop lpEmpat = new Laptop("HP", "Merah", "Terhubung", 100);

		lpSatu.menyala();
		System.out.println("Laptop Pertama	: Merk = "+ lpSatu.getMerk() +" Warna = "+lpSatu.getWarna()+"	Wifi = "+lpSatu.getWifi()+" Baterai = "+lpSatu.getBaterai());
		lpSatu.indikatorBaterai();
		lpSatu.indikatorWifi();
		lpDua.menyala();
		System.out.println("Laptop Kedua	: Merk = "+ lpDua.getMerk() +"	 Warna = "+lpDua.getWarna()+"	Wifi = "+lpDua.getWifi()+" Baterai = "+lpDua.getBaterai());
		lpDua.mati();
		lpDua.indikatorBaterai();
		lpDua.indikatorWifi();
		lpSatu.mati();
		lpTiga.menyala();
		System.out.println("Laptop Ketiga	: Merk = "+ lpTiga.getMerk() +"	 Warna = "+lpTiga.getWarna()+"	Wifi = "+lpTiga.getWifi()+"  Baterai = "+lpTiga.getBaterai());
		lpTiga.mati();
		lpTiga.indikatorBaterai();
		lpTiga.indikatorWifi();
		lpEmpat.menyala();
		System.out.println("Laptop Keempat	: Merk = "+ lpEmpat.getMerk() +"	 Warna = "+lpEmpat.getWarna()+"	Wifi = "+lpEmpat.getWifi()+" Baterai = "+lpEmpat.getBaterai());
		lpEmpat.indikatorBaterai();
		lpEmpat.indikatorWifi();
		lpEmpat.mati();
		//setter
		System.out.println("Setelah Setter");
		lpSatu.setMerk("Toshiba"); lpSatu.setWarna("Pink"); lpSatu.setWifi("Terputus"); lpSatu.setBaterai(60);
		lpSatu.menyala();
		System.out.println("Laptop Pertama	: Merk = "+ lpSatu.getMerk() +" Warna = "+lpSatu.getWarna()+"	Wifi = "+lpSatu.getWifi()+"  Baterai = "+lpSatu.getBaterai());
		lpSatu.indikatorBaterai();
		lpSatu.indikatorWifi();
		lpSatu.mati();
		lpEmpat.setBaterai(100);
		lpEmpat.menyala();
		System.out.println("Laptop Keempat	: Merk = "+ lpEmpat.getMerk() +"	 Warna = "+lpEmpat.getWarna()+"	Wifi = "+lpEmpat.getWifi()+" Baterai = "+lpEmpat.getBaterai());
		lpEmpat.indikatorBaterai();
		lpEmpat.indikatorWifi();
		lpEmpat.mati();
				}
}