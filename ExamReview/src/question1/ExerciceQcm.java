package question1;

/**
 * @author KerKer
 *
 */
public class ExerciceQcm extends Exercice {
	private int nbPropo;
	private String[] tabPropo;
	private int indiceBonneRep;
	
	public static final int TYPE_VRAI_FAUX = 1;
	public static final int TYPE_FAUX_VRAI = 2;
	public static final int TYPE_OUI_NON = 3;
	public static final int TYPE_NON_OUI = 4;
	public int getNbPropo() {
		return nbPropo;
	}
	public void setNbPropo(int nbPropo) {
		this.nbPropo = nbPropo;
	}
	public String[] getTabPropo() {
		return tabPropo;
	}
	public void setTabPropo(String[] tabPropo) {
		this.tabPropo = tabPropo;
	}
	public int getIndiceBonneRep() {
		return indiceBonneRep;
	}
	public void setIndiceBonneRep(int indiceBonneRep) {
		this.indiceBonneRep = indiceBonneRep;
	}
	
	public ExerciceQcm(){
		super();
	}
	public ExerciceQcm(int niveau, String enonce, int nbPropo, String[] tabPropo, int indiceBonneRep ){
		super();
		niveauDeDifficulte = niveau;
		EnonceDeExe = enonce;
		this.nbPropo = nbPropo;
		this.tabPropo = tabPropo;
		this.indiceBonneRep = indiceBonneRep;
		
	}
	public ExerciceQcm(int niveau, String enonce, int indiceBonneRep, int typeVraiOuFaux){
		super(niveau, enonce, TYPE_EXERCICE_VRAI_OU_FAUX);
		nbPropo = 2;
		switch (typeVraiOuFaux) {
		case TYPE_VRAI_FAUX : tabPropo = new String[]{"Vrai","Faux"};
			
			break;
		case TYPE_FAUX_VRAI : tabPropo = new String[]{"Faux","Vrai"};
			break;
		case TYPE_OUI_NON : tabPropo = new String[]{"Oui","Non"};
			break;
		case TYPE_NON_OUI : tabPropo = new String[]{"Non","Oui"};

		default: System.out.println("Hmmm coco tu fais une erreur la ...");
			break;
		}
	}
	//Je vous avoue que je me suis peut etre casser la tête la, mais c'est la manière la plus logique que j'ai trouvée.
	public String toString(){
		String affichage = EnonceDeExe + "\n";
		for (int i = 0; i < nbPropo ; i ++){
			if (i == indiceBonneRep) affichage += "*";
			affichage += "\t" + tabPropo[i] + "\n";
		}
		return affichage;
		
	}
	

}
