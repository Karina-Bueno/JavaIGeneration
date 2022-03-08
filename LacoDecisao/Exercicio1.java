/*1- Faça um programa que receba três inteiros e diga qual deles é o maior.*/

package LacoDecisao;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		float num1, num2, num3, maior;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Digite o primeiro número: ");
		num1 = ler.nextFloat();
		System.out.println("Digite o segundo número: ");
		num2 = ler.nextFloat();
		System.out.println("Digite o terceiro número: ");
		num3 = ler.nextFloat();

		if((num1 > num2) && (num1> num3))
		{
			maior = num1;
			System.out.println("O maior número é: "+ maior);
		}
		if((num2 > num3) && (num2 > num1))
		{
			maior = num2;
			System.out.println("O maior número é: "+ maior);
		}
		else if((num3 > num2) && (num3 > num1))
		{
			maior = num3;
			System.out.println("O maior número é: "+ maior);
		}

	}

}
