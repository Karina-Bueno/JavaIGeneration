/*4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.*/

package LacoDecisao;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		double num;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o número: ");
		num = ler.nextInt();
		   
		if(num % 2 != 0) 
		{
			System.out.println("\nO número é impar: " + (num * num));  /*ou colocar essa condição Math.pow(num, 2)*/
		}
		else
		{
			System.out.println("\nO número é par: " + Math.sqrt(num));
		}
		

	}

}
