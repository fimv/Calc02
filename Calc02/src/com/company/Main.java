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

            if (Input.matches("\\s*\\w+\\s*") |
                    Input.matches("\\s*\\w+\\s*?[-+*/]\\s*") |
                    Input.matches("\\s*?[-+*/]\\s*\\w+\\s*") |
                    Input.matches("\\s*\\w+\\s*\\w+\\s*")) {
                throw new Exception("Wrong input format");
            } else {
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


            System.out.println("Press 'Y' to continue;  'Any char' to exit");
            Type = in.next();
        } while (Type.equals("Y"));


    }


}