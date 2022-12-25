import Transport_package.Bus;
import Transport_package.Car;
import Transport_package.Transport;

public class Main {
    public static void main(String[] args) {
        Car ladaGranta = new Car ("Lada","Гранта",1.7,"желтого",2015,"России",
                "front","sports",231,2,true, 50);
       //  System.out.println(ladaGranta);
        //System.out.println(ladaGranta.getColor());
        Bus buhanka = new Bus("Uaz","231","Russia","Black",2010,130);
        System.out.println(buhanka);
        Bus gazel = new Bus("Gazel","324","Russia","gray", 1970,80);
        System.out.println(gazel);
        Bus volgabus = new Bus("Volga", "4298", "Russia", "green", 1999, 150);
        System.out.println(volgabus);
    }
}