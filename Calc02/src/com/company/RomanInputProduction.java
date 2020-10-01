package com.company;

public class RomanInputProduction {
    double R = 0;
    int r = 0;
    int f = 0;
    int s = 0;
    int fs = 0;
    int len = 1;
    String f1 = "";
    String f2 = "";
    char chR1 = ' ';
    char chR2 = ' ';
    String Input = "";
    String PartInput = "";
    char min = ' ';
    //Roman rom;

    int RomanToInt() {
            switch (PartInput) {
                case "I":
                    fs = Roman.I.toInt();
                    break;
                case "II":
                    fs = Roman.II.toInt();
                    break;
                case "III":
                    fs = Roman.III.toInt();
                    break;
                case "IV":
                    fs = Roman.IV.toInt();
                    break;
                case "V":
                    fs = Roman.V.toInt();
                    break;
                case "VI":
                    fs = Roman.VI.toInt();
                    break;
                case "VII":
                    fs = Roman.VII.toInt();
                    break;
                case "VIII":
                    fs = Roman.VIII.toInt();
                    break;
                case "IX":
                    fs = Roman.IX.toInt();
                    break;
                case "X":
                    fs = Roman.X.toInt();
                    break;
                case "0":
                    fs = 0;
                    break;
                default:

                    try {
                        throw new Exception("Roman must be <= X");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
            }
        return fs;
    }


    String ToRomanCh2() {
        switch (chR2) {

            case '1':
                f2 = "I";
                break;
            case '2':
                f2 = "II";
                break;
            case '3':
                f2 = "III";
                break;
            case '4':
                f2 = "IV";
                break;
            case '5':
                f2 = "V";
                break;
            case '6':
                f2 = "VI";
                break;
            case '7':
                f2 = "VII";
                break;
            case '8':
                f2 = "VIII";
                break;
            case '9':
                f2 = "IX";
                break;
            case '0':
                f2 = "0";
                break;


        }
        return f2;
    }


    String ToRomanCh1() {
        switch (chR1) {
            case '1':
                f1 = "X";
                break;
            case '2':
                f1 = "XX";
                break;
            case '3':
                f1 = "XXX";
                break;
            case '4':
                f1 = "XL";
                break;
            case '5':
                f1 = "L";
                break;
            case '6':
                f1 = "LX";
                break;
            case '7':
                f1 = "LXX";
                break;
            case '8':
                f1 = "LXXX";
                break;
            case '9':
                f1 = "XC";
                break;

        }
        return f1;
    }

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
                //System.out.println(AriphOper);
            } else {
                AriphIndex = Input.indexOf("*");
                if (AriphIndex > 0) {
                    AriphOper = "*";
                   // System.out.println(AriphOper);
                } else {
                    AriphIndex = Input.indexOf("/");
                    if (AriphIndex > 0) {
                        AriphOper = "/";
                       // System.out.println(AriphOper);
                    }
                }
            }
        }


        String SubInputLeft = Input.substring(0, AriphIndex);
        SubInputLeft.toUpperCase();
        SubInputLeft = SubInputLeft.trim();
        PartInput = SubInputLeft;
        RomanToInt();
        f = fs;

            //System.out.println(f);

        String SubInputRigth = Input.substring(AriphIndex+1);
        SubInputRigth = SubInputRigth.toUpperCase();
        SubInputRigth = SubInputRigth.trim();
        PartInput = SubInputRigth;
        RomanToInt();
        s = fs;


      if (SubInputLeft.matches("\\d+") | SubInputRigth.matches("\\d+"))  {
            System.out.println("different formats!");}

           // System.out.println(s);

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
    System.out.println("Division by zerro. Нельзя делить на ноль!");

}

       // System.out.println(R);
        r = (int) R;
       // System.out.println(r);
        String ResStr = Integer.toString(r);
      //  System.out.println(ResStr);

        char[] chResArrray = ResStr.toCharArray();



         if (R<0) {
            len = len +1;
             min = '-';}

             else {len = 1;
              min = ' ';
        }

        if (chResArrray.length == len + 2) {
            ResStr = "C";
           // System.out.println(chResArrray.length);
        } else if (chResArrray.length == len + 1) {
            chR2 = chResArrray[len];
            ToRomanCh2();
            chR1 = chResArrray[len-1];
            ToRomanCh1();
            ResStr = f1 + f2;
           // System.out.println(chResArrray.length);
        } else if (chResArrray.length == len ) {
            chR2 = chResArrray[len-1];
            ToRomanCh2();
            ResStr = f2;
          //  System.out.println(chResArrray.length);
        }

        System.out.println("Output: ");
        System.out.println(SubInputLeft + AriphOper + SubInputRigth + "=" + min + ResStr);

    }
}


