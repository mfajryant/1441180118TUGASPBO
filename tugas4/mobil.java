class mobil{
	//variables
	private double speed;
	private String posisi;
	private String nopol;
	private String merk;
	private String warna;
	private double mesin;

	//constructors
	public mobil(){
		speed = 325;
		posisi = "Parkiran";
		nopol = "M45 REY";
		merk = "Mustang";
		warna = "emas";
		mesin = 1200;
	}

	public mobil(double speedInput, String posisiInput, String nopolInput, String merkInput, String warnaInput, double mesinInput){
		speed = speedInput;
		posisi = posisiInput;
		nopol = nopolInput;
		merk = merkInput;
		warna = warnaInput;
		mesin = mesinInput;
	}

	//methods
	public void maju(){
		System.out.println("Gooo!!!!!");
	}

	public void mundur(){
		System.out.println("Go Back!!!!!!");
	}

	public void berhenti(){
		System.out.println("Stop !!!!");
	}

	public void belok(){
		System.out.println("Pusing Kanan, Pusing Kiri");
	}

	public void ngebut(){
		System.out.println("Boommmm !!!!!");
	}

	public void ngerem(){
		System.out.println("SSttt");
	}

	//getter
	public double getSpeed(){
		return speed;
	}
	
	public String getPosisi(){
		return posisi;
	}

	public String getNopol(){
		return nopol;
	}
	
	public String getMerk(){
		return merk;
	}
	
	public String getWarna(){
		return warna;
	}
	
	public double getMesin(){
		return mesin;
	}
}