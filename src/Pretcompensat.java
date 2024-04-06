
public class Pretcompensat extends Produs {
     private float coeficient;
     
     public Pretcompensat(int cod, String nume, float pret, int cantitate, float coeficient) {
		super(cod, nume, pret, cantitate);
		this.coeficient = coeficient;
	}

	public  float PretFinal(float coeficient) {
    	 float PretFinal= getPret() * coeficient;
    	 return PretFinal;
     }
     
}
