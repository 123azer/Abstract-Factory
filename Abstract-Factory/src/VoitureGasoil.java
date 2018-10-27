
public class VoitureGasoil extends Voiture {

	public VoitureGasoil(String modele, int puissance) {
		super(modele, puissance);
		
	}

	@Override
	public void afficher() {
		System.out.println("Voiture à gasoil de modèle : "+ modele+" de puissance"+puissance);
		
	}	

}
