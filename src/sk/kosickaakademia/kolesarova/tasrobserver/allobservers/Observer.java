package sk.kosickaakademia.kolesarova.tasrobserver.allobservers;

import sk.kosickaakademia.kolesarova.tasrobserver.Tasr;

public abstract class Observer {
    protected Tasr subject;
    public abstract void update();
}
