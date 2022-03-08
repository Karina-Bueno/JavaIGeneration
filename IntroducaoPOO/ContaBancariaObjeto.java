package IntroducaoPOO;

import java.util.Scanner;

public class ContaBancariaObjeto {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o número da conta (06 Digitos): ");
		int numeroDaConta = ler.nextInt();
		System.out.println("Digite seu usuario (Seu CPF): ");
		String usuario = ler.next();
		System.out.println("Digite sua senha (04 Digitos): ");
		int senha = ler.nextInt();
		System.out.println("Digite o saldo: ");
		double saldo = ler.nextDouble();
		
		
		ContaBancaria c1 = new ContaBancaria();
		
		c1.setNumeroConta(numeroDaConta);
		c1.setSaldo(saldo);
		
		System.out.println("O numero de sua conta é " + c1.getNumeroConta());
		System.out.println("Seu saldo é de: R$ " + c1.getSaldo() + " reais. ");

	}

}
