package com.company;

public class InputProduction {


    double R = 0;
    int f = 0;
    int s = 0;

    String Input = "";


    void InputLeftRight(String Input) {
        this.Input = Input;
        String AriphOper = "";

        int AriphIndex = Input.indexOf("+");
        if (AriphIndex > 0) {
            AriphOper = "+";
            //System.out.println(AriphOper);
        } else {
            AriphIndex = Input.indexOf("-");
            if (AriphIndex > 0) {
                AriphOper = "-";
               // System.out.println(AriphOper);
            } else {
                AriphIndex = Input.indexOf("*");
                if (AriphIndex > 0) {
                    AriphOper = "*";
                    //System.out.println(AriphOper);
                } else {
                    AriphIndex = Input.indexOf("/");
                    if (AriphIndex > 0) {
                        AriphOper = "/";
                        //System.out.println(AriphOper);
                    }
                }
            }
        }


        String SubInputLeft = Input.substring(0, AriphIndex);
        SubInputLeft.toUpperCase();
        SubInputLeft = SubInputLeft.trim();

        try {

            f = Integer.parseInt(SubInputLeft);

          //  System.out.println(f);

        } catch (
                NumberFormatException e) {
            System.err.println(f + "must be <= 10."  + "Неверный формат строки!");
        }


        String SubInputRigth = Input.substring(AriphIndex+1);
        SubInputRigth = SubInputRigth.toUpperCase();
        SubInputRigth = SubInputRigth.trim();

        try {
            s = Integer.parseInt(SubInputRigth);
           // System.out.println(s);

        } catch (
                NumberFormatException e) {
            System.err.println(s + "must be <= 10."  + "Неверный формат строки!");
        }

        try {

            switch (AriphOper) {
                case "+":
                    R = f + s;
                    break;
                case "-":
                    R = f - s;
                    break;
                case "*":
                    R = f * s;
                    break;
                case "/":
                    R = (double) f / (double) s;
                    break;
            }
        } catch(ArithmeticException e) {
            e.printStackTrace();
            System.out.println("Division by zerro. Нельзя делить на ноль!");}

        String ResStr = Double.toString(R);


            System.out.println("Output: ");
            System.out.println(SubInputLeft + AriphOper + SubInputRigth + "=" + ResStr);

        }
}




