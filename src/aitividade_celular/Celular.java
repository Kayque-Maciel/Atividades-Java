package aitividade_celular;

public class Celular {
	String marca;
	String modelo;
	int memoria;
	float processador;
	int carga;
	
	void ligado(){
		if(carga == 0) {
			System.out.println("Erro! o celular est� descarregado");
		} else {
			System.out.println("O celular esta com carga");
		}
	}
	
	void estado(){ 
		System.out.println("Esse celular � da marca: " + this.marca);
		System.out.println("Esse celular � do modelo: " + this.modelo);
		System.out.println("Esse celular tem uma mem�ria de : " + this.memoria + "GB");
		System.out.println("Esse celular tem um processador de: " + this.processador + "GHZ");
		System.out.println("Esse celular est� com a carga de: " + this.carga + "%");
	}
}
