package OfficeHours.Practice_05_17_2021;

public class Rectangle {

    double height;
    double width;
    double area;

    public void setDimensions(double recHeight, double recWidth) {
        height = recHeight;
        width = recWidth;
        area = height * width;
    }

    public double getArea() {
        area = height * width;
        return area;


    }


}
