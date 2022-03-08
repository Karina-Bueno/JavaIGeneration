/*Construa um programa em c que, tendo como dados de entrada dois pontos
quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles = d. A fórmula
que efetua tal cálculo é:*/

package Introducao;

public class Exercicio6 {

	public static void main(String[] args) {
		
		int x1 = 5, y1 = 4, x2 = 1, y2 = 3; 
		
		float d = (((x2-x1)*(x2-x1)) + ((y2-y1) * (y2-y1)));
		
		float resultado = (float) Math.sqrt(d + 2);
		
		System.out.println("O valor de D é = " + resultado);
		
	}

}
