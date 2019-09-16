package combat;

public class CompteurDeTour {
	
	private int nmbrTour;
    
	// -------------------------------------------------------------------------
    public CompteurDeTour() {
    	nmbrTour = 1;
    }

    
    public int getNmbrTour() {
		return nmbrTour;
	}
	public void setNmbrTour(int nmbrTour) {
		this.nmbrTour = nmbrTour;
	}

    // -------------------------------------------------------------------------
    public void augmenteTour() {
        // TODO : Incrémenter le compteur de tour
    	nmbrTour ++;
    }

    // -------------------------------------------------------------------------
    public void afficheTour() {
        // TODO : Afficher le tour actuel, tel que montré dans l'énoncé
    	
    	System.out.println("------------");
    	System.out.println("TOUR ACTUEL: " + nmbrTour);
    	System.out.println("------------");

    }

}
