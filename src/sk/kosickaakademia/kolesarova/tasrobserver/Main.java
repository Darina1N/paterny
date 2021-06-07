package sk.kosickaakademia.kolesarova.tasrobserver;

import sk.kosickaakademia.kolesarova.tasrobserver.allobservers.EmailGate;
import sk.kosickaakademia.kolesarova.tasrobserver.allobservers.FBGate;
import sk.kosickaakademia.kolesarova.tasrobserver.allobservers.FaxGate;
import sk.kosickaakademia.kolesarova.tasrobserver.allobservers.SMSGate;

public class Main {
    public static void main(String[] args) {
        Tasr subject= new Tasr();

        new SMSGate(subject);
        new EmailGate(subject);
        new FaxGate(subject);
        new FBGate(subject);

        subject.setMessage("Ide mi to.");
        System.out.println();

    }
}
