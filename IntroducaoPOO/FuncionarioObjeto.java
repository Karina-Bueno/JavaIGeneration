package IntroducaoPOO;

import java.util.Scanner;

public class FuncionarioObjeto {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = ler.next();
			
		System.out.println("Informe seu cargo: ");
		String cargo = ler.next();
			
		System.out.println("Digite seu código de registro (04 dígitos): ");
		int num = ler.nextInt();
			
		Funcionario f1 = new Funcionario();
		
		f1.setNome(nome);
		f1.setCargo(cargo);
		f1.setRegistro(num);
		
		System.out.print("\n"); //" --> Recuperando os dados do atributo marca através do método getMarca
		System.out.println("Nome do Funcionário: " + f1.getNome());
		System.out.println("Cargo do Funcionário: " + f1.getCargo());
		System.out.println("Seu número de registro: " + f1.getRegistro());
	}

}
