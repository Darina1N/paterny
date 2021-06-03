package sk.kosickaakademia.kolesarova.semafor;

public class OrangeState implements State{
    @Override
    public void doAction(TraficLight state) {
        System.out.println("Colour change to orange");
        state.setState(this);
    }

    public String toString(){
        return "Orange colour";
    }
}
