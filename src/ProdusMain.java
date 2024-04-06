
public class ProdusMain {
    public static void main(String[] args) {
     
        Depozit depozit = new Depozit(100);

        
        Produs produs1 = new Pretcompensat(1, "Paine",5, 5, 0.8f); 
        Produs produs2 = new Pretnecompensat(2, "Lapte",8.9f, 3); 
        Produs produs3 = new Pretcompensat(3, "Faina",6.5f, 2, 0.9f); 

        depozit.adaugaProdus(produs1);
        depozit.adaugaProdus(produs2);
        depozit.adaugaProdus(produs3);

        
        depozit.tiparesteInventar();
    }
}

