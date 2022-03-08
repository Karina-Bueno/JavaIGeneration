package IntroducaoPOO;

import java.util.Scanner;

public class AviaoObjeto {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o Fabricante da aeronave: ");
		String fabricante = ler.next();
		System.out.println("Digite a Cor: ");
		String cor = ler.next();
		System.out.println("Digite o Modelo: ");
		String modelo = ler.next();
		System.out.println("Digite o Ano da aeronave: ");
		int ano = ler.nextInt();
		
		Aviao a1 = new Aviao();
		
		a1.setFabricante(fabricante); //Alterando o atributo atrav�s do m�todo setMarca
		a1.setCor(cor);
		a1.setModelo(modelo);
		a1.setAno(ano);
		
		
		System.out.print("\n");
		System.out.println("O fabricante da aeronave �: " + a1.fabricante); //" --> Recuperando os dados do atributo atrav�s do m�todo getMarca
		System.out.println("A cor da aeronave �: " + a1.cor);
		System.out.println("O modelo da aeronave �: " + a1.modelo);
		System.out.println("A aeronave tem: " + a1.ano);
		
	}

}
