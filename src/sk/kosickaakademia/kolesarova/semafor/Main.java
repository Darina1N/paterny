package sk.kosickaakademia.kolesarova.semafor;

public class Main {
    public static void main(String[] args) {
        TraficLight tl1=new TraficLight();
        TraficLight tl2=new TraficLight();

        RedState redState=new RedState();
        OrangeState orangeState=new OrangeState();
        GreenState greenState=new GreenState();

        redState.doAction(tl1);
        System.out.println("Trafic light 1: "+tl1.getState().toString());
        greenState.doAction(tl2);
        System.out.println("Trafic light 2: "+tl2.getState().toString());
        orangeState.doAction(tl1);
        System.out.println("Trafic light 1: "+tl1.getState().toString());
        orangeState.doAction(tl2);
        System.out.println("Trafic light 2: "+tl2.getState().toString());
        greenState.doAction(tl1);
        System.out.println("Trafic light 1: "+tl1.getState().toString());
        redState.doAction(tl2);
        System.out.println("Trafic light 2: "+tl2.getState().toString());
    }
}
