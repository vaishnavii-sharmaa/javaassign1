public class Car {
    String model;
    int year;
    int numberofcar;
    public Car(String model,int year){
        this.model=model;
        this.year=year;

    }
    public static void main(String args[]){
        Car car1=new Car("honda ",8989);
        Car car2=new Car("mercedes ",9090);
        System.out.println(car1.model+car1.year);
        System.out.println(car2.model+car2.year);
    }

    
}
