package tp1;
import personnage.Personnage;
import combat.CompteurDeTour;
import combat.AffichageEcran;

public class JeuGladiateurs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int init = 0;
		CompteurDeTour nmbreTour = new CompteurDeTour();
	
        AffichageEcran affichage = new AffichageEcran();
        Personnage personnage1 = new Personnage("Bob le Malchanceux", 15, 15, 70, 15); //L'initialisation du personnage doit se faire dans le constructeur
        Personnage personnage2 = new Personnage("Igor l'empaleur", 25, 5, 100, 30);
        
        personnage1.afficherInfosPersonnage();
        personnage2.afficherInfosPersonnage();//L'initialisation du personnage doit se faire dans le constructeur
        
        System.out.println("<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>");
        System.out.println(">>>>> Que le combat commence ! <<<<<");
        System.out.println("<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>");

        while(nmbreTour.getNmbrTour() <= 100)
        {
        
        	
        	nmbreTour.afficheTour();
        	nmbreTour.augmenteTour();
        	if(init == personnage1.getIni()) {
        		System.out.println("Nique");
        	}
        	if(init == personnage2.getIni()) {
        		System.out.println("Nique2");

        	}
        		
        	init++;
        	
        }
	}

}
