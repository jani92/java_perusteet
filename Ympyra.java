/**
 *Tekijä Jani Rytkönen
 *10.11.2020
 */
import java.util.Scanner;
// ympyra luokan luonti
public class Ympyra {
   private double sade;
   private double PII = Math.PI;
   public Ympyra(double r) {
      sade = r;
	  if (sade < 1.0)
		  System.out.println("Virhe, anna positiviinen desimaaliluku");
   }
   //copy metodi
   public Ympyra copy() {
	   return new Ympyra(sade);
   }
   //setterit ja getterit
   //ympyrän ala
   public double getAla() {
      return PII * sade * sade;
   }
   //ympyrän sade
    public double setSade(double r) {
      return r = sade;
	}
	//ympyrän sade
   public double getSade() {
      return sade;
   }
   //ympyrän halkaisija
	  public double getHalkaisija() {
      return sade*2;
   }
   //ympyrän keha
   	  public double getKeha() {
      return 2*PII*sade;
   }
   //merkkijonoksi muuttaminen
   public String toString() {
      return "Ympyran sade on " + sade + ", pinta-ala on " + getAla() + ", halkaisija on " + getHalkaisija() + " ja keha on " + getKeha();
   }
   //sade vertailu
   public boolean equals(Ympyra y) {
      if (this.sade == y.getSade())
         return true;
      else
         return false;
    }
	//suurempi kuin 
    public boolean suurempiKuin(Ympyra y) {
      if (this.getAla() > y.getAla())
         return true;
      else
         return false;    
    }
	
   } 
