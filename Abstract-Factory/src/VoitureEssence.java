
public class VoitureEssence extends Voiture {

	public VoitureEssence(String modele, int puissance) {
		super(modele, puissance);
		
	}

	@Override
	public void afficher() {
		System.out.println("Voiture à Essance de modèle : "+ modele+" de puissance"+puissance);
	
	}

}
