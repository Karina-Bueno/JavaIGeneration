/*Crie uma classe produto eletrônico e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto produto eletrônico,
defina as instancias deste objeto e apresente as informações deste objeto
no console.*/

package IntroducaoPOO;

import java.util.Scanner;

public class ProdutoEletronico {
	
	Scanner ler = new Scanner(System.in);
	
	//Atributos 
	private String marca, cor;
	int armazenamento;
	private int conexaoInternet;
	
		
		public String getMarca() {
			return marca;
		}
		public void setMarca(String marca) {
			this.marca = marca;
		}
		public String getCor() {
			return cor;
		}
		public void setCor(String cor) {
			this.cor = cor;
		}
		public int getArmazenamento() {
			return armazenamento;
		}
		public void setArmazenamento(int armazenamento) {
			this.armazenamento = armazenamento;
			
	}
			
}
		