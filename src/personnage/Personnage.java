package personnage;
import java.util.Random;

public class Personnage {
	
	private String nomPers;
	private int attaqueMax, defense, pv, ini;
	private boolean statut;	
	// -------------------------------------------------------------------------
    public Personnage(String nom, int attaqueMax, int defense, int pvs, int ini) {
    	nomPers = nom;
    	this.attaqueMax = attaqueMax;
    	this.defense = defense;
    	pv = pvs;
    	this.ini= ini;
    	statut = true;
    }

    public String getNomPers() {
		return nomPers;
	}
	public void setNomPers(String nomPers) {
		this.nomPers = nomPers;
	}

	public int getAttaqueMax() {
		return attaqueMax;
	}
	public void setAttaqueMax(int attaqueMax) {
		this.attaqueMax = attaqueMax;
	}

	public int getDefense() {
		return defense;
	}
	public void setDefense(int defense) {
		this.defense = defense;
	}

	public int getPv() {
		return pv;
	}
	public void setPv(int pv) {
		this.pv = pv;
	}

	public int getIni() {
		return ini;
	}
	public boolean isStatut() {
		return statut;
	}

	public void setStatut(boolean statut) {
		this.statut = statut;
	}

	public void setIni(int ini) {
		this.ini = ini;
	}
	

	// -------------------------------------------------------------------------
    public Personnage() {
    	nomPers = "";
    	attaqueMax = 0;
    	defense = 0;
    	pv = 0;
    	ini = 0;
    }

    public void afficherInfosPersonnage(String classe) {
    	System.out.println(nomPers);
    	System.out.println("\t" + "Attaque: " + attaqueMax);
    	System.out.println("\t" + "Defense: " + defense);
    	System.out.println("\t" + "Point de vie: " + pv);
    	System.out.println("\t" + "Initiative: " + ini);
    	
    	String valStatut;
    	if (statut == true)
    		{ valStatut = "Vivant";}
    	else
    		{valStatut = "Mort";}
    		
    	System.out.println("\t" + "Statut: " + valStatut );
    	System.out.println("\t" + "Classe: " + classe);
    	System.out.println("");
    	

    }

    // -------------------------------------------------------------------------
    private int attaqueCalcul() {
        // Cette valeur est trouvÃ©e alÃ©atoirement et doit se situer entre ZÃ‰RO et valeurMaxAttaque.
    	Random randAtk = new Random();
    	int atk = randAtk.nextInt(attaqueMax - 1) +1;
    	
    	
        return atk;
    }

    // -------------------------------------------------------------------------
    public void frapperPersonnage(Personnage personnageCible, boolean Tour, Classes classe) {
    	
    	if (classe.getClasse() == "Mirmillon")
    	{
    		for(int nmbrAtk = 0; nmbrAtk<2; nmbrAtk++)
    		{
    			classe.setNumAtk(nmbrAtk);
    			if(nmbrAtk ==1)
    				System.out.println(this.nomPers + " attaque de nouveau.\n");
		    	int valAtk = attaqueCalcul();
		    	int Def = personnageCible.getDefense();
		    	System.out.println(this.nomPers + " attaque avec une puissance de: " + valAtk);
		    	System.out.println(personnageCible.getNomPers() + " à une défense de: " + Def);
		    	int dmgSubis = valAtk - Def;   
		    	if(dmgSubis > 0)
		    	{
		    		personnageCible.setPv(personnageCible.getPv() - dmgSubis);
		    		
		    		System.out.println("Les dommages subis sont donc de: " + dmgSubis + "\n");
		    	}
		    	else {
		    		System.out.println(personnageCible.getNomPers() + " ne subit aucun dégat.\n");
		    		}
    		}
    	}
    	else if(classe.getClasse() == "Rétiaire") {
    		
    		if(Tour == false){
    			System.out.println(nomPers + " lance son filet");
    			Random Filet = new Random();
    			int oneShot = Filet.nextInt(100 - 1) +1;
    			if (oneShot <=10) {
    				System.out.println("Son filet attrape " + personnageCible.getNomPers() + " et il l'empalle sauvagement avec sa lance.\n");
    				personnageCible.setPv(0);
    			}	
    			else System.out.println("Le filet n'atteint pas sa cible.\n");
    		
    		}
    		else {
    			System.out.println("Bob le malhanceux rattrape son filet et en profite pour attaquer.\n");
    			int valAtk = attaqueCalcul();
    	    	int Def = personnageCible.getDefense();
    	    	System.out.println(this.nomPers + " attaque avec une puissance de: " + valAtk);
    	    	System.out.println(personnageCible.getNomPers() + " à une défense de: " + Def);
    	    	int dmgSubis = valAtk - Def;   
    	    	if(dmgSubis > 0)
    	    	{
    	    		personnageCible.setPv(personnageCible.getPv() - dmgSubis);
    	    		
    	    		System.out.println("Les dommages subis sont donc de: " + dmgSubis + "\n");
    	    	}
    	    	else {
    	    		System.out.println(personnageCible.getNomPers() + " ne subit aucun dégat.\n");
    	    		}
    		}
    	}
    	
    }

    // -------------------------------------------------------------------------
    public void setNewIniRandom(Classes classe) {
       
    	if (classe.getClasse() == "Mirmillon") {
    	Random randIni = new Random();
    	ini = randIni.nextInt(30 - 1) + 1;
    	}
    	
    	else if(classe.getClasse() == "Rétiaire") {
    		Random randIni = new Random();
        	ini = randIni.nextInt(100 - 1) + 1;
        	
    	}
    }
}
