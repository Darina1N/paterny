package sk.kosickaakademia.kolesarova.state;

public class Bakery {
    private StateState state;

    public Bakery() {
        state=null;
    }

    public StateState getState() {
        return state;
    }

    public void setState(StateState state) {
        this.state = state;
    }
}
