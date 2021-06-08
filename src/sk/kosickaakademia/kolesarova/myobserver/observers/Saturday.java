package sk.kosickaakademia.kolesarova.myobserver.observers;

import sk.kosickaakademia.kolesarova.myobserver.Week;

public class Saturday extends MyObserver{
    public Saturday(Week subjekt) {
        this.subjekt=subjekt;
        this.subjekt.attach(this);
    }

    @Override
    public void update() {
        if(subjekt.getState()==6)
            System.out.println("Today is: "+subjekt.getDay());
    }
}
