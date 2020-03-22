package com.juego.leanring;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {

    public interface Email {
        String constructEmail(String name);
    }

    public void something(String name, Email email) {
        System.out.println(email.constructEmail(name));
    }

    public static void main(String[] args) {

//        Injector guice = Guice.createInjector(new DiscountModule());
//
//        CheckoutService checkout = guice.getInstance(CheckoutService.class);
//
//        checkout.processOrder(100);

        new Main().something("ganesh.a", (s) -> s + "@juegostudio.com");

    }
}
