package com.juego.leanring;

public class EarlyBird implements Discountable {
    @Override
    public double getDiscount() {
        return 0.5;
    }
}
