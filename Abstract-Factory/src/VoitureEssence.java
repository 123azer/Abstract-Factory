
public class VoitureEssence extends Voiture {

	public VoitureEssence(String modele, int puissance) {
		super(modele, puissance);
		
	}

	@Override
	public void afficher() {
		System.out.println("Voiture � Essance de mod�le : "+ modele+" de puissance"+puissance);
	
	}

}
