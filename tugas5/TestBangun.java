public class TestBangun{
	public static void main(String[] args) {
		segitiga s = new segitiga(2, 3, 4);
		lingkaran l = new lingkaran(21);

		System.out.println("========================");
		System.out.println("       SEGITIGA");
		System.out.println("========================");
		s.tampilkanProperty();
		System.out.println("Luas : " +s.luassegitiga());
		System.out.println("Keliling : " +s.kelilingsegitiga());
		
		System.out.println("");

		System.out.println("========================");
		System.out.println("       LINGKARAN");
		System.out.println("========================");
		l.tampilkanProperty();
		System.out.println("Luas : " +l.luaslingkaran());
		System.out.println("Keliling : " +l.kelilinglingkaran());
	}
} 
