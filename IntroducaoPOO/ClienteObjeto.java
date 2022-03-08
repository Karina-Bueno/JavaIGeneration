package IntroducaoPOO;

import java.util.Scanner;

public class ClienteObjeto {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = leia.next();
		System.out.println("Digite seu sexo: ");
		String sexo = leia.next();
		System.out.println("Digite seu estado civil: ");
		String estadocivil = leia.next();
		System.out.println("Digite sua idade: ");
		int idade = leia.nextInt();
		
		Cliente c1 = new Cliente();
		
		c1.getNome(nome); 
		c1.getSexo(sexo);
		c1.getEstadocivil(estadocivil);
		c1.getIdade(idade);
		
		
		System.out.print("\n");
		System.out.println("O cliente: " + c1.nome); 
		System.out.println("É do sexo: " + c1.sexo);
		System.out.println("Seu estado civil é: " + c1.estadoCivil);
		System.out.println("Tem a idade de: " + c1.idade + " anos. ");
		
	}

}
