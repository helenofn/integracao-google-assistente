package br.com.hfn.integracaogoogleassitente.google.api.v1;

import com.fasterxml.jackson.annotation.*;

/**
 * Payment result that's used by integrator for completing a transaction. This field will be
 * populated by Actions on Google if the checkout experience is managed by
 * Actions-on-Google.
 *
 * Payment result used by integrator for completing a transaction.
 */
@lombok.Data
public class PaymentResult {
    @lombok.Getter(onMethod_ = {@JsonProperty("googlePaymentData")})
    @lombok.Setter(onMethod_ = {@JsonProperty("googlePaymentData")})
    private String googlePaymentData;
    @lombok.Getter(onMethod_ = {@JsonProperty("merchantPaymentMethodId")})
    @lombok.Setter(onMethod_ = {@JsonProperty("merchantPaymentMethodId")})
    private String merchantPaymentMethodID;
}
