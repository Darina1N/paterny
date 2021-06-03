package sk.kosickaakademia.kolesarova.state;

public class MixState implements StateState{

    @Override
    public void doAction(Bakery state) {
        System.out.println("Mixing all ingredients");
        state.setState(this);
    }
}


