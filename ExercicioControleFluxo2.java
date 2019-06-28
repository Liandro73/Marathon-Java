package br.com.liandro.introdução;

public class ExercicioControleFluxo2 {
	public static void main(String[] args) {
		int salario = 10000;
		
		String imposto;
		  if (salario < 1000) {
			imposto = "Seu imposto é de 5%";
		} else if (salario >= 1000 && salario < 2000) {
			imposto = "Seu imposto é de 10%";
		} else if (salario >= 2000 && salario < 4000) { 
			imposto = "Seu imposto é de 15%";
		} else {
			imposto = "Seu imposto é de 20%";
		}
		  	System.out.println(imposto);
	}
}