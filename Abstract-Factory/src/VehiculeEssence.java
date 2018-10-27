
public class VehiculeEssence implements Vehicule {

	@Override
	public Voiture creerVoiture(String modele, int puissance) {
		return new VoitureEssence(modele, puissance);
	}

	@Override
	public Camion creerCamion(int categorie, int puissance) {
		return new CamionEssence(categorie, puissance);
	}

}
