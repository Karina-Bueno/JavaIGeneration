/*Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)*/

package LacoRepeticao;

public class Exercicio2 {

	public static void main(String[] args) {
		
		int num, par = 0;
			
		for(num = 0; num <=10; num ++) {
			if (num % 2 != 0) {
				System.out.printf("\nImpar: %d",num);
			}
			else if(num % 2 == 0) {
				par=par+1;
				System.out.printf("\nPar: %d",num);
			}
			
		}
		System.out.printf("\nPares: %d\n", par);
		System.out.printf("Impares: %d", 10-par);
	}

}
