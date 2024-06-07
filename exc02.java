package auka_0506;
import java.util.ArrayList;
import java.util.Random;

public class exc02 {

	public static void main(String[] args) {
		ArrayList <Integer> numeros = new ArrayList <Integer>();
		Random rd = new Random();
		int sm = 0;
		
		for (int i = 0; i<10; i++) {
			int nNegativo = rd.nextInt(100);
			numeros.add(nNegativo);
			
			if ( nNegativo < 0) {
				sm += 1;
		}
			
		}
	
		for (int i : numeros) {
			System.out.println(i);
		}
	
		System.out.println("Dos números gerados "+sm+" são negativos");
		
	}
	

}
