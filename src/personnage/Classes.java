package personnage;

public class Classes extends Personnage {
	
	private String classe;
	private int numAtk;
	
	public Classes () {
		classe  ="";
		numAtk =0;
	}
	
	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public  Classes(String typeClasse, int numAtk) {
		classe = typeClasse;
		this.numAtk = numAtk;
	}

	public int getNumAtk() {
		return numAtk;
	}

	public void setNumAtk(int numAtk) {
		this.numAtk = numAtk;
	}
	
	

}
