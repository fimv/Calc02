package com.company;

import java.util.Scanner;


public class Main {
    static String Type;

    public static void main(String[] args) {
        do {

            Scanner in = new Scanner(System.in);
            System.out.println("Input: ");
            String Input = in.nextLine();

        try {
            try {
                try {

            if (Input.matches("\\s*\\w+\\s*") |
                    Input.matches("\\s*\\w+\\s*?[-+*/]\\s*") |
                    Input.matches("\\s*?[-+*/]\\s*\\w+\\s*") |
                    Input.matches("\\s*\\w+\\s*\\w+\\s*")) {
                throw new Exception("Wrong input format");}

            else if (Input.matches("\\s*\\d+\\s*?[-+*/]\\s*\\D\\s*") |
                    Input.matches("\\s*\\D\\s*?[-+*/]\\s*\\d+\\s*")) {
                throw new Exception("Using Roman and Arab at the same time");}

                else if (Input.equals("")) {throw new Exception("Type math. operation!");
            }

                else {
                if (Input.matches("\\s*\\d+\\s*?[-+*/]\\s*\\d+\\s*")) {

                    InputProduction ip = new InputProduction();
                    ip.InputLeftRight(Input);
                } else {
                    RomanInputProduction rm = new RomanInputProduction();
                    rm.InputLeftRight(Input);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

            System.out.println("Type 'Any char' to continue, for example 'n';    'y' to exit.");
            System.out.println("Do you wish to exit?");
            Type = in.next();
        } while (!(Type.equals("y")));


    }


}