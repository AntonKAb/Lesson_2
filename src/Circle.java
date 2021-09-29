package com.company;

public class Circle extends Figure{
    private float radius;

    public Circle(float radius){
        setRadius(radius);
    }

    public void setRadius(float radius){
        this.radius = radius < 0 ? 0 : radius;
    }

    public Circle(){
        this.radius = 0;
    }

    public void info() {
        System.out.println("Круг с радиусом равным: " + this.radius);
    }
    float area() {
        return 3.14f * this.radius * this.radius;
    }

    float perimeter() {
        return 6.28f * this.radius;
    }
}
