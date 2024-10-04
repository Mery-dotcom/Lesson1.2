class Bird extends Animal implements Printable {
    private double wingspan;

    public Bird(String name, double wingspan) {
        super(name);
        this.wingspan = wingspan;
    }

    @Override
    public void print() {
        System.out.println("Bird Name: " + getName() + ", Wingspan: " + wingspan + " meters");
    }
}
