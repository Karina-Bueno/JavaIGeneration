/*Crie uma classe funcion�rio e apresente os atributos e m�todos
referentes esta classe, em seguida crie um objeto funcion�rio, defina as
instancias deste objeto e apresente as informa��es deste objeto no
console.*/

package IntroducaoPOO;

public class Funcionario {
	
	
	//Atributos PRIVADOS
	private String nome, cargo;
	private int registro;
		
		public String getNome()
		{
			return nome;
		}
		public void setNome(String nome) 
		{
			this.nome = nome;
		}
		public String getCargo()
		{
			return cargo;
		}
		public void setCargo(String cargo)
		{
			this.cargo = cargo;
		}
		public int getRegistro() 
		{
			return registro;
		}
		public void setRegistro(int registro) 
		{
			this.registro = registro;
		}
		
}
