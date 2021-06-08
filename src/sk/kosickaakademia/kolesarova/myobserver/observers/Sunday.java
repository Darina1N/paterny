package sk.kosickaakademia.kolesarova.myobserver.observers;

import sk.kosickaakademia.kolesarova.myobserver.Week;

public class Sunday extends MyObserver{
    public Sunday(Week subjekt) {
        this.subjekt=subjekt;
        this.subjekt.attach(this);
    }

    @Override
    public void update() {
        if(subjekt.getState()==7)
            System.out.println("Today is: "+subjekt.getDay());
    }
}
