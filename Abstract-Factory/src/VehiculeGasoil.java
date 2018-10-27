
public class VehiculeGasoil implements Vehicule {

	@Override
	public Voiture creerVoiture(String modele, int puissance) {
		return new VoitureGasoil(modele, puissance);
	}

	@Override
	public Camion creerCamion(int categorie, int puissance) {
		return new CamionGasoil(categorie, puissance);
	}

}
