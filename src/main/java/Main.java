

import jdk.swing.interop.SwingInterOpUtils;

import javax.sound.midi.Soundbank;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.net.SocketTimeoutException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your first name:");
        String firstName = scanner.next();
        System.out.println("Please enter your last name:");
        String lastName = scanner.next();
        System.out.println("Please enter your age:");
        int age = scanner.nextInt();
        System.out.println("Please enter your birth month:");
        int birthMonth = scanner.nextInt();

        System.out.println("Do you know what is ROYGBIV color? If you do not know type Help");
        String promptAnswer = scanner.next();
        if (promptAnswer.equalsIgnoreCase("help") ) {
            System.out.println("R stands for Red");
            System.out.println("O stands for Orange");
            System.out.println("Y stands for Yellow");
            System.out.println("G stands for Green");
            System.out.println("B stands for Blue");
            System.out.println("I stands for Indigo");
            System.out.println("V stands for Violet");
        }

        System.out.println("Please enter your favorite ROYGBIV color:");
        String favoriteColor;
        favoriteColor= scanner.next();
        if (favoriteColor.equalsIgnoreCase("R") || favoriteColor.equalsIgnoreCase("Red")) {
            favoriteColor="Red";

        }
        else if (favoriteColor.equalsIgnoreCase("o") || favoriteColor.equalsIgnoreCase("Orange")) {
            favoriteColor="Orange";
        }
        else if (favoriteColor.equalsIgnoreCase("y") || favoriteColor.equalsIgnoreCase("yellow")) {
            favoriteColor="Yellow";
        }
        else if (favoriteColor.equalsIgnoreCase("g") || favoriteColor.equalsIgnoreCase("green")) {
            favoriteColor="Green";
        }
        else if (favoriteColor.equalsIgnoreCase("b") || favoriteColor.equalsIgnoreCase("blue")) {
            favoriteColor="Blue";
        }
        else if (favoriteColor.equalsIgnoreCase("i") || favoriteColor.equalsIgnoreCase("indigo")) {
            favoriteColor="Indigo";
        }
        else if (favoriteColor.equalsIgnoreCase("v") || favoriteColor.equalsIgnoreCase("violet")) {
            favoriteColor="Violet";
        }
        else
        {
            favoriteColor="Black";
        }

        System.out.println("Please enter the number of siblings you have:");
        int siblings = scanner.nextInt();

        //Part 2
        if (age<45)
        {
            System.out.println("You have a lot of time to retire");
        }
        else {
            System.out.println("Plan for your retirement!! Time is running out");
        }
        int retirement = 65-age;

        String vacationHome="";
        if (siblings ==0)
        {
            vacationHome="Sydney";
            System.out.println("You are the only beneficiary of your parents property ");
        }
        else if (siblings==1)
        {
            vacationHome="Florida";
            System.out.println("Your parents property will be divided into two ");
        }
        else if (siblings==2)
        {
            vacationHome="California";
            System.out.println("You will get one third of your parents property ");
        }
        else if (siblings==3)
        {
            vacationHome="Paris";
            System.out.println("You will get one fourth of your parents property ");
        }
        else if (siblings>3)
        {
            vacationHome="London";
            System.out.println("Be nice to your parents to get any property from them");
        }
        else
        {
            vacationHome="Home";
            System.out.println("You are kidding!!!");
        }
        String transportationMode;
        switch (favoriteColor){
            case "Red":
                transportationMode="Helicopter";
                System.out.println("You will drive in BMW");
                break;

            case "Orange":
                transportationMode="Plane";
                System.out.println("You will drive in Honda");
                break;

            case "Yellow":
                transportationMode="Audi Car";
                System.out.println("You will drive in Audi");
                break;

            case "Green":
                transportationMode="Ford Car";
                System.out.println("You will drive in Ford");
                break;

            case "Blue":
                transportationMode="Ferrari Car";
                System.out.println("You will drive in Ferrari");
                break;

            case "Indigo":
                transportationMode="Toyota Car";
                System.out.println("You will drive in Toyota");
                break;
            case "Violet":
                transportationMode="Tesla Car";
                System.out.println("You will drive in Tesla");
                break;

            default:
                transportationMode="tuk-tuk";
                System.out.println("You will drive in tuk-tuk");

        }
        int bankBalance;
        if (birthMonth>=1 && birthMonth <4)
        {
            bankBalance=676767;
            System.out.println("Your bank balance is $"+bankBalance);
        }
        else if (birthMonth>=4 && birthMonth <8)
        {
            bankBalance=434343;
            System.out.println("Your bank balance is $"+bankBalance);
        }
        else if (birthMonth>=8 && birthMonth <=12)
        {
            bankBalance=123232;
            System.out.println("Your bank balance is $"+bankBalance);
        }
        else
        {
            bankBalance=0;
            System.out.println("You are in a lot of debt!! Savings are very important in life");
        }
        //Part 3




        System.out.println(firstName +" " +lastName+ " will retire in " +retirement +" years with $" +bankBalance+" in the bank, a vacation home in "+ vacationHome +" and travel by "+transportationMode);







    }
}
