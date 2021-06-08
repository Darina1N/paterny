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

        //subject.setPriority(1);
        subject.setMessage("Ide mi to. \n",1);
        System.out.println();
        //subject.setPriority(3);
        subject.setMessage("Uvidime ako je to s prioritou. \n",3);
        System.out.println();
        //subject.setPriority(2);
        subject.setMessage("Aj priorita funguje. \n",2);

    }
}
