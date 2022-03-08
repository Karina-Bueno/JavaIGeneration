/*Informar todos os números de 1000 a 1999 que quando divididos por 11
obtemos resto = 5. (FOR)*/

package LacoRepeticao;

public class Exercicio1 {

	public static void main(String[] args) {
	
		for (int num = 1000; num < 2000; num ++) {
			
			if (num % 11 == 5) {
			System.out.println(num);
			
			}
			
		}
		
	}

}
