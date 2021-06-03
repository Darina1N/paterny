package sk.kosickaakademia.kolesarova.state;

public class BakeState implements StateState{

    @Override
    public void doAction(Bakery state) {
        System.out.println("Baking");
        state.setState(this);
    }
}
