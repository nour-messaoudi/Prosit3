import java.util.Scanner;

public class ZooManagement {

    int nbrCages;
    String zooName;

    public static void main(String[] args) {
        ZooManagement zoo = new ZooManagement();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Veuillez entrer le nom du zoo : ");
        zoo.zooName = scanner.nextLine().trim();
        while (zoo.zooName.isEmpty()) {
            System.out.print("Nom du zoo invalide. Veuillez réessayer : ");
            zoo.zooName = scanner.nextLine().trim();
        }

        System.out.print("Veuillez entrer le nombre de cages : ");
        while (!scanner.hasNextInt()) {
            System.out.print("Entrée invalide. Veuillez entrer un nombre entier pour le nombre de cages : ");
            scanner.next();
        }
        zoo.nbrCages = scanner.nextInt();
        while (zoo.nbrCages <= 0) {
            System.out.print("Le nombre de cages doit être un entier positif. Veuillez réessayer : ");
            while (!scanner.hasNextInt()) {
                System.out.print("Entrée invalide. Veuillez entrer un nombre entier : ");
                scanner.next();
            }
            zoo.nbrCages = scanner.nextInt();
        }
        System.out.println(zoo.zooName + " comporte " + zoo.nbrCages + " cages");
        scanner.close();
    }
}
