package aitividade_celular;

public class EspecificacoesCelular {
	
	public static void main(String[] args) {
		Celular celular1 = new Celular();
		Celular celular2 = new Celular();
		
		celular1.marca = "Motorola";
		celular1.modelo = "Moto G22";
		celular1.memoria= 128;
		celular1.processador = 2.6f;
		celular1.carga = 28;
		celular1.estado();
		celular1.ligado();
		
		System.out.println("--------------------------------------------------------------------------------------------------------------------------");
		
		celular2.marca = "Samsung";
		celular2.modelo = "Galaxy A32";
		celular2.memoria= 128;
		celular2.processador = 1.9f;
		celular2.carga = 0;
		celular2.estado();
		celular2.ligado();
	}
	
}
