
public class CamionEssence extends Camion {

	public CamionEssence(int categorie, int puissance) {
		super(categorie, puissance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void afficher() {
		System.out.println("Camion � Essence de cat�corie : "+ categorie+" de puissance"+ puissance);
		
	}


}
