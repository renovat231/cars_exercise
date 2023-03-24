public class Main {
    public static void main(String[] args) {
        car car_1=new car("Landcruiser","Toyota",2004,1234,"Black",2);
        System.out.println(car_1.toString());
        car_1.sell(2);
        System.out.println("The car model is: "+car_1.getModel());
        car_1.setBrand("Jeep");
        System.out.println("The car brand is: "+car_1.getBrand());
        car_1.setYear(2021);
        System.out.println("The car year is: "+car_1.getYear());
        System.out.println("The car price is: "+car_1.getPrice());
        System.out.println("The car colour is: "+car_1.getColour());
        System.out.println("The car quantity is: "+car_1.getQuantity());
        System.out.println(car_1.toString());

    }

}

class car {
    private String Model;
    private String Brand;
    private int Year;
    private int price;
    private String colour;
    private int quantity;

    public car(String model, String brand, int year, int price, String colour, int quantity) {
        Model = model;
        Brand = brand;
        Year = year;
        this.price = price;
        this.colour = colour;
        this.quantity = quantity;
    }

    public void setModel(String model) {
        Model = model;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public void setYear(int year) {
        Year = year;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getModel() {
        return Model;
    }

    public String getBrand() {
        return Brand;
    }

    public int getYear() {
        return Year;
    }

    public int getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "car{" +
                "Model='" + Model + '\'' +
                ", Brand='" + Brand + '\'' +
                ", Year='" + Year + '\'' +
                ", price=" + price +
                ", colour='" + colour + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    public void sell(int Number) {
        quantity += Number;
    }

    public void delivery() {
        quantity = 0;
    }
}
