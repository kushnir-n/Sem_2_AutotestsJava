package org.example;

import org.example.homework.Account;
import org.example.homework.IElement;
import org.example.homework.Portfolio;

public class Main {
    public static void main(String[] args) {

        IElement element1 = new Account(100L);
        IElement element2 = new Account(120L);
        IElement element3 = new Account(140L);
        IElement element4 = new Account(160L);
        IElement element5 = new Account(180L);

        IElement portfolio = new Portfolio();
        portfolio.add(element1);
        portfolio.add(element2);
        portfolio.add(element3);
        portfolio.add(element4);
        portfolio.add(element5);

        System.out.println(portfolio.getSum());
    }
}
