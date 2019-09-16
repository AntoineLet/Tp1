package tp1;
import java.util.Random;
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

       while ((personnage1.getPv() > 0 || personnage2.getPv() > 0) && nmbreTour.getNmbrTour() <= 100)
	   {
    	   		init++;
	        	nmbreTour.afficheTour();
	        	if(init == personnage1.getIni()) {
	        		
	        		personnage1.frapperPersonnage(personnage2);
	        		System.out.println("Nique");
	        	}
	        	if(init == personnage2.getIni()) {
	        		System.out.println("Nique2");
	        	}
	       	 personnage1.afficherInfosPersonnage();
	       	 personnage2.afficherInfosPersonnage();
	       	 nmbreTour.augmenteTour();

	       }
	}

}
