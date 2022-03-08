package HerancaPolimorfismo;

public class Preguica extends Cachorro{
	
	private boolean SubirArvore;

	public boolean getSubirArvore() {
		return SubirArvore;
	}

	public void setSubirArvore(boolean subirArvore) {
		SubirArvore = subirArvore;
		
	}
	
	public Preguica () {
		this.nome = "Preguiça";
		this.idade = 20;
		this.som = false;
	}
	
}
