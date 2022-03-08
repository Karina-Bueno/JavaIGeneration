package HerancaPolimorfismo;

public class Cachorro extends Animal {
	
	private boolean Correr;

	public boolean getCorrer() {
		return Correr;
	}

	public void setCorrer(boolean correr) {
		this.Correr = correr;
		
	}
	
	public Cachorro () {
		this.nome = "Cachorro";
		this.idade = 10;
		this.som = true;
	}
	
}
