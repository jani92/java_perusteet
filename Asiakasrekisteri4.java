/* Ohjelma kysyy asiakkaan nimen, iän ja ajokortin tulostaa sen.
*Tekijä Jani Rytkönen
* 21.9 2020 */
import java.util.*;
public class Asiakasrekisteri4 {
	public static void main (String [] args) {
		Scanner lukija = new Scanner(System.in);
		StringBuffer tiedot = new StringBuffer();
		
		tiedot.append("Syotetty tiedot asiakkaasta ");
		System.out.print("Anna etu- ja sukunimesi: ");
		tiedot.append(lukija.nextLine());
		tiedot.append(", joka on ");
		System.out.print("Anna ikavuodet: ");
		tiedot.append(lukija.nextLine());
		tiedot.append(" vuotta vanha ja ");
		System.out.print("Onko sinulla ajokortti (k/e): ");

		
		char vastaus = lukija.next().charAt(0);
		switch (vastaus){
			case 'k' : 
			case 'K' : 
				tiedot.append("jolla on ajokortti.");
				break;	
			case 'e' : 
			case 'E' : 
				tiedot.append("jolla ei ole ajokorttia.");
				break;	
			default:
				System.out.print("Virheellinen syote - pitaa olla k tai e");		
		}
			System.out.println(tiedot);	
		
		
			

	}		

}	