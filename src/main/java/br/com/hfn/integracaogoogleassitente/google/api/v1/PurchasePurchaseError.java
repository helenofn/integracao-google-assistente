package br.com.hfn.integracaogoogleassitente.google.api.v1;

import com.fasterxml.jackson.annotation.*;

/**
 * Errors that a purchase order can be rejected for.
 */
@lombok.Data
public class PurchasePurchaseError {
    @lombok.Getter(onMethod_ = {@JsonProperty("availableQuantity")})
    @lombok.Setter(onMethod_ = {@JsonProperty("availableQuantity")})
    private Long availableQuantity;
    @lombok.Getter(onMethod_ = {@JsonProperty("description")})
    @lombok.Setter(onMethod_ = {@JsonProperty("description")})
    private String description;
    @lombok.Getter(onMethod_ = {@JsonProperty("entityId")})
    @lombok.Setter(onMethod_ = {@JsonProperty("entityId")})
    private String entityID;
    @lombok.Getter(onMethod_ = {@JsonProperty("type")})
    @lombok.Setter(onMethod_ = {@JsonProperty("type")})
    private ErrorType type;
    @lombok.Getter(onMethod_ = {@JsonProperty("updatedPrice")})
    @lombok.Setter(onMethod_ = {@JsonProperty("updatedPrice")})
    private PriceAttribute updatedPrice;
}
