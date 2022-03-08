package HerancaPolimorfismo;

public class Cavalo extends Cachorro{
	
	private boolean Correr;

	public boolean getCorrer() {
		return Correr;
	}

	public void setCorrer(boolean correr) {
		this.Correr = correr;
		
	}
	
	public Cavalo () {
		this.nome = "Cavalo";
		this.idade = 4;
		this.som = true;
	}
	
}
