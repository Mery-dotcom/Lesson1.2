class Mammal extends Animal implements Printable {
    private String habitat;

    public Mammal(String name, String habitat) {
        super(name);
        this.habitat = habitat;
    }

    @Override
    public void print() {
        System.out.println("Mammal Name: " + getName() + ", Habitat: " + habitat);
    }
}
