
public abstract class Camion {
	protected int categorie;
	protected int puissance;
	public Camion (int categorie, int puissance) {
		this.categorie=categorie;
		this.puissance=puissance;
	}
	public abstract void afficher();

}
