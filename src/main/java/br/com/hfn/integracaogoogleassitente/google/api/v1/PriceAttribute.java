package br.com.hfn.integracaogoogleassitente.google.api.v1;

import com.fasterxml.jackson.annotation.*;

/**
 * Price attribute of an order or a line item.
 *
 * Cost of this option.
 *
 * Relevant in case of PRICE_CHANGED / INCORRECT_PRICE error type.
 */
@lombok.Data
public class PriceAttribute {
    @lombok.Getter(onMethod_ = {@JsonProperty("amount")})
    @lombok.Setter(onMethod_ = {@JsonProperty("amount")})
    private Money amount;
    @lombok.Getter(onMethod_ = {@JsonProperty("amountMillipercentage")})
    @lombok.Setter(onMethod_ = {@JsonProperty("amountMillipercentage")})
    private Long amountMillipercentage;
    @lombok.Getter(onMethod_ = {@JsonProperty("id")})
    @lombok.Setter(onMethod_ = {@JsonProperty("id")})
    private String id;
    @lombok.Getter(onMethod_ = {@JsonProperty("name")})
    @lombok.Setter(onMethod_ = {@JsonProperty("name")})
    private String name;
    @lombok.Getter(onMethod_ = {@JsonProperty("state")})
    @lombok.Setter(onMethod_ = {@JsonProperty("state")})
    private State state;
    @lombok.Getter(onMethod_ = {@JsonProperty("taxIncluded")})
    @lombok.Setter(onMethod_ = {@JsonProperty("taxIncluded")})
    private Boolean taxIncluded;
    @lombok.Getter(onMethod_ = {@JsonProperty("type")})
    @lombok.Setter(onMethod_ = {@JsonProperty("type")})
    private PriceAttributeType type;
}
