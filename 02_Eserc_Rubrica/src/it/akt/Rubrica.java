package it.akt;

public class Rubrica {

	private Contatto[] contatti;
    private int numeroContatti;  // tiene traccia di quanti contatti sono stati inseriti

    public Rubrica() {
        contatti = new Contatto[20];
        numeroContatti = 0;
    }

    // Metodo per aggiungere un contatto
    public boolean aggiungiContatto(Contatto contatto) {
        if (numeroContatti < contatti.length) {
            contatti[numeroContatti] = contatto;
            numeroContatti++;
            return true;
        } else {
            System.out.println("Rubrica piena, impossibile aggiungere nuovi contatti.");
            return false;
        }
    }

    // Metodo per stampare tutti i contatti
    public void stampaRubrica() {
        System.out.println("Lista contatti nella rubrica:");
        for (int i = 0; i < numeroContatti; i++) {
            contatti[i].stampaContatto();
        }
    }
}
