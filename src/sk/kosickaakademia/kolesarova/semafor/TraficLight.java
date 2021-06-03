package sk.kosickaakademia.kolesarova.semafor;

public class TraficLight {
    private State state;

    public TraficLight() {
        state = null;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
}
