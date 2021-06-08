package sk.kosickaakademia.kolesarova.myobserver;

import sk.kosickaakademia.kolesarova.myobserver.observers.MyObserver;

import java.util.ArrayList;
import java.util.List;

public class Week {
    private List<MyObserver> list=new ArrayList<>();
    private String day;
    private int state;

    public String getDay() {
        return day;
    }

    public int getState() {
        return state;
    }

    public void setDay(String day,int state) {
        this.day = day;
        this.state = state;
        notifyAllMyObserver();
    }

    public void notifyAllMyObserver() {
        for(MyObserver myObserver:list){
            myObserver.update();
        }
    }

    public void attach(MyObserver myObserver){
        list.add(myObserver);
    }


}
