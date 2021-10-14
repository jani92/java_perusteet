
import java.util.*;

public class HahmoPro {

   private String m_nimi;
   private int m_taso;
   private String m_taidot;

	public String getNimi () {
		return m_nimi;
	}
	public int getTaso () {
		return m_taso;
	}
	public String getTaidot () {
		return m_taidot;
	}
	public void setNimi (String nimi) {
		m_nimi = nimi;
	}
	public void setTaso (int taso) {
		m_taso = taso;
	}
	public void setTaidot (String taidot) {
		m_taidot = taidot;
	}
  
  
   void Tiedot() {

      Scanner lukija;
      lukija = new Scanner(System.in);
	  
      System.out.print("Syota hahmoluokan nimi: ");
      m_nimi = lukija.nextLine();

      System.out.print("Syota hahmon taso: ");
      m_taso = lukija.nextInt();
      
      lukija.nextLine();

      System.out.print("Syota taidot (pilkulla eroteltuina): ");
      m_taidot = lukija.nextLine();
   }

   void Tulostus() {
      System.out.println("Hahmoluokan tiedot.");
      System.out.println("Luokan nimi: " + m_nimi);
      System.out.println("Taso: " + m_taso);
      System.out.println("Taidot: " + m_taidot);
	  System.out.println();
   }
}