/**
 *Tekijä Jani Rytkönen
 *13.11.2020
 */

//luodaan saastotili luokka
public class SaastoTili {
    private double m_saldo;

    public SaastoTili(double saldo) {
        m_saldo = saldo;
    }
	//tilille tallettaminen
    public double getTalleta(double summa) {
        m_saldo += summa;
        return m_saldo;
    }
	//Tililtä nostaminen
    public double getNosta(double summa) {
        if (summa <= m_saldo) {
            m_saldo -= summa;
            return m_saldo;
        }
        else {
            System.out.println("Tililla ei ole riittavasti katetta.");
            System.out.println("Nostettiin " + m_saldo);
           return m_saldo = 0;           
        }
    }
	//saldon tarkistus
     public double getSaldo() {
        return m_saldo;
		
	//poistuminen
    }   
	 public boolean getPoistu() {
		 System.out.println("Poistutaan sovelluksesta");
        return true;
	//String to String
	 }
	public String toString() {
		 return "Tilin alkusaldo on " + m_saldo;
	}
}