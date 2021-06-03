package sk.kosickaakademia.kolesarova.state;

public class StopState implements StateState{

    @Override
    public void doAction(Bakery state) {
        System.out.println("End of the baking process");
        state.setState(this);
    }
}
