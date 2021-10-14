/* Ohjelma kysyy euroäärän, jonka purkaa euroiksi ja senteiksi sekä tulostaa sen
*Tekijä Jani Rytkönen
* 21.9 2020 */
import java.util.*;
public class Eurolaskuri {
	public static void main (String [] args) {
		Scanner lukija = new Scanner(System.in);
		
		
		System.out.println("Syota euromaara, niin puran sen euroiksi ja senteiksi");
		String euro = lukija.nextLine();
		int piste = euro.indexOf(".");
		
		System.out.println("maara on "  + euro.substring(0,piste) + " euroa ja " + euro.substring(piste+1) + " senttia");
	}	
}	