//Polimorfismul permite o structura mai modulara si mai usor de gestionat.
//Fara polimorfism pentru fiecare tip de produs(compensat si necompensat) ar trebui sa avem metode separate in clasa Depozit pentru a adauga si gestiona aceste produse 
//Mecanismul de adaugare de produse prin care se testeaza daca produsul exista sau nu in depozit
//Parcurge prima data vectorul de produse
//Compara codurile si verifica daca exista
//Actualizeaza cantitatea 
public class Produs {
     private int cod;
     private String nume;
     private float pret;
     private int cantitate;
     
	public Produs(int cod, String nume, float pret, int cantitate) {
		this.cod = cod;
		this.nume = nume;
		this.pret = pret;
		this.cantitate = cantitate;
	}

	public int getCod() {
		return cod;
	}

	public String getNume() {
		return nume;
	}

	public float getPret() {
		return pret;
	}

	public int getCantitate() {
		return cantitate;
	}

	public void setCantitate(int cantitate) {
		this.cantitate = cantitate;
	}
	
	
     
}

