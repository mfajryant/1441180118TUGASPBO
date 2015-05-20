public class TestMahasiswa{
	public static void main(String[] args) {
		mahasiswa mhs = new mahasiswa("Mohammad Fajryanto", 19);
		mhs.tampilkanBiodata();
		
		System.out.println("");
		mhs.setUmur(19);
		mhs.tampilkanBiodata();
	}
}