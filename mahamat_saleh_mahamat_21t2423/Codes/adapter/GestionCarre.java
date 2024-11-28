package Codes.adapter;

// Client
public class GestionCarre {
    public static void main(String[] args) {
        // Classe Rectangle existante
        Rectangle rectangle = new Rectangle();

        // Adapter pour l'utiliser comme un carre
        Carre carre = new RectangleAdapter(rectangle);

        // Utilisation via l'interface
        carre.setCote(3);
        System.out.println("Perimetre du carre : " + carre.calculerPerimetre());
        System.out.println("Aire du carre : " + carre.calculerAire());
    }
}
