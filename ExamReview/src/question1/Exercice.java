package question1;

/**
 * @author KerKer
 *
 */
public class Exercice {
	protected int niveauDeDifficulte;
	protected String EnonceDeExe;
	protected int typeExe;
	protected String trye;
	public static final int TYPE_EXERCICE_QCM = 1;
	public static final int TYPE_EXERCICE_A_TROU = 2;
	public static final int TYPE_EXERCICE_VRAI_OU_FAUX = 3;
	public static final int TYPE_EXERCICE_AUTRE = 4;
	public int getNiveauDeDifficulte() {
		return niveauDeDifficulte;
	}
	public void setNiveauDeDifficulte(int niveauDeDifficulte) {
		this.niveauDeDifficulte = niveauDeDifficulte;
	}
	public String getEnonceDeExe() {
		return EnonceDeExe;
	}
	public void setEnonceDeExe(String enonceDeExe) {
		EnonceDeExe = enonceDeExe;
	}
	public int getTypeExe() {
		return typeExe;
	}
	public void setTypeExe(int typeExe) {
		this.typeExe = typeExe;
	}
	
	public Exercice(){
		
	}
	public Exercice(int niveau, String enonce, int type){
		niveauDeDifficulte = niveau;
		EnonceDeExe = enonce;
		typeExe = type;
	}
	
	public String toString() {
		return "Exercice [Enonce De l'Exe=" + EnonceDeExe + "]";
	}
	

}
