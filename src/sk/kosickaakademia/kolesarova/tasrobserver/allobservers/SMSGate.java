package sk.kosickaakademia.kolesarova.tasrobserver.allobservers;

import sk.kosickaakademia.kolesarova.tasrobserver.Tasr;

public class SMSGate extends Observer {
    public SMSGate(Tasr subject) {
        this.subject=subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println(subject.getMessage()+"New message was sending to SMS");
    }
}
