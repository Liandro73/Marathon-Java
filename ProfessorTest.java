package br.com.liandro.javacore.introducaoclassestest;

import br.com.liandro.javacore.introducaoclasses.Professor;

public class ProfessorTest {
	public static void main(String[] args) {
		//Professor 1
		Professor dados = new Professor();
		dados.nome = "Roberto";
		dados.matricula = "20190101";
		dados.rg = "2.000.111";
		dados.cpf = "030.040.050-11";
		System.out.println("O nome do professor(a) de Matemática é "+dados.nome);
		System.out.println("Registrado na instituição de ensino com a matrícula nº "+dados.matricula);
		System.out.println("E portador de RG nº "+dados.rg);
		System.out.println("E CPF devidamente regular no registro: "+dados.cpf);
		System.out.println("-----------------------------------------------------------------------");
		
		//Professor 2
		Professor info = new Professor();
		info.nome = "Patrícia";
		info.matricula = "20190202";
		info.rg = "3.444.777";
		info.cpf = "070.555.080-22";
		System.out.println("O nome do professor(a) de Portugues é "+info.nome);
		System.out.println("Registrado na instituição de ensino com a matrícula nº "+info.matricula);
		System.out.println("E portador de RG nº "+info.rg);
		System.out.println("E CPF devidamente regular no registro: "+info.cpf);
		System.out.println("-----------------------------------------------------------------------");
	}
}
