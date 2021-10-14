/* Ohjelma kysyy asiakkaan nimen ja iän ja tulostaa sen.
*Tekijä Jani Rytkönen
* 8.9 2020 */
import java.util.*;
public class Asiakasrekisteri {
	public static void main (String [] args) {
		Scanner lukija = new Scanner(System.in);
		// muuttujien määrittely
		String nimi;
		int ika;//
		System.out.print("Anna etu- ja sukunimesi: ");
		nimi = lukija.nextLine();
		System.out.print ("Anna ikavuodet: ");
		ika = lukija.nextInt();
		System.out.println("Syotetty tiedot asiakkaasta " + nimi + " ,joka on " + ika + " vuotta vanha " );
	}
	
}