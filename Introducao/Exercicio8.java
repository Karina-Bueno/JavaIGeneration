/*O custo ao consumidor de um carro novo � a soma do custo de f�brica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao
consumidor.*/

package Introducao;

public class Exercicio8 {

	public static void main(String[] args) {
		
		float custoFab = 20000, percentDistribuidor = 28, impostos = 45;
		
		float valorDistribuidor = custoFab * (percentDistribuidor / 100);
		
		float valorImposto = custoFab * (impostos / 100);
		
		float valorConsumidor = custoFab + valorDistribuidor + valorImposto;
		System.out.println("O custo para o consumidor ser� de: " + valorConsumidor);
		
	}

}