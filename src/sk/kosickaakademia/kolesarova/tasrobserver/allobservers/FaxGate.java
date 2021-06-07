package sk.kosickaakademia.kolesarova.tasrobserver.allobservers;

import sk.kosickaakademia.kolesarova.tasrobserver.Tasr;

public class FaxGate extends Observer{

    public FaxGate(Tasr subject) {
        this.subject=subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        if(subject.getPriority()==1|| subject.getPriority()==3)
        System.out.println(subject.getMessage()+"New message was sending to Fax");
    }
}
