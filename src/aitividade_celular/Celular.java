package aitividade_celular;

public class Celular {
	String marca;
	String modelo;
	int memoria;
	float processador;
	int carga;
	
	void ligado(){
		if(carga == 0) {
			System.out.println("Erro! o celular está descarregado");
		} else {
			System.out.println("O celular esta com carga");
		}
	}
	
	void estado(){ 
		System.out.println("Esse celular é da marca: " + this.marca);
		System.out.println("Esse celular é do modelo: " + this.modelo);
		System.out.println("Esse celular tem uma memória de : " + this.memoria + "GB");
		System.out.println("Esse celular tem um processador de: " + this.processador + "GHZ");
		System.out.println("Esse celular está com a carga de: " + this.carga + "%");
	}
}
