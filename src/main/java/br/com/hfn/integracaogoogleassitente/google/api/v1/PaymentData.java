package br.com.hfn.integracaogoogleassitente.google.api.v1;

import com.fasterxml.jackson.annotation.*;

/**
 * Payment related data for the order.
 *
 * Payment data related to an order.
 */
@lombok.Data
public class PaymentData {
    @lombok.Getter(onMethod_ = {@JsonProperty("paymentInfo")})
    @lombok.Setter(onMethod_ = {@JsonProperty("paymentInfo")})
    private PaymentInfo paymentInfo;
    @lombok.Getter(onMethod_ = {@JsonProperty("paymentResult")})
    @lombok.Setter(onMethod_ = {@JsonProperty("paymentResult")})
    private PaymentResult paymentResult;
}
