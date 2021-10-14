/**
 *Tekijä Jani Rytkönen
 *10.11.2020
 */
public class HTesti {
public static void main(String[] args) {
 
       
//Asetetaan tiedot olioille
         Henkilo y1 = new Henkilo("Ville ", "Koulutie12 ", 23, 0401231231);
		
         Henkilo y2 = new Henkilo("Marko ", "Koivutie33 ", 32, 0403213213);
		 
		
		 
		
		 
		 
		 
//Tulostus ja testaus
		
         System.out.println(y1);
         System.out.println(y2);
		 System.out.println(y2.copy());
		 
		 
//equals vertailu		 
         if (y1.equals(y2))
            System.out.println("Henkilotiedot samat");
		 
         else
            System.out.println("Henkilotiedot erilaiset");
		

		}
    }
