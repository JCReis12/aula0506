package auka_0506;

import java.util.ArrayList;
import java.util.Scanner;

public class exc03 {

	public static void main(String[] args) {
		Scanner jc = new Scanner(System.in);
		
		ArrayList<String> ft = new ArrayList<>();
		
		ft.add("Banana");
		ft.add("Morango");
		ft.add("Maçã");
		ft.add("Pera");
		ft.add("Uva");
		ft.add("Goiaba");
		ft.add("Manga");
		ft.add("Abacate");
		ft.add("Abacaxi");
		ft.add("Laranja");
		
	System.out.println("Suas opções de frutas são: ");
	System.out.println(ft);
	
	for (String i : ft) {
		System.out.println(i);
	}
	
	for (int i = 0; i<5; i++) {
		ft.remove(i);
	}
	
	System.out.println("Suas opções de frutas são: ");
	System.out.println(ft);
	
	for (String i : ft) {
		System.out.println(i);
	}
	
	
	
	
	
	
	
	
	
	}
}