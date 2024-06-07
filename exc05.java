package auka_0506;

import java.util.Scanner;
import java.util.ArrayList;

public class exc05 {

	public static void main(String[] args) {
		Scanner jc = new Scanner(System.in);
		
		ArrayList<String> ingd = new ArrayList<>();
		int opa, opi, opr;
		
		ingd.add("Açaí Tradicional");
		ingd.add("Açaí c/ Banana");
		ingd.add("Açaí c/ Guaraná");
		ingd.add("Açaí c/ Cupuaçú");
		ingd.add("Banana");
		ingd.add("Leite condensado");
		ingd.add("Granola");
		ingd.add("Morango");
		ingd.add("Kiwi");
		ingd.add("Leite em pó");
		
		System.out.println("                       🍨 AÇAÍ DA DHARA 🍨");
		System.out.println(" ");
		
	System.out.println("[1] "+ingd.get(0));
	System.out.println("[2] "+ingd.get(1));
	System.out.println("[3] "+ingd.get(2));
	System.out.println("[4] "+ingd.get(3));
	System.out.println(" ");
	System.out.println("Qual o tipo de açaí você deseja?");
	opa = jc.nextInt();
	
	if (opa == 1) {
		System.out.println(ingd.get(0)+" selecionado!");
	}
	if (opa == 2) {
		System.out.println(ingd.get(1)+" selecionado!");
	}
	if (opa == 3) {
		System.out.println(ingd.get(2)+" selecionado!");
	}
	if (opa == 4) {
		System.out.println(ingd.get(3)+" selecionado!");
	}
	System.out.println("____________________________________");
		
	System.out.println(" ");
	System.out.println("Lista de ingredientes:");
	System.out.println(" ");
	System.out.println("[1] "+ingd.get(4));
	System.out.println("[2] "+ingd.get(7));
	System.out.println("[3] "+ingd.get(8));
	System.out.println("[4] "+ingd.get(5));
	System.out.println("[5] "+ingd.get(9));
	System.out.println("[6] "+ingd.get(6));
	System.out.println(" ");
	System.out.println("Deseja retirar algo?");
	System.out.println("[1] Sim");
	System.out.println("[2] Não");
	System.out.println(" ");
	opr = jc.nextInt();
	
	if (opr == 2) {
		System.out.println("____________________________________");
		System.out.println(" ");
		System.out.println("Compra efetuada!");
	}
	if (opr == 1) {
		System.out.println("Qual o item que deseja tirar? (Digite o número conrrespondente)");
		
		if (opa == 1) {
			
		}
	
	}
	
	
	
	
	
	
	
	
	
	}

}
