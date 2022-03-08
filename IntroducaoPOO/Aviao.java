package IntroducaoPOO;

public class Aviao {
	
	//ATRIBUTOS	
		String fabricante;
		String cor;
		String modelo;
		int ano;
		
		//METODO
		public String getFabricante() 
		{
			return fabricante;
		}
		public void setFabricante(String fabricante) 
		{			
			this.fabricante = fabricante;
		}
		
		public String getCor() 
		{
			return cor;
		}
		public void setCor(String cor)
		{
			this.cor = cor;
		}
		
		public String getModelo() 
		{
			return modelo;
		}
		public void setModelo(String modelo)
		{
			this.modelo = modelo;
		}
		
		public int getAno() 
		{
			return ano;
		}
		public void setAno(int ano)
		{
			this.ano = ano;
		}
		
}
