/*2- Faça um programa que entre com três números e coloque em ordem crescente.*/

package LacoDecisao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		double num1, num2, num3;
		
		Scanner entre = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro valor: ");
		num1 = entre.nextFloat();
		System.out.println("Entre com o segundo valor: ");
		num2 = entre.nextFloat();
		System.out.println("Entre com o terceiro valor: ");
		num3 = entre.nextFloat();
		
		if((num1 > num2) && (num2 >= num3))
		{
			System.out.println("A ordem crescente: \n" + num3+ num2 + num1);
		}
		if((num2 >= num1) && (num2 > num3) && (num1 >= num3))
		{
			System.out.println("A ordem crescente: \n" + num3 + num1 + num2);
		}
		if((num2 > num1) && (num2 >= num3) && (num1 <= num3))
        {
			System.out.println("A ordem crescente: \n" + num1 + num3 + num2);
		}
		if((num2 > num1) && (num2 <= num3))
        {
			System.out.println("A ordem crescente: \n" + num1 + num2 + num3);
		}
		if((num2 < num1) && (num1 < num3))
        {
			System.out.println("A ordem crescente: \n" + num2 + num1 + num3);
		}
		if((num2 < num3) && (num3 <= num1)) 
		{
			System.out.println("A ordem crescente: \n" + num2 + num3 + num1);
		}
			               
	}

}
