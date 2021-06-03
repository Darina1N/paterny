package sk.kosickaakademia.kolesarova.state;

public class StartState implements StateState{

    @Override
    public void doAction(Bakery state) {
        System.out.println("The baking process begins");
        state.setState(this);
    }
}
