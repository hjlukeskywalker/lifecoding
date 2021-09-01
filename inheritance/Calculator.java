package com.java.inheritance;

class Calculator {
    int left, right;

    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }

    public void sum(){
        System.out.println(this.left + this.right);
    }

    public void avg(){
        System.out.println((this.left + this.right) / 2);
    }
}

class SubstractionableCalculator extends Calculator{
    public void substract(){
        System.out.println(this.left - this.right);
    }
}

class CalculatorDemo{

    public static void main(String[] args){
        SubstractionableCalculator c1 = new SubstractionableCalculator();
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();
    }
}
class MultiplicationalbeCalculator extends Calculator{
    public void multiplication(){
        System.out.println(this.left * this.right);
    }
}
class CalculatorDemo2 {
    public static void main(String[] args){

        MultiplicationalbeCalculator c1 = new MultiplicationalbeCalculator();
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();
        c1.multiplication();
    }
}

class DivisionableCalculator extends MultiplicationalbeCalculator{
    public void division(){
        System.out.println(this.left / this.right);
    }
}

class CalculatorDemo3{
    public static void main(String[] args){

        DivisionableCalculator c1 = new DivisionableCalculator();
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();
        c1.multiplication();
        c1.division();
    }
}