package IntroducaoPOO;

import java.util.Scanner;

public class FuncionarioObjeto {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = ler.next();
			
		System.out.println("Informe seu cargo: ");
		String cargo = ler.next();
			
		System.out.println("Digite seu c�digo de registro (04 d�gitos): ");
		int num = ler.nextInt();
			
		Funcionario f1 = new Funcionario();
		
		f1.setNome(nome);
		f1.setCargo(cargo);
		f1.setRegistro(num);
		
		System.out.print("\n"); //" --> Recuperando os dados do atributo marca atrav�s do m�todo getMarca
		System.out.println("Nome do Funcion�rio: " + f1.getNome());
		System.out.println("Cargo do Funcion�rio: " + f1.getCargo());
		System.out.println("Seu n�mero de registro: " + f1.getRegistro());
	}

}
