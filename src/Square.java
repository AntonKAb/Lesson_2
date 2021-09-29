package com.company;

public class Square extends Figure{
    private float side;

    public Square(float side){
        setSide(side);
    }

    public void setSide(float side){

        this.side = side < 0 ? 0 : side;
    }

    public Square(){
        this.side = 0;
    }

    public void info() {
        System.out.println("Квадрат со стороной равной: " + this.side);
    }
    float area() {
        return this.side * this.side;
    }

    float perimeter() {
        return 4f * this.side;
    }
}

