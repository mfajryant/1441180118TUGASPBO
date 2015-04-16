class TestMobil{
	public static void main(String[] args) {
		//create an object
		mobil mobilSatu = new mobil();
		mobil mobilDua = new mobil(321, "Parkiran", "R 3 Y", "Renault", "Hitam", 1200);
	
		//display the 1st object : mobilSatu
		System.out.print("Merk " +mobilSatu.getMerk());
		System.out.print(", berlokasi di "+mobilSatu.getPosisi());
		System.out.print(", bernomor polisi "+mobilSatu.getNopol());
		System.out.print(", kecepatan maksimal "+mobilSatu.getSpeed()+" km/h");
		System.out.print(", berwarna "+mobilSatu.getWarna());
		System.out.print(", bermesin "+mobilSatu.getMesin()+" cc");

		System.out.println(" ");
		System.out.println(" ");
		
		System.out.print("Merk " +mobilDua.getMerk());
		System.out.print(", berlokasi di "+mobilDua.getPosisi());
		System.out.print(", bernomor polisi "+mobilDua.getNopol());
		System.out.print(", kecepatan maksimal "+mobilDua.getSpeed()+" km/h");
		System.out.print(", berwarna "+mobilDua.getWarna());
		System.out.print(", bermesin "+mobilDua.getMesin()+" cc");


	}
}