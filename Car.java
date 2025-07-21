public class Car {
    private String model;
    private int price;
    private int maxSpeed;
    private int carId;

    public static int wheels;

    static {
        System.out.println("static block in Car");
        wheels = 4;
    }

    {
        System.out.println("non-static block in Car");
        wheels = 5;
    }
    public void setModel(String carModel) {
        model = carModel;
    }

    public void setPrice(int carPrice) {
        price = carPrice;
    }

    public void setCarId(int id) {
        carId = id;
    }

    public void setMaxSpeed(int speed) {
        maxSpeed = speed;
    }
    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public int getCarId() {
        return carId;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}
