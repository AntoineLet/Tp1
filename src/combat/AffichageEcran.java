package combat;

import personnage.Personnage;
import personnage.Classes;

public class AffichageEcran {
	
	private String oui;
	// -------------------------------------------------------------------------
    public void afficherSeparateurDeTour() {
        // TODO : Afficher un retour à la ligne, suivi d'une ligne d'astérisques, tel que montré dans l'énoncé
    	System.out.println("\n\n");
    	for(int i = 0; i<51; i++)
    	System.out.print("*");
    	System.out.println("\n\n");
    }

    // -------------------------------------------------------------------------
    public void afficherSeparateurInfosPerso() {
        // TODO : Afficher un retour à la ligne, suivi du séparateur "infos personnages", tel que montré dans l'énoncé
    	System.out.println("");
    }

    // -------------------------------------------------------------------------
    public void afficheVictoire(Personnage personnage1, Personnage personnage2, Classes classe1) {
    	
    	if (personnage1.isStatut() == false) {
    		if(classe1.getNumAtk()==1)
    			
    			System.out.println(personnage1.getNomPers() + " d�capite son adversaire et gagne le combat");
    		else
        	System.out.println("Fin du combat: " + personnage2.getNomPers() + " est sorti victorieux.\n");

    	}
    	if (personnage2.isStatut() == false) {
        	System.out.println("Fin du combat: " + personnage1.getNomPers() + " est sorti victorieux.\n");

    	}
    	
    	
    }

}
