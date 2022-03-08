/*Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)*/

package LacoRepeticao;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args){
               
        Scanner ler = new Scanner(System.in);
		
		int num, soma = 0;
		
		do {
			System.out.println("Digite um número do teclado: ");
			num = ler.nextInt();
			
			soma = soma + num;
		}
		
		while(num != 0);
		
		System.out.println("A soma dos números digitados é: " + soma);
		ler.close();
		
	}
	
}