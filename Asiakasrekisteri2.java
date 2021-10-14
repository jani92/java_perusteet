/* Ohjelma kysyy asiakkaan nimen, iän ja ajokortin tulostaa sen.
*Tekijä Jani Rytkönen
* 13.9 2020 */
import java.util.*;
public class Asiakasrekisteri2 {
	public static void main (String [] args) {
		Scanner lukija = new Scanner(System.in);
		// muuttujien määrittely
		String nimi;
		int ika;//
		System.out.print("Anna etu- ja sukunimesi: ");
		nimi = lukija.nextLine();
		System.out.print ("Anna ikavuodet: ");
		ika = lukija.nextInt();
		System.out.print("Onko sinulla ajokortti (k/e): ");

		char vastaus = lukija.next().charAt(0);

		if (vastaus=='k' || vastaus=='K');

		else if (vastaus=='e' || vastaus=='E');

		else 

		System.out.print("Virheellinen syote - pitaa olla k tai e");
		String kylla;
		kylla = "jolla on ajokortti";
		if (vastaus=='k' || vastaus=='K');
		
		else if (vastaus=='e' || vastaus=='E');
		kylla = "jolla ei ole ajokorttia";
	

		System.out.println ("Syotetty tiedot asiakkaasta: " + nimi + ", joka on " + ika + " vuotta vanha " + kylla);

	}	

	

}	