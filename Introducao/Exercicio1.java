/*Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
dias e mostre-a expressa apenas em dias.*/

package Introducao;

public class Exercicio1 {
	
	public static void main(String[] args) {
	
		int idadeAnos = 20;
		
		int idadeMeses = idadeAnos * 12;
		
		int idadeDias = (idadeAnos * 365) + idadeMeses;
		
		System.out.println("\nQual a sua idade em anos? "+ idadeAnos);
		System.out.println ("\nQual a sua idade em meses? "+ idadeMeses);
		System.out.print("\nSua idade em dias é: "+ idadeDias);
	}
	
}
