/*4- Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
�mpar exiba o n�mero elevado ao quadrado.*/

package LacoDecisao;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		double num;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o n�mero: ");
		num = ler.nextInt();
		   
		if(num % 2 != 0) 
		{
			System.out.println("\nO n�mero � impar: " + (num * num));  /*ou colocar essa condi��o Math.pow(num, 2)*/
		}
		else
		{
			System.out.println("\nO n�mero � par: " + Math.sqrt(num));
		}
		

	}

}
