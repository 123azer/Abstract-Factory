
public abstract class Voiture {
	
	protected String modele;
	protected int puissance;
	
	public Voiture(String modele, int puissance) {
		this.modele=modele;
		this.puissance=puissance;
	}
	public abstract void afficher();
	
}
