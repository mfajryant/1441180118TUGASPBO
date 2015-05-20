class mahasiswa{
	private String nama;
	private int umur;

	public mahasiswa(String namaInput, int umurInput){
		nama = namaInput;
		umur = umurInput;
	}

	public void tampilkanBiodata(){
		System.out.println(">>> BIODATA <<<");
		System.out.println("Nama : " +getNama());
		System.out.println("Umur : " +getUmur());
	}

	public void setNama(String n){
		nama = n;
	}

	public void setUmur(int u){
		umur = u;
	}

	public String getNama(){
		return nama;
	}

	public int getUmur(){
		return umur;
	}
}