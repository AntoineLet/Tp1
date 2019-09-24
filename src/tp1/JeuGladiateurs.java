package tp1;
import java.util.Random;
import personnage.Personnage;
import combat.CompteurDeTour;
import combat.AffichageEcran;
import java.util.Scanner;
import personnage.Classes;

public class JeuGladiateurs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int init = 0;
		Boolean typeTour;
		String persWin = null;
		CompteurDeTour nmbreTour = new CompteurDeTour();
	
        AffichageEcran affichage = new AffichageEcran();
        Personnage personnage1 = new Personnage("Bob le Malchanceux", 15, 15, 70, 15); //L'initialisation du personnage doit se faire dans le constructeur
        Personnage personnage2 = new Personnage("Igor l'empaleur", 25, 5, 100, 30);
        
        Classes classe1 = new Classes("Mirmillon",1);
        Classes classe2 = new Classes ("Rétiaire",1);

        personnage1.afficherInfosPersonnage(classe1.getClasse());
        personnage2.afficherInfosPersonnage(classe2.getClasse());//L'initialisation du personnage doit se faire dans le constructeur
        
        System.out.println("<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>");
        System.out.println(">>>>> Que le combat commence ! <<<<<");
        System.out.println("<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>\n\n\n");

       
	   while(personnage1.isStatut() == true && personnage2.isStatut() == true)
	   {
		   
    	   init = 0;
    	   nmbreTour.afficheTour();
    	   if (nmbreTour.getNmbrTour()%2 == 0)
    		   typeTour = true;
    	   else typeTour = false;
    		   
    	   //personnage1.frapperPersonnage(personnage2); (personnage1.getPv() > 0 || personnage2.getPv() > 0) && 
		   while(init <= 100 )
		   {
			   	init++;
		    		 
		    	if(init == personnage1.getIni() && personnage1.getPv() > 0) 
		    	{
		    		personnage1.frapperPersonnage(personnage2, typeTour, classe1);  
		    		if (personnage2.getPv() <= 0) {
		    			personnage2.setStatut(false);
		    			persWin = personnage1.getNomPers();}
		    		
			    }
		    		   
			    if(init == personnage2.getIni() && personnage2.getPv() > 0) {
			   		personnage2.frapperPersonnage(personnage1, typeTour, classe2);
			   		if (personnage1.getPv() <= 0){
		    			personnage1.setStatut(false);
		    			persWin = personnage2.getNomPers();}
			    }
		    }
		    	   
		   	personnage1.afficherInfosPersonnage(classe1.getClasse());
			personnage2.afficherInfosPersonnage(classe2.getClasse());
		    System.out.println("Appuyez sur Entrer pour passer au tour suivant.");
		    scan.nextLine();
		    nmbreTour.augmenteTour();
		    affichage.afficherSeparateurDeTour();
		    
		    personnage1.setNewIniRandom(classe1);
		    personnage2.setNewIniRandom(classe2);

	    }
	   affichage.afficherSeparateurDeTour();
       //
	   //System.out.println("Fin du combat: " + persWin + " est sorti victorieux");
        affichage.afficheVictoire(personnage1, personnage2, classe1);
       
	}

}
