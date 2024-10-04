class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    @Override
    public String toString() {
        return "Animal [Nom: " + this.name + ", Famille: " + this.family + ", Âge: " + this.age + ", Mammifère: " + this.isMammal + "]";
    }
}
