package Transport_package;

public class Bus extends Transport{
    public Bus(String brand, String model, String country, String color, int year, int maxMS) {
        super(brand,model,country,color,year,maxMS);
    }


    @Override
    public String toString() {
        return  brand + " " + model + " " +
                year + " года выпуска, " +
                "сборка произведена в " + country
                +", кузов " + color +", цвета " + maxMS +" км/ч максимальная скорость";
    }
}
