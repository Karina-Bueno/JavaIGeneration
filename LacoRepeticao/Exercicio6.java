/*Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)*/

package LacoRepeticao;

import java.util.Scanner;

public class Exercicio6 {
	
	public static void main(String[] args) {
		
		 Scanner ler = new Scanner(System.in);
	        
	        double num, soma = 0, media = 0;;
	        int contador = 0;
	        
	        do{
	            System.out.println("Digite um n�mero: ");
	            num = ler.nextDouble(); // usuario digita um n�mero
	            
	            if(num % 3 == 0 && num != 0) { // se o n�mero digitado for MAIOR que zero, executa a conta
	                soma = num + soma; // soma o valor digitado AGORA com o digitado ANTES
	                contador ++; // conta quantas vezes o usu�rio digitou um n�mero
	            }
	            
	        }
	        while(num != 0);              
	        System.out.println();             
	        	if(num %3==0  && num!=0) {             
	        		soma = soma + num;             
	        		contador  ++;         
	        	}
	        	media = soma / contador;             
	        	System.out.printf("A media dos numeros e: %3.2f ",media);        
	        	System.out.println("\npause");       

	}
	
}