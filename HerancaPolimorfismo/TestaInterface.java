/*Implemente um programa que crie os 3 tipos de animais definidos no exerc�cio
anterior e invoque o m�todo que emite o som de cada um de forma polim�rfica, isto
�, independente do tipo de animal.*/

package HerancaPolimorfismo;

public class TestaInterface {

	public static void main(String[] args) {
		
		Cachorro1 C1 = new Cachorro1();
		Cavalo1 C2 = new Cavalo1();
		Preguica1 P1 = new Preguica1();
		
		C1.setEmiteSom("auauaua");
		C2.setEmiteSom("iiirrrr�");
		P1.setEmiteSom("som de pregui�a");
		
		System.out.println("Som emitido pelo cachorro: " + C1.getEmiteSom());
		System.out.println("Som emitido pelo cavalo: " + C2.getEmiteSom());
		System.out.println("Som emitido pela preguicinha: " + P1.getEmiteSom());
	
	}

}
