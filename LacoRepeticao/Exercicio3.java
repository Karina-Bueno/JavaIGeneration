/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)*/

package LacoRepeticao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade = 0, menor21 = 0, maior50 = 0;

		while(idade != -99) {
			System.out.println("Digite a sua idade: ");
			idade = leia.nextInt();
			
			if(idade < 21) {
				menor21 ++; //caçador de idade menor de 21
			}
			else if(idade > 50) {
				maior50 ++; //caçador de idade maior que 50
			}
			
		}
		System.out.printf("\nA quantidade de pessoas que possuem idade inferior a 21 anos é de : " + menor21);
		System.out.printf("\nA quantidade de pessoas que possuem idade superior a 50 anos é de : " + maior50);
		leia.close();

	}
	
}
