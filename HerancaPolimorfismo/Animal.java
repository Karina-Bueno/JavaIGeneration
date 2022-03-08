package HerancaPolimorfismo;

import java.util.Scanner;

public class Animal {
	
	Scanner ler = new Scanner(System.in);
	
	protected String nome;
	protected int idade;
	protected boolean som;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		idade = idade;
	}

	public boolean getSom() {
		return som;
	}

	public void setSom(boolean som) {
		this.som = som;	
	}
		
}
	

