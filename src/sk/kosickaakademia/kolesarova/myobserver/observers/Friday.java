package sk.kosickaakademia.kolesarova.myobserver.observers;

import sk.kosickaakademia.kolesarova.myobserver.Week;

public class Friday extends MyObserver{
    public Friday(Week subjekt) {
        this.subjekt=subjekt;
        this.subjekt.attach(this);
    }

    @Override
    public void update() {
        if(subjekt.getState()==5)
            System.out.println("Today is: "+subjekt.getDay());
    }
}
