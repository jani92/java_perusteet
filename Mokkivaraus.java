/* Ohjelma kysyy kayttajalta numeron 1-12 ja tulostaa sita vastaavan kuukauden
*Tekijä Jani Rytkönen
* 13.9 2020 */
import java.util.*;
public class Mokkivaraus {
	public static void main (String [] args) {
		Scanner lukija = new Scanner(System.in);
		// muuttujien määrittely
		System.out.print("Anna numero valilla 1-12, niin tulostan sita vastaavan kuukauden: ");
		int vastaus = lukija.nextInt();//

		switch(vastaus){
			case 1 :
			System.out.println("Tammikuu ");
			break;
			case 2 :
			System.out.println("Helmikuu ");
			break;
			case 3 :
			System.out.println("Maaliskuu ");
			break;
			case 4 :
			System.out.println("Huhtikuu ");
			break;
			case 5 :
			System.out.println("Toukokuu ");
			break;
			case 6 :
			System.out.println("Kesakuu ");
			break;
			case 7 :
			System.out.println("Heinakuu ");
			break;
			case 8 :
			System.out.println("Elokuu ");
			break;
			case 9 :
			System.out.println("Syyskuu ");
			break;
			case 10 :
			System.out.println("Lokakuu ");
			break;
			case 11 :
			System.out.println("Marraskuu ");
			break;
			case 12 :
			System.out.println("Joulukuu ");
			break;
			default:
				System.out.println("Virheellinen syote, pitaa olla numeroina valilla 1-12 ");
		}
	}
}