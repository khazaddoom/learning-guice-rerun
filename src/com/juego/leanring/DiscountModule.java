package com.juego.leanring;

import com.google.inject.AbstractModule;
public class DiscountModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(Discountable.class).to(EarlyBird.class);
    }
}
