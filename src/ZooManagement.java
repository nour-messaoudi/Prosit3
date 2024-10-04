public class ZooManagement {
    public static void main(String[] args) {

        Animal lion = new Animal("Felidae", "Lion", 5, true);
        Animal tiger = new Animal("Felidae", "Tiger", 4, true);
        Animal elephant = new Animal("Elephantidae", "Elephant", 10, true);

        Zoo zoo1 = new Zoo("Zoo 1", "Paris");
        Zoo zoo2 = new Zoo("Zoo 2", "London");

        zoo1.addAnimal(lion);
        zoo1.addAnimal(tiger);

        zoo2.addAnimal(elephant);

        Zoo largestZoo = Zoo.comparerZoo(zoo1, zoo2);
        System.out.println("Le zoo avec le plus d'animaux est : " + largestZoo.name + " avec " + largestZoo.animalCount + " animaux.");
    }
}
