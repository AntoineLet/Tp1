package combat;

import personnage.Personnage;

public class AffichageEcran {
	
	private String oui;
	// -------------------------------------------------------------------------
    public void afficherSeparateurDeTour() {
        // TODO : Afficher un retour à la ligne, suivi d'une ligne d'astérisques, tel que montré dans l'énoncé
    	System.out.println();
    	for(int i = 0; i<31; i++)
    	System.out.print("*");
    }

    // -------------------------------------------------------------------------
    public void afficherSeparateurInfosPerso() {
        // TODO : Afficher un retour à la ligne, suivi du séparateur "infos personnages", tel que montré dans l'énoncé
    	System.out.println("");
    }

    // -------------------------------------------------------------------------
    public void afficheVictoire(Personnage personnage1, Personnage personnage2) {
        // TODO : Afficher le gagnant du combat, tel que montré dans l'énoncé
    }

}
