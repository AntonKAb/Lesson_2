package com.company;

public class Rectangle extends Figure{

    private float sideOne;
    private float sideTwo;

    public Rectangle(float sideOne, float sideTwo) {
        setSide(sideOne, sideTwo);
    }

    public void setSide(float sideOne, float sideTwo){

        this.sideOne = sideOne < 0 ? 0 : sideOne;
        this.sideTwo = sideTwo < 0 ? 0 : sideTwo;

    }

    public Rectangle(){
        this.sideOne = 0;
        this.sideTwo = 0;
    }

    public void info() {
        System.out.println("Прямоугольник со сторонами равными: " + this.sideOne + "; " + this.sideTwo);
    }
    float area() {
        return this.sideOne * this.sideTwo;
    }

    float perimeter() {
        return (2f * this.sideOne) + (2f * this.sideTwo);
    }
}


