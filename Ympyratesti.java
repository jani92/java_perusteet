/**
 *Tekijä Jani Rytkönen
 *10.11.2020
 */
public class Ympyratesti {
public static void main(String[] args) {
 
       
//Asetetaan säde ympyröille 1-4
         Ympyra y1 = new Ympyra(1.0);
		
         Ympyra y2 = new Ympyra(2.0);
		 
		 Ympyra y3 = new Ympyra(3.0);
		 
         Ympyra y4 = new Ympyra(1.0);
		 
		 Ympyra copy;
		 
		 
		 
//string to string lausekkeen tulostus jokaisesta
		
         System.out.println(y1);
         System.out.println(y2);
		 System.out.println(y3);
         System.out.println(y4);
		 
//equals vertailu		 
         if (y1.equals(y2))
            System.out.println("Ympyrat 1 ja 2 samat");
		 if (y2.equals(y3))
            System.out.println("Ympyrat 2 ja 3 samat");
		 if (y3.equals(y4))
            System.out.println("Ympyrat 3 ja 4 samat");
		 if (y4.equals(y1))
            System.out.println("Ympyrat 4 ja 1 samat");
         else
            System.out.println("Kaikki ympyrat erilaisia");
		
//suurempi kuin vertailu		
         if (y1.suurempiKuin(y2))
            System.out.println("Eka suurin");
		else
            System.out.println("Eka ei ole suurin");
		if (y2.suurempiKuin(y3))
            System.out.println("Toka suurin");
		else
            System.out.println("Toka ei ole suurin");
		if (y3.suurempiKuin(y4))
            System.out.println("Kolmas suurin");
		else
            System.out.println("Kolmas ei ole suurin");
		if (y4.suurempiKuin(y1))
            System.out.println("Neljas suurin");
         else
            System.out.println("Neljas ei ole suurin");
		}
    }
