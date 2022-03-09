package Lesson11_OOP;

import java.util.ArrayList;

public class Calculator {
    int numberA;
    int numberB;
    int[] arrayOfNumbers;
    ArrayList <Integer> listOfNumbers;

    public Calculator(){
        this.numberA = numberA;
        this.numberB = numberB;
        this.arrayOfNumbers = arrayOfNumbers;
        this.listOfNumbers = listOfNumbers;
    }

    int addition(){
        return this.numberA+this.numberB;
    }

    int subtraction(){
        return this.numberA-this.numberB;
    }

    int multiplication(){
        return this.numberA*this.numberB;
    }

    double division(){
        return this.numberA * 1.00 / this.numberB;
    }

    double circleAreaCalculation(){
        return this.numberA*this.numberA*piNumber;
    }

    int additionOfNumbersInArray(int[] arrayOfNumbers){
        int sum = 0;
        for (int i=0;i<arrayOfNumbers.length;i++){
            sum = arrayOfNumbers[i]+sum;
        }
        return sum;
    }

    int multiplicationOfNumbersInArray(int[] arrayOfNumbers){
        int multiplication = 1;
        for (int i=0;i<arrayOfNumbers.length;i++){
            multiplication = arrayOfNumbers[i]*multiplication;
        }
        return multiplication;
    }

    int getNumberA(){
        return this.numberA;
    }

    void setNumberA(int numberA){
        this.numberA=numberA;
    }

    int getNumberB(){
        return this.numberB;
    }

    void setNumberB(int numberB){
        this.numberB=numberB;
    }

    int additionOfNumbersInList (ArrayList<Integer> listOfNumbers){
        int sum = 0;
        for(int i = 0; i < listOfNumbers.size(); i++)
            sum += listOfNumbers.get(i);
        return sum;
    }

    int multiplicationOfNumbersInList (ArrayList<Integer> listOfNumbers){
        int multiplication = 1;
        for (int i=0; i<listOfNumbers.size();i++){
            multiplication*=listOfNumbers.get(i);
        }
        return multiplication;
    }

    static double piNumber = Math.PI;
}



//    Napraviti klasu Calculator koji ima sljedece funkcionalnosti:
//
//        - sabiranje dva broja
//        - oduzimanje dva broja
//        - mnozenje dva broja
//        - dijeljenje dva broja
//        - sabiranje N brojeva
//        - mnozenje N brojeva
//        - izracunavanje povrsine kruga
//
//        Dodatne info:
//        - Omoguciti da se svi attributi set-aju koristeci jedan
//        ili vise konstruktora (a ne davanjem argumenata samim metodama)
//        kako bi se dalje mogli koristiti u samim metodama. Primjera radi:
//
//        int sabiranje() {
//        return this.brojA + this.brojB;
//        }
//
//        Ovdje se podrazumjeva da su vrijednosti za brojA i brojB
//        vec set-ane kroz konstruktor
//
//        - Da bi izracunali povrsinu kruga, definisati Pi vrijednost kao
//        class varijablu i koristiti je unutar metode koja ce
//        racunati povrsinu kruga