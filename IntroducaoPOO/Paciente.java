/*Crie uma classe paciente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto paciente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

package IntroducaoPOO;

import java.util.Scanner;

public class Paciente {
	
	Scanner ler = new Scanner(System.in);
	
	private String nome, genero;
	private int idade;
	int marcar, resultadoExame, retorno;
	
	public String getNome() 
	{
		return nome;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public String getGenero() 
	{
		return genero;
	}

	public void setGenero(String genero) 
	{
		this.genero = genero;
	}

	public int getIdade()
	{
		return idade;
	}

	public void setIdade(int idade) 
	{
		this.idade = idade;
	}
	
	public void Cadastro() 
	{
		System.out.println("Marcar consulta?: " +  "\n" +  "|1| - Sim " +  "\n" + "|0| - Não");
		int num = ler.nextInt();
		System.out.println("Retirar resultado de exame?: " +  "\n" +  "|1| - Sim " +  "\n" + "|0| - Não");
		int num1 = ler.nextInt();
		System.out.println("Agendar retorno?: " +  "\n" +  "|1| - Sim " +  "\n" + "|0| - Não");
		marcar = ler.nextInt();
		
		if(marcar == 1 || resultadoExame == 2 || retorno == 4)
		{
			System.out.println("Realizado!");
		}
		else {
			System.out.println("Não realizado!");

		}
	
	}

}
