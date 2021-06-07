package sk.kosickaakademia.kolesarova.tasrobserver;

import sk.kosickaakademia.kolesarova.tasrobserver.allobservers.Observer;

import java.util.ArrayList;
import java.util.List;

public class Tasr {
    private List<Observer> list= new ArrayList<>();
    private String message;
    private int priority;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
        notifyAllTasrObserver();
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }

    public void notifyAllTasrObserver() {
        for (Observer observer:list){
            observer.update();
        }
    }

    public void attach(Observer observer){
        list.add(observer);
    }
}
