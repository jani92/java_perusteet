/* Ohjelma kysyy kuusikulmion sivun pituuden ja laskee kuvion alan
*Tekijä Jani Rytkönen
* 15.9 2020 */
import java.util.*;
public class Kuusikulmio {
	public static void main (String [] args) {
	Scanner lukija = new Scanner(System.in);
	
	double sivu;
	System.out.print("Anna kuusikulmion sivun mitta ");
		sivu = lukija.nextDouble();
		double ala = 6* Math.pow(sivu,2)/(4* Math.tan(Math.PI/6));
	System.out.println("Kuusikulmion pinta-ala on: " + ala);
	
	}

}	