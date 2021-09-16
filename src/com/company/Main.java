package com.company;
import java.io.PrintStream;
public class Main {
    public static void main(String[] args) {
        Cart item = new Cart();
        item.addItem("сапог", 43);
        item.addItem("таблетка" , 67);
        item.addItem("очки", 89);
        item.addItem("котел",123);
        item.addItem("сумка" , 211);

        item.removeItem("очки" , 36);
        item.sumPrice();
        item.upPrice(15);
        item.downPrice(30);
    }
}
