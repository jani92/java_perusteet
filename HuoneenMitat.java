
public class HuoneenMitat {

    private double leveys;
    private double korkeus;

    public HuoneenMitat(double leveys, double korkeus) {
        this.leveys = leveys;
        this.korkeus = korkeus;
    }
    public double getLeveys() {
        return leveys;
    }
    public double getKorkeus() {
        return korkeus;
    }
    public void setLeveys(double leveys) {
        this.leveys = leveys;
    }
    public void setKorkeus(double korkeus) {
        this.korkeus = korkeus;
    }
    public double getAla() {
        return getLeveys() * getKorkeus();
    }
}