
import java.util.*;

public class AsePro {

   private String m_tyyppi;
   private int m_vahinko;
   private String m_bonukset;
	
	public String getTyyppi () {
		return m_tyyppi;
	}
	public int getVahinko () {
		return m_vahinko;
	}
	public String getBonukset () {
		return m_bonukset;
	}
	public void setTyyppi (String tyyppi) {
		m_tyyppi = tyyppi;
	}
	public void setVahinko (int vahinko) {
		m_vahinko = vahinko;
	}
	public void setBonukset (String bonus) {
		m_bonukset = bonus;
	}
	
   
   public void Tiedot() {
  
      Scanner lukija;
	   
      lukija = new Scanner(System.in);
	
	
	  System.out.print("Syota aseen tyyppi: ");
      m_tyyppi = lukija.nextLine();

      System.out.print("Syota aseen vahinko : ");
      m_vahinko = lukija.nextInt();
    
      lukija.nextLine();

      System.out.print("Syota aseen bonukset : ");
      m_bonukset = lukija.nextLine();
   }

   public void Tulostus() {
      System.out.println("Aseen tiedot.");
      System.out.println("Tyyppi: " + m_tyyppi);
      System.out.println("Vahinko: " + m_vahinko);
      System.out.println("Bonukset: " + m_bonukset);
	  System.out.println();
   }
}
