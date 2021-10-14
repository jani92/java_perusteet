/* Ohjelma laskee käyttäjän painoindeksin
*Tekijä Jani Rytkönen
* 8.9 2020 */
import java.util.*;
public class Painoindeksi {
	public static void main (String [] args) {
		Scanner lukija = new Scanner(System.in);
		// muuttujien määrittely
		double pituus;
		double paino;//
		double painoindeksi;
		System.out.println("Anna pituutesi metreina: ");
		
		pituus = lukija.nextDouble();
		if(pituus>3)
		System.out.println("Syöte liian iso");
		//	else if(pituus=<0){
		//	System.out.println("Syöte liian pieni");}
		//	else { System.out.println("Syöte hyväksytty");
		//	}
				
			
		System.out.println ("Anna painosi kiloina : ");
		paino = lukija.nextDouble();
		painoindeksi = paino / (pituus*pituus);
		System.out.println("painoindeksisi on: " + painoindeksi );
	}
	
}