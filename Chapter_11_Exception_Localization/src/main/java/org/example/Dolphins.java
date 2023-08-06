package org.example;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class Dolphins {

    public static void main(String[] args) {
        //Locale.setDefault(Locale.US);
        //print(100_102.2);
        Locale.setDefault(new Locale("en", "US"));
        var b = ResourceBundle.getBundle("Dolphins");
        System.out.println(b.getString("name"));
    }

    public static void print(double t) {
        System.out.print(NumberFormat.getCompactNumberInstance().format(t));
        System.out.print(
                NumberFormat.getCompactNumberInstance(
                        Locale.getDefault(), NumberFormat.Style.SHORT).format(t));
        System.out.print(NumberFormat.getCurrencyInstance().format(t));
    }
}
