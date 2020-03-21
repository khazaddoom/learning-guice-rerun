package com.juego.leanring;
import com.google.inject.Inject;
public class CheckoutService {
    private final Discountable discount;

    @Inject
    public CheckoutService(Discountable discount) {
        this.discount = discount;
    }

    public void checkout(double cartAmount) {
        final double revisedCartAmount = cartAmount += (cartAmount * this.discount.getDiscount());
        System.out.println("Total Order value is: " + revisedCartAmount);
    }
}
