package br.com.erudio.converters;

public class NumberConverter {


    public static Double toDouble(String number){
        if (number == null) return 0d;

        number = number.replaceAll(",", ".");

        if (isNumeric(number)) return Double.parseDouble(number);

        return 0d;
    }

    public static boolean isNumeric(String number){
        if (number == null) return false;

        number = number.replaceAll(",", ".");

        return number.matches("[-+]?[0-9]*\\.?[0-9]+");

    }
}
