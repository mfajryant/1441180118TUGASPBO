class testTabungan{
	public static void main(String[] args) {
	//instansiasi objek
		//namaClass namaObjek = namaKonstruktor
		Tabungan t1 = new Tabungan();
		Tabungan t2 = new Tabungan(9000000,"John");
		Tabungan t3 = new Tabungan(8000000,"Tamorta",1123456789);
		Tabungan t4 = new Tabungan(7000000,"Roy",1234567890,1);

		System.out.println("LAYANAN CANGGIH BANK BCA");
		System.out.println(" ");
        System.out.println("Nama Pemilik : " +t1.getPemilik());
        System.out.println("Nomer Rekening :" +t1.getNorek());
        t1.menabung();
        t1.mengambil();
        t1.transfer();
        t1.menerimatransfer();
        t1.ceksaldo();
        System.out.println("Anda memiliki bunga sebesar "+t1.getBunga()+ " %");
		System.out.println(" ");
		
		t2.setNorek(1123456789);
		t2.setBunga(2);
		System.out.println(" ");
        System.out.println("Nama Pemilik : " +t2.getPemilik());
        System.out.println("Nomer Rekening :" +t2.getNorek());
        t2.menabung();
        t2.mengambil();
        t2.transfer();
        t2.menerimatransfer();
        t2.ceksaldo();
        System.out.println("Anda memiliki bunga sebesar "+t2.getBunga()+" %");

        t3.setBunga(4);
		System.out.println(" ");
        System.out.println("Nama Pemilik : " +t3.getPemilik());
        System.out.println("Nomer Rekening :" +t3.getNorek());
        t3.menabung();
        t3.mengambil();
        t3.transfer();
        t3.menerimatransfer();
        t3.ceksaldo();
        System.out.println("Anda memiliki bunga sebesar "+t3.getBunga()+" %");
        System.out.println(" ");

		System.out.println("Nama Pemilik : " +t4.getPemilik());
        System.out.println("Nomer Rekening :" +t4.getNorek());
        t4.menabung();
        t4.mengambil();
        t4.transfer();
        t4.menerimatransfer();
        t4.ceksaldo();
        System.out.println("Anda memiliki bunga sebesar "+t4.getBunga()+" %");
		
	}
}