/*O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
consumidor.*/

package Introducao;

public class Exercicio8 {

	public static void main(String[] args) {
		
		float custoFab = 20000, percentDistribuidor = 28, impostos = 45;
		
		float valorDistribuidor = custoFab * (percentDistribuidor / 100);
		
		float valorImposto = custoFab * (impostos / 100);
		
		float valorConsumidor = custoFab + valorDistribuidor + valorImposto;
		System.out.println("O custo para o consumidor será de: " + valorConsumidor);
		
	}

}
