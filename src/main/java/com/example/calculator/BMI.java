package com.example.calculator;

public class BMI {
    private float weight;
    private float height;
    public BMI() {
        this.height = 0;
        this.weight = 0;
    }
    public BMI(float BodyHeight, float BodyMass) {
        this.height = BodyHeight;
        this.weight = BodyMass;
    }
    public float calculate()
    {
        return this.weight/this.height/this.height*10000;
    }
    public boolean diagnosis(){
        if (18.5 <= calculate() &&  calculate() < 25)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    @Override
    public String toString() {
        return "BMI{" +
                "weight=" + this.weight +
                ", height=" + this.height +
                '}';
    }
}
