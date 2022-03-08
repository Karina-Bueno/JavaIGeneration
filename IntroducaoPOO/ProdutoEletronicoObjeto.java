package IntroducaoPOO;

import java.util.Scanner;

public class ProdutoEletronicoObjeto {

	private static Object conexaoInternet;

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe a marca do aparelho: ");
		String marca = ler.next();
		
		System.out.println("Informe a cor do aparelho: ");
		String cor = ler.next();
		
		System.out.println("Informe o limite de armazenamento (gb) do aparelho: ");
		int armazenamento = ler.nextInt();
		
		ProdutoEletronico pe1 = new ProdutoEletronico();
		
		pe1.setMarca(marca); 
		pe1.setCor(cor);
		pe1.setArmazenamento(armazenamento);
				
		
		System.out.print("\n"); 
		System.out.println("A marca do produto eletrônico é: " + pe1.getMarca()); 
		System.out.println("A cor é: " + pe1.getCor());
		System.out.println("Possui: " + pe1.armazenamento + " gb de armazenamento. ");
		

	}

}
