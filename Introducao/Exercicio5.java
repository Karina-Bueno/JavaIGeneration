/*5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,
respectivamente.*/

package Introducao;

public class Exercicio5 {

	public static void main(String[] args) {
		
		float nota1 = 10, nota2 = 4, nota3 = 8;
		
		float media = ((nota1*2)+(nota2*3)+(nota3*5))/10;
		System.out.println("\nA média ponderada é " + media);

	}

}
