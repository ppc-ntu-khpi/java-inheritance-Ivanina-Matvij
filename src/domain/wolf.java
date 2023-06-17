package domain;

public class wolf extends Predator {

    private String kind;

    public wolf(String name, int weight, String kind) {
        this.name=name;
        this.weight=weight;
        this.kind=kind;
    }

    public wolf() {
        this("Fluffy",50,"just a wolf");
    }

    public wolf(String name) {
        this(name,50,"just a wolf");
    }
        

    public void play() {
        System.out.println("wolf is playing...");
    }

    @Override
    public void hunt() {
        System.out.println("wolf hunting for a sheep...");
    }

    @Override
    public String toString() {
        return super.toString()+"\nKind:\t"+this.kind+"\n\nThis is wolf!";
    }

    @Override
    public void speak() {
        System.out.println("Argh! Argh!");
    }

    @Override
    public void eat() {
        System.out.println("wolf eats meat...");
    }
    
    
}
