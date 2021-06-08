package sk.kosickaakademia.kolesarova.myobserver.observers;

import sk.kosickaakademia.kolesarova.myobserver.Week;

public class Tuesday extends MyObserver {
    public Tuesday(Week subjekt) {
        this.subjekt=subjekt;
        this.subjekt.attach(this);
    }

    @Override
    public void update() {
        if(subjekt.getState()==2)
            System.out.println("Today is: "+subjekt.getDay());
    }
}
