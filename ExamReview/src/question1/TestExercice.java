package question1;

/**
 * @author KerKer
 *
 */
public class TestExercice {

	public static void main(String[] args) {
		Exercice[] tabExe = new Exercice[]{
				(new ExerciceQcm(1,"(x+6)� est �gal � :", 3,new String[]{"0:x+36","1:x�+12x+36","2:x�+6x+36"},1)),
				(new ExerciceATrou(1, "Complete cette phrase avec le verbe entre parenth�se conjugu� au simple present. Jane ....", "buys", "(buy)beautiful clothes")),
				(new ExerciceQcm(1, "Java est un langage orient� objet", 1, ExerciceQcm.TYPE_VRAI_FAUX))};
		System.out.println(tabExe[0] + "\n" + tabExe[1] + "\n" + tabExe[2]);

	}

}
