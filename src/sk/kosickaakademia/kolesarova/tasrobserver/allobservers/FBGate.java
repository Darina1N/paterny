package sk.kosickaakademia.kolesarova.tasrobserver.allobservers;

import sk.kosickaakademia.kolesarova.tasrobserver.Tasr;

public class FBGate extends Observer{

    public FBGate(Tasr subject) {
        this.subject=subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println(subject.getMessage()+"New message was sending to Facebook");
    }
}
