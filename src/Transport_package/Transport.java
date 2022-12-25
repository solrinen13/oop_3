package Transport_package;

public class Transport {
    protected  String brand;
    protected  String model;
    protected  String country;
    protected  String color;
    protected  int year;
    protected  int maxMS;


    public Transport(String brand, String model, String country, String color, int year, int maxMS) {

        if (brand != null && !brand.equals("")){
            this.brand = brand;
        }else {
            this.brand = "default";
        }

        if (model != null && !model.equals("")){
            this.model = model;
        }else {
            this.model = "default";
        }

        if (country != null && !country.equals("")) {
            this.country = country;
        }else {
            this.country = "default";
        }

        if (color != null && !color.equals("")) {
            this.color = color;
        }else{
            this.color = "белого";
        }
        if (year >= 0) {
            this.year = year;
        }else {
            this.year = 2000;
        }
        if ( maxMS >= 20) {
            this.maxMS = maxMS;
        } else {
            this.maxMS = 120;
        }
    }

    public void setColor(String color) {
        if ( color !=null && !color.equals("")){
        this.color = color;
    }else{
        System.out.println("Введенные данные не верны");
    }
    }

    public void setYear(int year) {
        if ( year !=0 && year >= 0 ){
        this.year = year;
    }else{
            System.out.println("Введенные данные не верны");
        }
    }

    public void setMaxMS(int maxMS) {
        if (maxMS != 0 && maxMS >= 20) {
            this.maxMS = maxMS;
        } else {
            System.out.println("Введенные данные не верны");
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public int getMaxMS() {
        return maxMS;
    }
}
