package atividade_garrafa;

public class Garrafa {
	String marca;
	int capacidade;
	String material;
	int carga;
	
	void beber() {
		if(carga == 0){
			System.out.println("Erro! A garrafa está vazia.");
		}else {
			System.out.println("Pode beber");
		}
	}
	
	void estado() {
		System.out.println("Essa garrafa é da marca: " + this.marca);
		System.out.println("Essa garrafa tem a capacidade de: " + this.capacidade + "ML");
		System.out.println("Essa garrafa é feito de: " + this.material);
		System.out.println("Essa garrafa está com a carga de: " + this.carga + "ML");
	}
}


