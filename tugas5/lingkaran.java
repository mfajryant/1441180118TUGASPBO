public class lingkaran{
	int jarijari;
	double luasLingkaran;
	double kelilingLingkaran;

	public lingkaran(int jarijariInput){
		jarijari = jarijariInput;
	}

	public void tampilkanProperty(){
		System.out.println("Jari-jari Lingkaran : " +jarijari);
	}

	public double luaslingkaran(){
		luasLingkaran = Math.PI * jarijari * jarijari;
		return luasLingkaran;
	}

	public double kelilinglingkaran(){
		kelilingLingkaran = 2 * Math.PI * jarijari;
		return kelilingLingkaran;
	}		
}