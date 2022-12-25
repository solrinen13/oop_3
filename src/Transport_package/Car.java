package Transport_package;

public class Car extends Transport {

    private final  double engineVolume;
    private  String transmission;
    private final String bodyType;
    private final int registrationNumber;
    private int numberSeats;
    private static boolean summerTiresCheck;

    protected void swapRubber(boolean rubber){
        if (rubber == true){
            this.summerTiresCheck = false;
            System.out.println("Резина теперь заменена");
        }else{
            System.out.println("Замена резины не требуется");
        }

    }

    public class Key{
        private boolean remoteStart;
        private boolean keylessEntry;
        public Key(boolean remoteStart, boolean keylessEntry) {
            this.remoteStart = remoteStart;
            this.keylessEntry = keylessEntry;
        }
    }

    public Car(String brand,String model, double engineVolume, String color, int year, String country,
               String transmission, String bodyType,int registrationNumber,int numberSeats, boolean summerTiresCheck, int maxMS){
        super(brand,model,country,color,year,maxMS);

        if (engineVolume >= 0) {
            this.engineVolume = engineVolume;
        }else{
            this.engineVolume = 1.5;
        }

        this.bodyType = bodyType;

        if ( transmission !=null && !color.equals("")){
            this.transmission = transmission;
        }else{
            System.out.println("Данные о трансмиссии не загружены");
        }
        if (registrationNumber >= 0) {
            this.registrationNumber = registrationNumber;
        }else {
            this.registrationNumber = 001;
        }
        if (numberSeats >= 0) {
            this.numberSeats = numberSeats;
        }else {
            System.out.println("Данные о местах не загружены");
        }

        this.summerTiresCheck = summerTiresCheck;

    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public int getNumberSeats() {
        return numberSeats;
    }

    public boolean getSummerTiresCheck() {
        return summerTiresCheck;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNumberSeats(int numberSeats) {
        this.numberSeats = numberSeats;
    }

    public void setSummerTiresCheck(boolean summerTiresCheck) {
        this.summerTiresCheck = summerTiresCheck;
    }

    @Override
    public String toString() {
        return  brand + " " + model + " " +
                year + " года выпуска, " +
                "сборка произведена в " + country
                +", кузов " + color + " цвета, объем двигателя - " +
                engineVolume +" л. Из прочего стоит выделить что машина имеет " +transmission +" трансмиссию, "+
                bodyType+ " тип кузова, "+registrationNumber+ " номер регистрации и "+numberSeats+ " места." + maxMS +" км/ч максимальная скорость";
    }
}
