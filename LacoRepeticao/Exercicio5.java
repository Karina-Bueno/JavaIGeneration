/*Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
digitados.(DO...WHILE)*/

package LacoRepeticao;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args){
               
        Scanner ler = new Scanner(System.in);
		
		int num, soma = 0;
		
		do {
			System.out.println("Digite um n�mero do teclado: ");
			num = ler.nextInt();
			
			soma = soma + num;
		}
		
		while(num != 0);
		
		System.out.println("A soma dos n�meros digitados �: " + soma);
		ler.close();
		
	}
	
}