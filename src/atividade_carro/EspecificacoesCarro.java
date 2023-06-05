package atividade_carro;

public class EspecificacoesCarro {

	public static void main(String[] args) {
		Carro carro1 = new Carro();
		Carro carro2 = new Carro();
        
        carro1.marca = "Chevrolet";
        carro1.modelo = "Celta";
        carro1.potencia = 78;
        carro1.velocidademaxima = 157;
        carro1.estado();
        
        System.out.println("----------------------------------------------------------------------------------------------");
        
        carro2.marca = "Toyota";
        carro2.modelo = "Supra MK4";
        carro2.potencia = 330;
        carro2.velocidademaxima = 250;
        carro2.estado();
        

	}

}
