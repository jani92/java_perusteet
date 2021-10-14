/* Ohjelma kysyy asiakkaan palautetta välillä 1-5 ja tulostaa vastaavan kirjallisen palautteen
*Tekijä Jani Rytkönen
* 13.9 2020 */
import java.util.*;
public class Asiakaspalaute {
	public static void main (String [] args) {
		Scanner lukija = new Scanner(System.in);
		System.out.print("Anna palveluistamme arvosana valilla 0-5: ");
		char vastaus = lukija.next().charAt(0);
		switch (vastaus){
			case '0' :
				System.out.print("Palaute oli huonoa");
				break;			
			case '1' : 
				System.out.print("Palaute oli kohtalaista");
				break;	
			case '2' : 
				System.out.print("Palaute oli tyydyttavaa");
				break;
			case '3' :
				System.out.print("Palaute oli hyvaa");
				break;			
			case '4' :
				System.out.print("Palaute oli kiitettavaa");
				break;
			case '5' : 
				System.out.print("Palaute oli erinomaista");
				break;	
			default:
				System.out.print("Virheellinen syote - pitaa olla numeroina 0-5");
		}
			
		
	}	
	
}	