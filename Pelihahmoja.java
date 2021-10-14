
import java.util.*;


public class PeliHahmoja {

   private String m_nimi;
   private HahmoPro m_hahmo = new HahmoPro(); 
                                                      
   private String m_sukupuoli;
   private int m_ika;
   private AsePro m_ase = new AsePro(); 		    	      
                                                     
													 
   public String getNimi () {
	   return m_nimi;
   }
   public String getSukupuoli () {
	   return m_sukupuoli;
   }
   public int getIka () {
	   return m_ika;
   }
   public AsePro getAsePro () {
	   
	   return m_ase;
   }
   public HahmoPro getHahmoPro () {
	   
	   return m_hahmo;
   }
   public void setNimi (String nimi) {
	   m_nimi = nimi;
   }
   public void setSukupuoli (String sukupuoli) {
	   m_sukupuoli = sukupuoli;
   }
   public void setIka (int ika) {
	   m_ika = ika;
   }
   public void setAsePro (AsePro ase) {
	   m_ase = ase;
   }
   public void setHahmoPro (HahmoPro hahmo) {
	   m_hahmo = hahmo;
   }
 
 
   public void Tiedot() {

      Scanner lukija;
	  
      
      lukija = new Scanner(System.in);

      System.out.print("Syota hahmon nimi: ");
      m_nimi = lukija.nextLine();

      m_hahmo.Tiedot();

      System.out.print("Syota sukupuoli: ");
      m_sukupuoli = lukija.nextLine();

      System.out.print("Syota ika: ");
      m_ika = lukija.nextInt();
      lukija.nextLine();

      m_ase.Tiedot();
   }

   public void Tulostus() {
	   
      System.out.println("Pelihahmon tiedot.");
      System.out.println("Hahmon nimi:" + m_nimi);
      m_hahmo.Tulostus();
      System.out.println("Sukupuoli: " + m_sukupuoli);
      System.out.println("Ika: " + m_ika);
      m_ase.Tulostus();
	  System.out.println();
   }
}
