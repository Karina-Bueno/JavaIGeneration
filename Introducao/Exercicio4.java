/*Escreva um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e
calcule a seguinte express�o:*/

package Introducao;

public class Exercicio4 {

	public static void main(String[] args) {
		
		int a = 2, b = 3, c = 4;
		
		int r = (a + b) * (a + b);
		
		int s = (b + c) * (b + c);
		
		int d = (r + s) / 2;
		
		System.out.println("O valor de r �: " + r);
		System.out.println("O calor de s �: " + s);
		System.out.println("O calor de d �: " + d);
	}
	
}
