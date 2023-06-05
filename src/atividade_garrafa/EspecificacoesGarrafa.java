package atividade_garrafa;

public class EspecificacoesGarrafa {

	public static void main(String[] args) {
		Garrafa garrafa1 = new Garrafa();
		Garrafa garrafa2 = new Garrafa();
		
		garrafa1.marca = "Oracle";
		garrafa1.capacidade = 600;
		garrafa1.material = "Aluminio";
		garrafa1.carga = 0;
		garrafa1.beber();
		garrafa1.estado();
		
		System.out.println("------------------------------------------------------------------------------------------------");
		
		garrafa2.marca = "Evolution Nutricion";
		garrafa2.capacidade = 600;
		garrafa2.material = "Plástico";
		garrafa2.carga = 70;
		garrafa2.beber();
		garrafa2.estado();
	}

}
