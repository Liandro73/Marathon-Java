package br.com.liandro.introdu��o;

public class ExercicioControleFluxo {
	public static void main(String[] args) {
		int salario = 3999;
		
		  if (salario < 1000) {
			System.out.println("Seu imposto � de 5%");
		} else if (salario >= 1000 && salario < 2000) {
			System.out.println("Seu imposto � de 10%");
		} else if (salario >= 2000 && salario < 4000) { 
			System.out.println("Seu imposto � de 15%");
		} else {
			System.out.println("Seu imposto � de 20%");
		}
	}
}
