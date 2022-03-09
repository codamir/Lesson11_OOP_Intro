package Lesson11_OOP;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_second {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        Calculator newCalculator = new Calculator();

        char answer = 0;

        do{
            printText("What would you like to do?");

            String[] mathOperations = {
                    "Addition of 2 numbers",
                    "Subtraction of 2 numbers",
                    "Multiplication of 2 numbers",
                    "Division of 2 numbers",
                    "Addition of N numbers",
                    "Multiplication of N numbers",
                    "Circle area calculation",
            };

            menuFromArray(mathOperations);

            int choice = reader.nextInt();

            if (choice == 1) {
                newCalculator.numberA=insertNumber();
                newCalculator.numberB=insertNumber();

                printText("The result is: " + newCalculator.addition());
            } else if (choice == 2){
                newCalculator.numberA=insertNumber();
                newCalculator.numberB=insertNumber();

                printText("The result is: " + newCalculator.subtraction());
            } else if (choice == 3){
                newCalculator.numberA=insertNumber();
                newCalculator.numberB=insertNumber();

                printText("The result is: " + newCalculator.multiplication());
            }else if(choice == 4){
                newCalculator.numberA=insertNumber();
                newCalculator.numberB=insertNumber();

                printText("The result is: " + newCalculator.division());
            }else if(choice==5){
                printText("The result is: " + newCalculator.additionOfNumbersInList(listOfNumbers()));
            }else if (choice==6){
                printText("The result is: " + newCalculator.multiplicationOfNumbersInList(listOfNumbers()));
            }else if(choice==7){
                printText("Type radius in cm:");
                newCalculator.setNumberA(reader.nextInt());
                printText("The area of a circle is: " + newCalculator.circleAreaCalculation() +" cm2");
            }else printText("The option you chose does not exist!");

            printText("Do you want to use calculator again? y/n");
            answer=reader.next().toLowerCase().charAt(0);

        }while (answer=='y');

    }

    public static int insertNumber (){
        Scanner reader = new Scanner(System.in);

        printText("Type a number: ");
        int number = reader.nextInt();
        return number;
    }

    public static ArrayList listOfNumbers(){
        Scanner reader = new Scanner(System.in);
        ArrayList<Integer>listNumbers = new ArrayList<>();
        char yesNo = 0;
        int arrayNumber=0;

        do {
            System.out.println("Please enter any number:");
            arrayNumber=reader.nextInt();
            listNumbers.add(arrayNumber);

            printText("Do you want another number? y/n");
            yesNo=reader.next().toLowerCase().charAt(0);
        }while (yesNo=='y');
        return listNumbers;
    }

    public static int[] arrayFiller (){
        Scanner reader = new Scanner(System.in);

        printText("How many numbers you want to add?");
        int[] numberArray = new int[reader.nextInt()];
        printText("Please type the numbers.");
        int counter = 0;
        for (int i=0; i<numberArray.length;i++){
            printText("Type " + (++counter) + ". number:");
            numberArray[i]= reader.nextInt();
        }
        return numberArray;
    }

    public static String printText(String text) {
        System.out.println(text);
        return text;
    }

    public static String[] menuFromArray(String[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            printText(++counter + " - " + array[i]);
        }
        return array;
    }
}

