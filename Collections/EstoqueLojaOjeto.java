package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class EstoqueLojaOjeto {

	public static <Estoque> void main(String[] args) {


		EstoqueLoja E1 = new EstoqueLoja("Têns", 299.99, 1);
		EstoqueLoja E2 = new EstoqueLoja("Meia", 19.90, 2);
		EstoqueLoja E3 = new EstoqueLoja("Calça Espotiva", 60.49, 1);
		
		ArrayList<EstoqueLoja> EstoqueLoja = new ArrayList();	
		EstoqueLoja.add(E1);
		EstoqueLoja.add(E2);
		EstoqueLoja.add(E3);
		
		System.out.println(EstoqueLoja);

	}

}

