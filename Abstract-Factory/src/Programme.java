import java.util.Scanner;

public class Programme {

	public static void main(String[] args) {
		Vehicule fabrique;
		Scanner reader = new Scanner(System.in);
		System.out.println("voulez vous utiliser des véhicules gasoil 1 ou essence 2 ");
        String choix = reader.next();
        if (choix.equals("1"))
        	fabrique= new VehiculeGasoil();
        else
        	fabrique= new VehiculeEssence();
	
        Voiture v = fabrique.creerVoiture("X", 2);
        Camion c= fabrique.creerCamion(1, 6);
        v.afficher();
        c.afficher();
	}

}
