package com.epam.spb.lection2;

import java.util.Scanner;

/**
 * Created by MKlyarovich on 26.06.2016.
 */
public class Start {

    //Вывод меню
    private static void menu() {
        System.out.println("Меню:");
        System.out.println("1 - Arguments Example");
        System.out.println("2 - Auto Pack");
        System.out.println("3 - Big Example");
        System.out.println("4 - Bit Operations");
        System.out.println("5 - Chars Test");
        System.out.println("6 - Class Example");
        System.out.println("7 - Cover Classes");
        System.out.println("8 - Data Types");
        System.out.println("9 - Import");
        System.out.println("10 - InstanceOf");
        System.out.println("11 - Logic Operations");
        System.out.println("12 - Main");
        System.out.println("13 - Operators");
        System.out.println("14 - String Transformation");
        System.out.println("15 - Unary Operators");
        System.out.println("quit - Выход");
        System.out.println("------->");
    }

    public static void main(String[] args) {

        String choice;
        String arg = "This is the first argument";
        String[] arguments = arg.split(" ");

        menu();

        Scanner cin = new Scanner(System.in);
        do {
            System.out.println();
            System.out.print("Выберете пункт меню: ");

            choice = cin.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("Результаты работы примера " + choice);
                    ArgumentsExample.main(arguments);
                    break;
                case "2":
                    System.out.println("Результаты работы примера " + choice);
                    AutoPack.main(arguments);
                    break;
                case "3":
                    System.out.println("Результаты работы примера " + choice);
                    BigExample.main(arguments);
                    break;
                case "4":
                    System.out.println("Результаты работы примера " + choice);
                    BitOperations.main(arguments);
                    break;
                case "5":
                    System.out.println("Результаты работы примера " + choice);
                    CharsTest.main(arguments);
                    break;
                case "6":
                    System.out.println("Результаты работы примера " + choice);
                    ClassExample.main(arguments);
                    break;
                case "7":
                    System.out.println("Результаты работы примера " + choice);
                    CoverClasses.main(arguments);
                    break;
                case "8":
                    System.out.println("Результаты работы примера " + choice);
                    DataTypes.main(arguments);
                    break;
                case "9":
                    System.out.println("Результаты работы примера " + choice);
                    Import.main(arguments);
                    break;
                case "10":
                    System.out.println("Результаты работы примера " + choice);
                    InstanceOf.main(arguments);
                    break;
                case "11":
                    System.out.println("Результаты работы примера " + choice);
                    LogicOperations.main(arguments);
                    break;
                case "12":
                    System.out.println("Результаты работы примера " + choice);
                    Main.main(arguments);
                    break;
                case "13":
                    System.out.println("Результаты работы примера " + choice);
                    Operators.main(arguments);
                    break;
                case "14":
                    System.out.println("Результаты работы примера " + choice);
                    StringTransformation.main(arguments);
                    break;
                case "15":
                    System.out.println("Результаты работы примера " + choice);
                    UnaryOperators.main(arguments);
                    break;
                case "16":
                    menu();
                    break;
                case "quit":
                    System.out.println("Завершение сеанса работы программы");
                    break;
                default:
                    System.out.println("Выбран некорректный пункт меню (16 - Меню, quit - Выход)");
            }
        } while (!choice.equals("quit"));
    }
}
