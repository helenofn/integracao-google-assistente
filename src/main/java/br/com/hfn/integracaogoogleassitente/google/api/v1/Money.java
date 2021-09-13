package br.com.hfn.integracaogoogleassitente.google.api.v1;

import com.fasterxml.jackson.annotation.*;

/**
 * Monetary amount.
 *
 * Represents an amount of money with its currency type.
 */
@lombok.Data
public class Money {
    @lombok.Getter(onMethod_ = {@JsonProperty("amountInMicros")})
    @lombok.Setter(onMethod_ = {@JsonProperty("amountInMicros")})
    private String amountInMicros;
    @lombok.Getter(onMethod_ = {@JsonProperty("currencyCode")})
    @lombok.Setter(onMethod_ = {@JsonProperty("currencyCode")})
    private String currencyCode;
}
