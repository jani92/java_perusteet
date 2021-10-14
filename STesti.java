

public class STesti {
	//main luokka
	public static void main (String[] args) {
		//testaus
		Salasana eka = new Salasana("Salasana12345");
		Salasana toka = new Salasana("12345Salasana");
		System.out.print(eka);
		
		if (eka.kelpaa(eka.sana));{
		System.out.println("Ensimmaisesta: KYLLA!");
		}
		if (toka.kelpaa(eka.sana));{
		System.out.println("Toisesta: EI!");
		}
			
		
				
		
		
		
	
		 
	}
}