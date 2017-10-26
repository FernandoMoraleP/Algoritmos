public class AlgoritmoEdad{
	public static void main(String[] args) {
		int edad;
		Reader read = new Reader();
		System.out.println("Ingrese las edades ");
			edad = read.leeInt();

		for (int i = 0; i <= 3; i++) {
			
			if(edad < 0)
				System.out.println("El dato es invalido");

			
			if(edad > 1 && edad<= 12){
					System.out.println("Es niño");
			}else {
				if (edad >= 13 && edad <= 17){
					System.out.println("Es adolesente");
			}else{
				if (edad >= 18)
				System.out.println("Es adulto.");
			}
			}
			
		}
			
	

	}
}