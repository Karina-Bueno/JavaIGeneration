/*1- Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.*/

package LacoDecisao;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		float num1, num2, num3, maior;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Digite o primeiro n�mero: ");
		num1 = ler.nextFloat();
		System.out.println("Digite o segundo n�mero: ");
		num2 = ler.nextFloat();
		System.out.println("Digite o terceiro n�mero: ");
		num3 = ler.nextFloat();

		if((num1 > num2) && (num1> num3))
		{
			maior = num1;
			System.out.println("O maior n�mero �: "+ maior);
		}
		if((num2 > num3) && (num2 > num1))
		{
			maior = num2;
			System.out.println("O maior n�mero �: "+ maior);
		}
		else if((num3 > num2) && (num3 > num1))
		{
			maior = num3;
			System.out.println("O maior n�mero �: "+ maior);
		}

	}

}
