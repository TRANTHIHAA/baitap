package NGAYNAM;

public class TestStaticProperty {
    public static void main(String[] args) {

        StaticPoperty car1 = new StaticPoperty("Mazda 3","Skyactiv 3");

        System.out.println(StaticPoperty.numberOfCars);

        StaticPoperty car2 = new StaticPoperty("Mazda 6","Skyactiv 6");

        System.out.println(StaticPoperty.numberOfCars);

        StaticPoperty car3 = new StaticPoperty("suzuki","Skyactiv 6");

        System.out.println(StaticPoperty.numberOfCars);

    }

}
