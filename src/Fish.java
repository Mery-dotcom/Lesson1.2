class Fish extends Animal implements Printable {
    private String waterType;

    public Fish(String name, String waterType) {
        super(name);
        this.waterType = waterType;
    }

    @Override
    public void print() {
        System.out.println("Fish Name: " + getName() + ", Water Type: " + waterType);
    }
}
