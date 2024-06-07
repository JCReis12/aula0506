package auka_0506;

import java.util.ArrayList;
import java.util.Scanner;

public class exc04 {

	public static void main(String[] args) {
		Scanner jc = new Scanner(System.in);
		
		ArrayList<String> carros = new ArrayList<>();
		int slc;
		
		carros.add("Opala Comodoro");
		carros.add("Fusca");
		carros.add("Porsche 911");
		carros.add("Ferrari Venom");
		carros.add("BMW X6");
		carros.add("Escort GL Turbo");
		carros.add("Impala 95");
		carros.add("Audi Q3");
		carros.add("Lamborghini Urus");
		carros.add("Opala Diplomata");
		
	System.out.println("Opções de carros: ");
	System.out.println(carros);
	System.out.println("Qual carro você tem interesse?");
	slc = jc.nextInt();
	
	if (slc == 1) {
		System.out.println(carros.get(0)+": R$56.250");
	}
	if (slc == 2) {
		System.out.println(carros.get(1)+": R$25.000");
	}
	if (slc == 3) {
		System.out.println(carros.get(2)+": R$835.000");
	}
	if (slc == 4) {
		System.out.println(carros.get(3)+": R$15.500.000");
	}
	if (slc == 5) {
		System.out.println(carros.get(4)+": R$820.900");
	}
	if (slc == 6) {
		System.out.println(carros.get(5)+": R$10.700");
	}
	if (slc == 7) {
		System.out.println(carros.get(6)+": R$57.300");
	}
	if (slc == 8) {
		System.out.println(carros.get(7)+": R$296.900");
	}
	if (slc == 9) {
		System.out.println(carros.get(8)+": R$4.100.000");
	}
	if (slc == 10) {
		System.out.println(carros.get(9)+": R$48.750");
	}
		
	}

}
