
public class VoitureGasoil extends Voiture {

	public VoitureGasoil(String modele, int puissance) {
		super(modele, puissance);
		
	}

	@Override
	public void afficher() {
		System.out.println("Voiture � gasoil de mod�le : "+ modele+" de puissance"+puissance);
		
	}	

}
