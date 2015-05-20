public class segitiga{
	int tinggiSegitiga;
	int alasSegitiga;
	int sisimiringSegitiga;
	int luasSegitiga;
	int kelilingSegitiga;

	public segitiga(int tinggiSegitigaInput, int alasSegitigaInput, int sisimiringSegitigaInput){
		tinggiSegitiga = tinggiSegitigaInput;
		alasSegitiga = alasSegitigaInput;
		sisimiringSegitiga = sisimiringSegitigaInput;
	}

	public void tampilkanProperty(){
		System.out.println("Tinggi segitiga        : " +tinggiSegitiga);
		System.out.println("Alas segitiga          : " +alasSegitiga);
		System.out.println("Sisi miring segitiga   : " +sisimiringSegitiga);
	}

	public int luassegitiga(){
		luasSegitiga = (alasSegitiga * tinggiSegitiga) / 2;
		return luasSegitiga;
	}

	public int kelilingsegitiga(){
		kelilingSegitiga = alasSegitiga + tinggiSegitiga + sisimiringSegitiga;
		return kelilingSegitiga;
	}		
}