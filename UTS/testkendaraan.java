public class testkendaraan
{
	public static void main(String[] args)
	{
		mobil porsche = new mobil(200, 5000, 2, 4);
		porsche.CetakSpesifikasi();
		porsche.Jalankan(100);
		porsche.Jalankan(180);
	}
}
