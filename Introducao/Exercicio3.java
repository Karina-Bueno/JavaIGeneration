/*Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.*/

package Introducao;

public class Exercicio3 {

	public static void main(String[] args) {
		
		int totalSegundos = 2000;
		
		int horas = totalSegundos / 3600;   /*1 hora � igual a 3600 segundos*/
		
		int totalHoras = totalSegundos - (horas * 3600);
		
		int minutos = totalHoras / 60;
		
		int segundos = totalHoras - (minutos * 60);
		
		System.out.print("Tempo do Evento: " + horas + "h " + minutos + "min e " + segundos + "seg");
	}

}
