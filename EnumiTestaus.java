/**
 *Tekijä Jani Rytkönen
 *12.11.2020
 */
class EnumiTestaus{
	//luodaan luokka
enum Paiva{ 
MAANANTAI(1), TIISTAI(2), KESKIVIIKKO(3), TORSTAI(4), PERJANTAI(5), LAUANTAI(6), SUNNUNTAI(7); 
//arvojen määrittely
private int value;
private Paiva(int value){
this.value=value;
}
}
//main metodi ja testaus
public static void main(String args[]){
Paiva p1 = Paiva.MAANANTAI;
Paiva p2 = Paiva.TIISTAI;
Paiva p3 = Paiva.KESKIVIIKKO;
Paiva p4 = Paiva.TORSTAI;
Paiva p5 = Paiva.PERJANTAI;
Paiva p6 = Paiva.LAUANTAI;
Paiva p7 = Paiva.SUNNUNTAI;

//toiminnan testaaminen
System.out.println(p1 + " on sateinen /" + " paivan nro: " + p1.value);
System.out.println(p2 + " on aurinkoinen /" + " paivan nro: " + p2.value);
System.out.println(p3 + " on myrskyinen /" + " paivan nro: " + p3.value);
System.out.println(p4 + " on pilvinen /" + " paivan nro: " + p4.value);
System.out.println(p5 + " on puolipilvinen /" + " paivan nro: " + p5.value);
System.out.println(p6 + " on poutainen /" + " paivan nro: " + p6.value);
System.out.println(p7 + " on lumisateinen /" + " paivan nro: " + p7.value);

}}
