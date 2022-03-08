/*Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

package IntroducaoPOO;

public class Cliente {
	
	//ATRIBUTOS	
	String nome;
	String sexo;
	String estadoCivil;
	int idade;
	
	//METODO
	public void getNome(String nome) 
	{
		this.nome = nome;
	}
	
	public void getSexo(String sexo)
	{
		this.sexo = sexo;
	}
	
	
	public void getIdade(int idade) 
	{
		this.idade = idade;
	}
		
	public void getEstadocivil(String estadoCivil) 
	{
		this.estadoCivil = estadoCivil;
	}
		
}

