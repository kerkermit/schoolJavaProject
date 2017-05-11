package question2;

import javax.swing.JOptionPane;

public class  Ip extends TrenteDeuxBits {
	
	
	


	public Ip(String ABCD) {
		super(ABCD);
		// TODO Auto-generated constructor stub
	}

	public String getClasse(){
		if ((valeur >>> 31) == 0){
			return "A";
		}
		if ((valeur >>> 30 ) == 2 ){
			return "B";
		}
		if ((valeur >>> 29) == 6){
			return "C";
		}
		if ((valeur >>> 28) == 14){
			return "D";
		}
		if ((valeur >>> 27) == 30){
			return "E";
		}
		else{
			return "F";
		}
	}

		

	public String getDefaultMask(){

		if (getClasse()=="A"){
			return "/8";
		}
		else if (getClasse()=="B"){
			return "/16";
		}
		else if (getClasse()=="C"){
			return "/24";
		}
		else{
			return "Pas de masque";
		}
		
	}


	public Boolean isPrivate(){
		
		if ((valeur >>> 24) == 10){
			return true;
		}
		if (valeur >>> 16 >= 44048 && valeur >>> 16 <= 44063){
			return true;
		}
		if (valeur >>> 16 == 49320){
			return true;
		}
		else{
			return false;
		}
		
	}
	public String toString1(){
		return (Integer.toString(super.getOct1()));
	}
	public String toString2() {
		return (Integer.toString(super.getOct2())); 
	}
	public String toString3() {
		return (Integer.toString(super.getOct3())); 
	}
	public String toString4() {
		return (Integer.toString(super.getOct4())); 
	}
	
	public Ip(){
		String ABCD = JOptionPane.showInputDialog("Write a separated 32 bits Address separated by .");
		String octS[] = ABCD.split("\\.");
		int oct[] = new int[4];
		for (int i = 0; i < octS.length; i++) {
			oct[i]=Integer.parseInt(octS[i]);
		}
		valeur = ((oct[0]*256+oct[1])*256+oct[2])*256+oct[3];
	}	
}