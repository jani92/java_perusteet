/**
 *Tekijä Jani Rytkönen
 *13.11.2020
 */
import java.util.*;
public class Pankkiautomaatti {
public static void main(String[] args) {

		//luodaan 10 tili olioa
		SaastoTili Tili1 = new SaastoTili(100);
		SaastoTili Tili2 = new SaastoTili(100);
		SaastoTili Tili3 = new SaastoTili(100);
		SaastoTili Tili4 = new SaastoTili(100);
		SaastoTili Tili5 = new SaastoTili(100);
		SaastoTili Tili6 = new SaastoTili(100);
		SaastoTili Tili7 = new SaastoTili(100);
		SaastoTili Tili8 = new SaastoTili(100);
		SaastoTili Tili9 = new SaastoTili(100);
		SaastoTili Tili10 = new SaastoTili(100);
		
		//testataan Tili1
		System.out.println(Tili1);
		System.out.println("Talletetaan 20 euroa");
		System.out.println("Talletuksen jalkeen tilin saldo on " + Tili1.getTalleta(20));
		System.out.println("Nostetaan 50 euroa");
		System.out.println("Noston jalkeen tilin saldo on " + Tili1.getNosta(50));
		System.out.println("Yritetaan nostaa 200 euroa");
		System.out.println(Tili1.getNosta(200));
		
		//testataan Tili2
		System.out.println(Tili2);
		System.out.println("Talletetaan 3400 euroa");
		System.out.println("Talletuksen jalkeen tilin saldo on " + Tili2.getTalleta(3400));
		System.out.println("Nostetaan 530 euroa");
		System.out.println("Noston jalkeen tilin saldo on " + Tili2.getNosta(530));
		System.out.println("Haluatko lopettaa istunnon?");
		System.out.println(Tili2.getPoistu());
		
		
	
		
	
		
}

}
    

        
