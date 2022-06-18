package NGAYNAM;

import NGAYBAY.animal.Circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("ban kinh la  "+circle.getRadius()+" dien tich la: "+circle.getArea());
        Circle circle1 = new Circle(3.0);
        System.out.println("ban kinh la  "+circle1.getRadius()+" dien tich la: "+circle1.getArea());
    }
}
