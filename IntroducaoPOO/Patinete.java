/*Crie uma classe patinete e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto patinete, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

package IntroducaoPOO;

public class Patinete {
	
	private String tipo;
	private double valor; 
	
	
	public String getTipo()
	{
		return tipo;
	}
	public void setTipo(String tipo)
	{
		this.tipo = tipo;
	}

	public double getValor() 
	{
		return valor;
	}
	public void setValor(double valor)
	{
		this.valor = valor;
	}
	
}
