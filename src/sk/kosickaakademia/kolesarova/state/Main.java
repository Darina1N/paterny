package sk.kosickaakademia.kolesarova.state;

public class Main {
    public static void main(String[] args) {
        Bakery bread= new Bakery();
        Bakery croissant= new Bakery();

        StartState start=new StartState();
        MixState mix=new MixState();
        BakeState bake=new BakeState();
        StopState stop=new StopState();

        System.out.println("Bread:");
        start.doAction(bread);
        mix.doAction(bread);
        bake.doAction(bread);
        stop.doAction(bread);
        System.out.println("Bread is ready. Bon appetite!");
        System.out.println();

        System.out.println("Croissant:");
        start.doAction(croissant);
        mix.doAction(croissant);
        bake.doAction(croissant);
        stop.doAction(croissant);
        System.out.println("Croissant is ready. Bon appetite!");
    }
}
