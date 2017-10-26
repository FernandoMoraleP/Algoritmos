public class AlgoritmoCaracteres{
	public static void main(String[] args) {
		Reader read =  new Reader();
		Typetester t = new Typetester();

		char a;
		int b;
		String salir;

		do{
		salir = read.leeString();
		System.out.println("ingrese los datos");
		//b = read.leeInt();
		a = read.leeChar();
		
		t.printType( a );
		b = read.leeInt();
		}while(salir == "no");
		

		

		

		

		//if (a == a)
			System.out.println(a);
	}
}