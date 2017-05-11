package question2;


public class IpavecMask extends Ip {

	private Mask masque ;
	
	public IpavecMask(String ABCD, int cidr){
		super(ABCD);
		this.masque = new Mask(cidr);
	}
	public IpavecMask(String ABCD){
		super(ABCD);
		if (getClasse() == "A"){
			this.masque = new Mask(8);
		}
		else if (getClasse() == "B"){
			this.masque = new Mask(16);
		}
		else if (getClasse() == "C"){
			this.masque = new Mask(24);
		}
		else{
			this.masque = new Mask(0);
		}
	}

	public Mask getMasque() {
		return masque;
	}
	

	public void setMasque(Mask masque) {
		this.masque = masque;
	}

	public String toString() {
		return (super.toString()+" " +this.masque);
	}
	public TrenteDeuxBits getNetwork() {
		TrenteDeuxBits buff = new TrenteDeuxBits();
		buff.valeur = (this.valeur & masque.getValeur());
		return buff;
	}
	public TrenteDeuxBits getBroadcast() {
		TrenteDeuxBits buff = new TrenteDeuxBits();
		buff.valeur = (this.valeur | masque.wildCard());
		return buff;
	}
	public TrenteDeuxBits getFirstIp() {
		TrenteDeuxBits buff = new TrenteDeuxBits();
		buff.valeur = ((this.valeur & masque.getValeur())+1);
		return buff;
	}
	public TrenteDeuxBits getLastIp() {
		TrenteDeuxBits buff = new TrenteDeuxBits();
		buff.valeur = ((this.valeur & masque.wildCard())-1);
		return buff;
	}
	public Boolean isValidIp(){
		if (this.toString().compareTo(this.getNetwork().toString())!= 0 && this.toString().compareTo(this.getBroadcast().toString())!= 0 && this.toString().compareTo("127.0.0.1")!=0 ){
			return true;
		}
		return false;
	}
	public Boolean isNetwork(){
		if ((this.toString().compareTo(this.getNetwork().toString()))!= 0){
			return true;
		}
		return false;
	}
	public Boolean isBroadcast(){
		if ((this.toString().compareTo(this.getBroadcast().toString()))!= 0){
			return true;
		}
		return false; 
	}

	
}
