class mobil extends kendaraan{
	private int kecMaks;
	private int jumlahRoda;

	public mobil(int kecepatanMaksInput, int beratInput, int kapasitasInput, int jumlahRodaInput){
		kecepatanMaks = kecepatanMaksInput;
		berat = beratInput;
		kapasitas = kapasitasInput;
		jumlahRoda = jumlahRodaInput;
	}

	kendaraan k = new kendaraan();

	public void CetakSpesifikasi(){
		System.out.println("Kecepatan Maks Kendaraan : " +k.getkecepatanMaks());
		System.out.println("Kecepatan Maks Mobil : " +kecepatanMaks);
		System.out.println("Berat Mobil : " +berat);
		System.out.println("Kapasitas Mobil : " +kapasitas);
		System.out.println("Jumlah Roda Mobil : " +jumlahRoda);
	}

	public void Jalankan( int kecepatan){
		System.out.println("Mobil berjalan dengan kecepatan " +kecepatan);
	}
}