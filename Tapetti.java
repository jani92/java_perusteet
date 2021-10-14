

public class Tapetti {
    
    HuoneenMitat mitat;
  
    double nelioHinta;


    public Tapetti(HuoneenMitat mitat, double nelioHinta) {
        this.mitat = mitat;
        this.nelioHinta = nelioHinta;
    }
    public double getNelioHinta() {
        return nelioHinta;
    }
    public void setNelioHinta(double nelioHinta) {
        this.nelioHinta = nelioHinta;
    }
    public double tapetinHinta() {
        return getNelioHinta() * mitat.getAla();
    }
    
}
