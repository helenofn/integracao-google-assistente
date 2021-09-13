package br.com.hfn.integracaogoogleassitente.google.api.v1;

import com.fasterxml.jackson.annotation.*;

/**
 * Promotions/Offers that were added to the cart.
 */
@lombok.Data
public class Promotion {
    @lombok.Getter(onMethod_ = {@JsonProperty("coupon")})
    @lombok.Setter(onMethod_ = {@JsonProperty("coupon")})
    private String coupon;
}
