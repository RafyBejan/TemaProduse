
public class Depozit {
    private Produs[] produse;
    private int numarProduse;

    public Depozit(int capacitateMaxima) {
        this.produse = new Produs[capacitateMaxima];
        this.numarProduse = 0;
    }

    public void adaugaProdus(Produs produs) {
        boolean produsExistent = false;
        
        
        for (int i = 0; i < numarProduse; i++) {
            if (produse[i].getCod() == produs.getCod()) {
                
                produse[i].setCantitate(produse[i].getCantitate() + produs.getCantitate());
                produsExistent = true;
                
            }
        }

        
        if (!produsExistent) {
            if (numarProduse < produse.length) {
                produse[numarProduse] = produs;
                numarProduse++;
            } else {
                System.out.println("Depozitul este plin.");
            }
        }
    }

    public void tiparesteInventar() {
        System.out.println("Inventarul depozitului:");
        for (int i = 0; i < numarProduse; i++) {
            Produs produs = produse[i];
            System.out.println("Cod: " + produs.getCod() + ", Nume: " + produs.getNume() + ", Pret: " + produs.getPret() + ", Cantitate: " + produs.getCantitate());
        }
    }
}
