package tp1;
import java.util.Random;
import personnage.Personnage;
import combat.CompteurDeTour;
import combat.AffichageEcran;
import java.util.Scanner;

public class JeuGladiateurs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int init = 0;
		CompteurDeTour nmbreTour = new CompteurDeTour();
	
        AffichageEcran affichage = new AffichageEcran();
        Personnage personnage1 = new Personnage("Bob le Malchanceux", 15, 15, 70, 15); //L'initialisation du personnage doit se faire dans le constructeur
        Personnage personnage2 = new Personnage("Igor l'empaleur", 25, 5, 100, 30);
        
        personnage1.afficherInfosPersonnage();
        personnage2.afficherInfosPersonnage();//L'initialisation du personnage doit se faire dans le constructeur
        
        System.out.println("<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>");
        System.out.println(">>>>> Que le combat commence ! <<<<<");
        System.out.println("<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>\n\n\n");

       while (nmbreTour.getNmbrTour() <= 100)
	   {
    	   nmbreTour.afficheTour();
		//personnage1.frapperPersonnage(personnage2); (personnage1.getPv() > 0 || personnage2.getPv() > 0) && 
    	   while(init <= 100 )
    	   {
    		   init++;
    		 
    		   if(init == personnage1.getIni()) 
    		   {
    			   personnage1.frapperPersonnage(personnage2);
	        	}
    		   
	        	if(init == personnage2.getIni()) {
	        		personnage2.frapperPersonnage(personnage1);
	        	}
    	   }
    	   
    	   personnage1.afficherInfosPersonnage();
	       personnage2.afficherInfosPersonnage();
    	   System.out.println("Appuyez sur Entrer pour passer au tour suivant.");
    	   scan.nextLine();
	   }
	}

}
