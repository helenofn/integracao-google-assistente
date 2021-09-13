package br.com.hfn.integracaogoogleassitente.google.api.v1;

import com.fasterxml.jackson.annotation.*;

/**
 * Payment information regarding the order that's useful for user facing interaction.
 *
 * Payment information regarding the order being made. This proto captures information
 * that's useful for user facing interaction.
 */
@lombok.Data
public class PaymentInfo {
    @lombok.Getter(onMethod_ = {@JsonProperty("paymentMethodDisplayInfo")})
    @lombok.Setter(onMethod_ = {@JsonProperty("paymentMethodDisplayInfo")})
    private PaymentMethodDisplayInfo paymentMethodDisplayInfo;
    @lombok.Getter(onMethod_ = {@JsonProperty("paymentMethodProvenance")})
    @lombok.Setter(onMethod_ = {@JsonProperty("paymentMethodProvenance")})
    private PaymentMethodProvenance paymentMethodProvenance;
}
