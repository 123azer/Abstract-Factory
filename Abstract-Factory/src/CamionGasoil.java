
public class CamionGasoil extends Camion {

	

	public CamionGasoil(int categorie, int puissance) {
		super(categorie, puissance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void afficher() {
		System.out.println("Camion � gasoil de cat�corie : "+ categorie+" de puissance"+ puissance);
		
	}

}
