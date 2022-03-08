/*Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
expressa em anos, meses e dias.*/

package Introducao;

public class Exercicio2 {

	public static void main(String[] args) {
		
		int idadeDias = 4000;
		
		int idadeAnos = idadeDias / 365;  /*primeiro fazer a conversao do total de dias para anos, dividindo o total lido por 365(ano)*/
		
		int totalDias = idadeDias % 365;
		
		int idadeMeses = totalDias / 30;
		
		totalDias = idadeMeses;
		totalDias = totalDias % 30; /* atualizar a quantidade de dias lidos menos a quantidade de anos convertidos*/
		idadeDias = totalDias;		/*atualiza a quantidade de dias lidos pegando o resto da divisão da quantidade de dias lidos por 30*/ 			
	
		System.out.print("Você tem "+ idadeAnos + " anos," + idadeMeses + " meses e "+ totalDias + " dias"); 

	}

}
