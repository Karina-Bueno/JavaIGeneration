/*Crie uma classe funcionário e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto funcionário, defina as
instancias deste objeto e apresente as informações deste objeto no
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
