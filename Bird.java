public class Bird {
    private String name;

    public Bird() {
        this.name = "Unknown Bird";
    }

    public Bird(String name) {
        this.name = name;
    }

    public void displayBirdName() {
        System.out.println("Bird Name: " + name);
    }

    public static void main(String[] args) {
        Bird unknownBird = new Bird();
        Bird parrot = new Bird("Parrot");
        Bird sparrow = new Bird("Sparrow");

        unknownBird.displayBirdName();
        parrot.displayBirdName();
        sparrow.displayBirdName();
    }
}
