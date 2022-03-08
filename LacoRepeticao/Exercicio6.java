/*Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)*/

package LacoRepeticao;

import java.util.Scanner;

public class Exercicio6 {
	
	public static void main(String[] args) {
		
		 Scanner ler = new Scanner(System.in);
	        
	        double num, soma = 0, media = 0;;
	        int contador = 0;
	        
	        do{
	            System.out.println("Digite um número: ");
	            num = ler.nextDouble(); // usuario digita um número
	            
	            if(num % 3 == 0 && num != 0) { // se o número digitado for MAIOR que zero, executa a conta
	                soma = num + soma; // soma o valor digitado AGORA com o digitado ANTES
	                contador ++; // conta quantas vezes o usuário digitou um número
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