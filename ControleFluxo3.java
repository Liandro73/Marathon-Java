package br.com.liandro.introdução;

public class ControleFluxo3 {
	public static void main(String[] args) {

		int utilOuNao = 5;

		switch (utilOuNao) {
		case 1:
		case 7:
			System.out.println("Final de Semana");
			break;
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
			System.out.println("Dia Útil");
			break;
		default:
			System.out.println("Opção Inválida");
		}
	}
}
