package atividade_carro;

public class Carro {
	String marca; 
	String modelo; 
	int potencia; 
	int velocidademaxima; 
	
	void estado(){ 
		System.out.println("Esse carro � da marca: " + this.marca);
		System.out.println("Esse carro � do modelo: " + this.modelo);
		System.out.println("Esse carro tem a pot�ncia de: " + this.potencia + "CV");
		System.out.println("Esse carro atinge a velocidade m�xima de: " + this.velocidademaxima + "KMh");
	}
}
