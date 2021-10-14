/** Ohjelma laskee merkkijonossa olevien numeroiden summan
*Tekijä Jani Rytkönen
* 20.9 2020 */
import java.util.*; //tuodaan Scanner-luokka

public class SummaLaskuri {
	public static void main (String [] args) {
		Scanner lukija = new Scanner(System.in);
		
		String lukujono;
		System.out.println("Syota numeroita 0-9, niin lasken niiden summan: ");
		lukujono = lukija.nextLine();
		int numero = 0, rem = 0, summa = 0;
		numero = Integer.parseInt(lukujono);
		
		while (numero > 0) {
		
			rem = numero%10;
			summa = summa + rem;
			numero = numero / 10;
		}
		System.out.print("lukujonon summa on " + summa);
		
	}
}