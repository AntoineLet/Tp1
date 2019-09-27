package
combat;

import personnage.Personnage;
import personnage.Classes;

public class AffichageEcran {
	
	private String oui;
	// -------------------------------------------------------------------------
    public void afficherSeparateurDeTour() {
    	System.out.println("\n\n");
    	for(int i = 0; i<51; i++)
    	System.out.print("*");
    	System.out.println("\n\n");
    }

    // -------------------------------------------------------------------------
    public void afficherSeparateurInfosPerso() {
    	System.out.println("");
    }

    // -------------------------------------------------------------------------
    public void afficheVictoire(Personnage personnage1, Personnage personnage2, Classes classe1) {
    	
    	if (personnage2.isStatut() == false) {
    		if(classe1.getNumAtk()==1)
    			
    			System.out.println(personnage1.getNomPers() + " décapite son adversaire et gagne le combat");
    		else
        	System.out.println("Fin du combat: " + personnage1.getNomPers() + " est sorti victorieux.\n");

    	}
    	else if (personnage1.isStatut() == false) {
        	System.out.println("Fin du combat: " + personnage2.getNomPers() + " est sorti victorieux.\n");

    	}
    	
    	
    }

}
