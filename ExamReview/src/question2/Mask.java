package question2;


public class Mask extends TrenteDeuxBits {

	public  Mask(String ABCD) {
		super(ABCD);
	}
	public Mask(int nb1){
		int entier = ~0;
		entier = entier << 32-nb1;
		setValeur(entier);
		
	}
	public int wildCard() {
		int ma = ~0;
		return (ma-valeur);
	}
}
