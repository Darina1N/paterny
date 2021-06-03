package sk.kosickaakademia.kolesarova.semafor;

public class GreenState implements State{
    @Override
    public void doAction(TraficLight state) {
        System.out.println("Colour change to green");
        state.setState(this);
    }

    public String toString(){
        return "Green colour";
    }
}
