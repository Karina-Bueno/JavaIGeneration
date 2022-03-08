package HerancaPolimorfismo;

public class AnimalObjeto {

	public static void main(String[] args) {
		
		Cachorro a1 = new Cachorro();
		Cavalo a2 = new Cavalo();
		Preguica p1 = new Preguica();
		
		a1.setNome("Cachorro");
		a1.setIdade(10);
		a1.setSom(true);
		a1.setCorrer(true);
		
		System.out.println("Animal: " + a1.getNome());
		System.out.println("Idade: " + a1.getIdade());
		System.out.println("O animal emite som? " + a1.getSom());
		System.out.println("Ele corre? " + a1.getCorrer());
				
		a2.setNome("Cavalo");
		a2.setIdade(5);
		a2.setSom(true);
		a2.setCorrer(true);
		
		System.out.println("\nAnimal: " + a2.getNome());
		System.out.println("Idade: " + a2.getIdade());
		System.out.println("O animal emite som? " + a2.getSom());
		System.out.println("Ele corre? " + a2.getCorrer());
		
		p1.setNome("Preguiça");
		p1.setIdade(22);
		p1.setSom(false);
		p1.setSubirArvore(true);
		
		System.out.println("\nAnimal: " + p1.getNome());
		System.out.println("Idade: " + p1.getIdade());
		System.out.println("O animal emite som? " + p1.getSom());
		System.out.println("Ele Sobe em árvore? " + p1.getSubirArvore());

	}

}
