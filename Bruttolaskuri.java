/* Ohjelma laskee kustannuksen bruttohinnan
*Tekijä Jani Rytkönen
* 8.9 2020 */
import java.util.*;
public class Bruttolaskuri {
	public static void main (String [] args) {
		Scanner lukija = new Scanner(System.in);
		// muuttujien määrittely
		double nettohinta;
		double alvprosentti;//
		double bruttohinta;
		System.out.print("Anna kustannuksen nettohinta: ");
		nettohinta = lukija.nextDouble();
		System.out.print ("Anna Alv-prosentti : ");
		alvprosentti = lukija.nextDouble();
		bruttohinta = nettohinta * ((100+alvprosentti)/100);
		System.out.println("Kustannuksen bruttohinta on: " + bruttohinta );
	}
	
}