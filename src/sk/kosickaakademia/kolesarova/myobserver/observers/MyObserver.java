package sk.kosickaakademia.kolesarova.myobserver.observers;

import sk.kosickaakademia.kolesarova.myobserver.Week;

public abstract class MyObserver {
    protected Week subjekt;
    public abstract void update();
}
