package sk.kosickaakademia.kolesarova.myobserver;

import sk.kosickaakademia.kolesarova.myobserver.observers.*;

public class Main1 {
    public static void main(String[] args) {
        Week subjekt=new Week();

        new Monday(subjekt);
        new Tuesday(subjekt);
        new Wednesday(subjekt);
        new Thursday(subjekt);
        new Friday(subjekt);
        new Saturday(subjekt);
        new Sunday(subjekt);

        //subjekt.setDay("Monday",1);
        subjekt.setDay("Tuesday",2);
        //subjekt.setDay("Wednesday",3);
        //subjekt.setDay("Thursday",4);
       // subjekt.setDay("Friday",5);
       // subjekt.setDay("Saturday",6);
       // subjekt.setDay("Sunday",7);
    }
}
