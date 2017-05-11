package question1;

/**
 * @author KerKer
 *
 */
public class ExerciceATrou extends Exercice {
	private String bonneRep;
	private String finEnon;
	public String getBonneRep() {
		return bonneRep;
	}
	public void setBonneRep(String bonneRep) {
		this.bonneRep = bonneRep;
	}
	public String getFinEnon() {
		return finEnon;
	}
	public void setFinEnon(String finEnon) {
		this.finEnon = finEnon;
	}
	public ExerciceATrou(){
		super();
	}
	
	public ExerciceATrou(int niveau, String enonce, String bonneRep, String finEnon) {
		super();
		niveauDeDifficulte = niveau;
		EnonceDeExe = enonce;
		this.bonneRep = bonneRep;
		this.finEnon = finEnon;
	}
	public String toString(){
		return EnonceDeExe + " " + bonneRep + " " + finEnon;
	}
	/**
	 * @param otherString : La string que vous voulez comparez avec la bonne r�ponse
	 * @methods equalsIgnoreCase : Est utilis�e pour comparer les deux string sans tenir compte des majuscules ou mini.
	 * @return true : Va retourner si la string qu'on compare est bien �gale avec la bonne r�ponse
	 * @return false : va retourner faux si le if n'�tait pas vrai. Si jamais il l'est, vu qu'il y a le return, la method s'ach�ve.
	 */
	public boolean verif(String otherString){
		if (this.bonneRep.equalsIgnoreCase(otherString)) return true;
		return false;
	}
	
	

}
