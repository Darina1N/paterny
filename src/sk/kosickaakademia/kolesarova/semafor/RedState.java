package sk.kosickaakademia.kolesarova.semafor;

public class RedState implements State{

    @Override
    public void doAction(TraficLight state) {
        System.out.println("Colour change to red");
        state.setState(this);
    }

    public String toString(){
        return "Red colour";
    }
}
