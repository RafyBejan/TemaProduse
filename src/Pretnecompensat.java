
public class Pretnecompensat extends Produs {

	public Pretnecompensat(int cod, String nume, float pret, int cantitate) {
		super(cod, nume, pret, cantitate);
	}
	public float necompnesat() {
		return getPret();
	}
		
	

}
