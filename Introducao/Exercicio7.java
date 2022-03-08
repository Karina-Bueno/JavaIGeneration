/*Um sistema de equações lineares do tipo...pode ser resolvido segundo mostrado abaixo... Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os
valores de x e y. :*/

package Introducao;

public class Exercicio7 {
	
	public static void main(String[] args) {
		
		int a = 1, b = 3, c = 6, d = 2, g = 4, f = 1;
		
		int x = ((c*g) - (b*f)) / ((a*g) - (b*d));
		int y = ((a*f) - (c*d)) / ((a*g) - (b*d));
		
		System.out.println("O valor de x será: " + x);
		System.out.println("\nO valor de y será: " + y);
	}
	
}
