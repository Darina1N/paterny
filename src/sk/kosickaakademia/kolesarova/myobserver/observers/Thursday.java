package sk.kosickaakademia.kolesarova.myobserver.observers;

import sk.kosickaakademia.kolesarova.myobserver.Week;

public class Thursday extends MyObserver{
    public Thursday(Week subjekt) {
        this.subjekt=subjekt;
        this.subjekt.attach(this);
    }

    @Override
    public void update() {
        if(subjekt.getState()==4)
            System.out.println("Today is: "+subjekt.getDay());
    }
}
