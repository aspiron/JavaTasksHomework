package HW260822;

import java.util.Scanner;

public class Car {
    private String model;
    private String color;
    private double mileage;
    private String regNumber;
    private double gasAmount;
    private int sitsAmount;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getMileage() {
        return mileage/1000;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public double getGasAmount() {
        return gasAmount;
    }

    public void setGasAmount(double gasAmount) {
        this.gasAmount = gasAmount;
    }

    public int getSitsAmount() {
        return sitsAmount;
    }

    public void setSitsAmount(int sitsAmount) {
        if(sitsAmount <= 8) {
            this.sitsAmount = sitsAmount;
        } else {
            Error err = new Error("В этой машине не может быть больше восьми мест");
            System.out.println(err);
        }
    }

    public void carInfo(){
        System.out.println("Информация о машине: " + getModel() + ", цвет: " + getColor() + ", госномер: " + getRegNumber());
        System.out.println("пробег: " + getMileage() + " км, бензина осталось " + getGasAmount() + " литров, посадочных мест: " + getSitsAmount());
    }

    public void addNewCar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Заполните пожалуйста информацию о машине.");
        System.out.println("Марка и модель машины: ");
        setModel(this.model = sc.nextLine());
        System.out.println("Цвет: ");
        setColor(this.color = sc.nextLine());
        System.out.println("Пробег (указывается в метрах): ");
        setMileage(this.mileage = sc.nextDouble());
        System.out.println("Госномер: ");
        setRegNumber(this.regNumber = sc.next());
        System.out.println("Сколько литров бензина осталось: ");
        setGasAmount(this.gasAmount = sc.nextDouble());
        System.out.println("Количество мест: ");
        setSitsAmount(this.sitsAmount = sc.nextInt());

    }
}