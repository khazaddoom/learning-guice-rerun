package com.juego.leanring;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {

    public static void main(String[] args) {

        Injector guice = Guice.createInjector(new DiscountModule());

        CheckoutService checkout = guice.getInstance(CheckoutService.class);

        checkout.processOrder(100);


    }
}
