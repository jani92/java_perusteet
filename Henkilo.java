/**
 *Tekijä Jani Rytkönen
 *10.11.2020
 */
import java.util.*;
// Toteutettava luokka.
public class Henkilo {

   
		private String m_nimi;/**yksityinen attribuutti1 */
		private String m_osoite;/**yksityinen attribuutti2 */
		private int m_ika;/**yksityinen attribuutti3 */
		private int m_puh; /**yksityinen attribuutti4 */

   /**
	* Luokan konstruktori
	* @param nimi merkkijonona
	* @param osoite merkkijono
	* @param ika merkkijono
	* @param puh merkkijono
	*/
	 public Henkilo (String nimi, String osoite, int ika, int puh) { 
		
		m_nimi = nimi;
		m_osoite = osoite;
		m_ika = ika;
		m_puh = puh;
	
	//getterit
	/**
	* Palauttaa tiedot
	* @return nimen
	* @return osoitteen
	* @return ian
	* @return puhelinumeron
	*/
	 }
	 public String getNimi(){
		 return m_nimi;
	 }
	 public String getOsoite(){
		 return m_osoite;
	 }
	 public int getIka(){
		 return m_ika;
	 }
	 public int getPuh(){
		 return m_puh;
	 }
	 //setterit
	 /**
	* asettaa tiedot
	*/
	public String setNimi () {
         return m_nimi;
	}
	public String setOsoite () {
         return m_osoite;
	}
	public int setIka () {
         return m_ika;
	}
	public int setPuh () {
         return m_puh;
	}
	//String to String
	/**
	* Palauttaa henkilon tiedot
	* @return tiedot
	*/
	@Override
	public String toString() {
		 return getNimi() + getOsoite() + getIka() + getPuh();
	}
	//equals vertailu
	/**
	* vertailee tietoja
	*/
	public boolean equals(Henkilo y) {
		 if (this.m_nimi == y.getNimi()){
		 return true;}
			else if (this.m_osoite == y.getOsoite()){
			return true;}
				else  if (this.m_ika == y.getIka()){
				return true;}
					else  if (this.m_puh == y.getPuh()){
					return true;}
		 else
			 return false;
	}
	//copy luokka
	/**
	* kopioi olion
	*/
	public Henkilo copy() {
		return new Henkilo(m_nimi, m_osoite, m_ika, m_puh);
	}
	
	
	 
	 }
	 

	 
 