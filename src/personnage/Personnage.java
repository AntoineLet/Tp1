package personnage;
import java.util.Random;

public class Personnage {
	
	private String nomPers;
	private int attaqueMax, defense, pv, ini;
	private boolean statut;	
	// -------------------------------------------------------------------------
    public Personnage(String nom, int attaqueMax, int defense, int pvs, int ini) {
        // TODO : Constructeur AVEC paramètres
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
	public void setIni(int ini) {
		this.ini = ini;
	}
	

	// -------------------------------------------------------------------------
    public Personnage() {
        // TODO : Constructeur SANS paramètres qui initialise à ZÉRO ou à ""
    	nomPers = "";
    	attaqueMax = 0;
    	defense = 0;
    	pv = 0;
    	ini = 0;
    }

    public void afficherInfosPersonnage() {
        // TODO : Afficher les infos du personnage, tel que montré dans l'énoncé
    	System.out.println(nomPers);
    	System.out.println("\t" + "Attaque: " + attaqueMax);
    	System.out.println("\t" + "Defense: " + defense);
    	System.out.println("\t" + "Point de vie: " + pv);
    	System.out.println("\t" + "Initiative: " + ini);
    	String valStatut;
    	if (statut = true)
    		{ valStatut = "Vivant";}
    	else
    		{valStatut = "mort";}
    		
    	System.out.println("\t" + "Statut: " + valStatut );
    	System.out.println("");
    	

    }

    // -------------------------------------------------------------------------
    private int attaqueCalcul() {
        // TODO : Retourner la valeur de l'attaque du personnage.
        // Cette valeur est trouvée aléatoirement et doit se situer entre ZÉRO et valeurMaxAttaque.
    	Random rand = new Random();
    	int atk = rand.nextInt(attaqueMax - 1) +1;
    	
    	
        return atk;
    }

    // -------------------------------------------------------------------------
    public void frapperPersonnage(Personnage personnageCible) {

    	int valAtk = attaqueCalcul();
    	int Def = personnageCible.getDefense();
    	System.out.println(this.nomPers + " attaque avec une puissance de: " + valAtk);
    	System.out.println(personnageCible.getNomPers() + " � une d�fense de: " + Def);
    	int dmgSubis = valAtk - Def;
    	System.out.println("Les dommages subis sont donc de: " + dmgSubis + "\n");
    	
    	if(dmgSubis > 0)
    	{
    		//System.out.println(personnageCible.getPv());
    		personnageCible.setPv(personnageCible.getPv() - dmgSubis);
    		//System.out.println(personnageCible.getPv());
    	}
    	
    }

    // -------------------------------------------------------------------------
    public void setNewIniRandom() {
        // TODO : Modifier de façon aléatoire la valeur INI du personnage.
    }
}
