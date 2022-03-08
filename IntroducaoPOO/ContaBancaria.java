/*Crie uma classe conta bancaria e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto conta bancaria, defina
as instancias deste objeto e apresente as informações deste objeto no
console.*/

package IntroducaoPOO;

public class ContaBancaria {
	
	//Atributos PRIVADOS
	private int numeroDaConta;
	private String usuario;
	private double saldo;
	int senha;
	
	public int getNumeroConta() 
	{
		return numeroDaConta;
	}
	public void setNumeroConta(int numeroDaConta) 
	{
		this.numeroDaConta = numeroDaConta;
	}
	public String getUsuario() 
	{
		return usuario;
	}
	public void setUsuario(String usuario) 
	{
		this.usuario = usuario;
	}
	public double getSaldo() 
	{
		return saldo;
	}
	public void setSaldo(double saldo) 
	{
		this.saldo = saldo;
	}
	
	public int getSenha() 
	{
		return senha;
	}
	public void setSenha(int senha) 
	{
		this.senha = senha;
	}
	
}
