package IntroducaoPOO;

import java.util.Scanner;

public class PacienteObjeto {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = ler.next();
		System.out.println("Qual seu genero?: ");
		String genero = ler.next();
		System.out.println("Qual sua idade?: ");
		int idade = ler.nextInt();
		
		Paciente p1 = new Paciente();
	
		System.out.println("O que deseja fazer?: ");
		p1.Cadastro();
	}
}
