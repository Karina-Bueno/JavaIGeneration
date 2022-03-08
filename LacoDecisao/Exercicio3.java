/*3- Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra:
 10-14 infantil
 15-17 juvenil
 18-25 adulto*/

package LacoDecisao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		double idade;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite sua idade: ");
		idade = ler.nextInt();
		
		if((idade >= 5) && (idade <= 7))
		{
			System.out.println("Você se classifica na categoria infantil A!");
		}
		if((idade >= 8) && (idade <= 11))
		{
			System.out.println("Você se classifica na categoria Infantil B!");
		}
		if((idade >= 12) && (idade <= 13))
		{
			System.out.println("Você se classifica na categoria Juvenil A!");
		}
		if((idade >= 14) && (idade <= 17))
		{
			System.out.println("Você se classifica na categoria Jnfantil B!");
		}
		else if(idade >= 18)
		{
			System.out.println("Você se classifica na categoria Adulto!");
		}
		else
		{
			System.out.print("Você não se classifica em nenhuma categoria");
		}

	}

}
