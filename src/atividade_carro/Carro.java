package atividade_carro;

public class Carro {
	String marca; 
	String modelo; 
	int potencia; 
	int velocidademaxima; 
	
	void estado(){ 
		System.out.println("Esse carro é da marca: " + this.marca);
		System.out.println("Esse carro é do modelo: " + this.modelo);
		System.out.println("Esse carro tem a potência de: " + this.potencia + "CV");
		System.out.println("Esse carro atinge a velocidade máxima de: " + this.velocidademaxima + "KMh");
	}
}
