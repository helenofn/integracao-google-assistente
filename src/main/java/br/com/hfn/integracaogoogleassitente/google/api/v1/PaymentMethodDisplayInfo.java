package br.com.hfn.integracaogoogleassitente.google.api.v1;

import com.fasterxml.jackson.annotation.*;

/**
 * The display info of the payment method used for the transaction.
 *
 * Payment result used by integrator for completing a transaction.
 */
@lombok.Data
public class PaymentMethodDisplayInfo {
    @lombok.Getter(onMethod_ = {@JsonProperty("paymentMethodDisplayName")})
    @lombok.Setter(onMethod_ = {@JsonProperty("paymentMethodDisplayName")})
    private String paymentMethodDisplayName;
    @lombok.Getter(onMethod_ = {@JsonProperty("paymentMethodVoiceName")})
    @lombok.Setter(onMethod_ = {@JsonProperty("paymentMethodVoiceName")})
    private String paymentMethodVoiceName;
    @lombok.Getter(onMethod_ = {@JsonProperty("paymentType")})
    @lombok.Setter(onMethod_ = {@JsonProperty("paymentType")})
    private PaymentType paymentType;
}
