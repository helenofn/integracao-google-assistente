package br.com.hfn.integracaogoogleassitente.google.api.v1;

import com.fasterxml.jackson.annotation.*;

/**
 * Defines a user's digital entitlement.
 */
@lombok.Data
public class Entitlement {
    @lombok.Getter(onMethod_ = {@JsonProperty("inAppDetails")})
    @lombok.Setter(onMethod_ = {@JsonProperty("inAppDetails")})
    private SignedData inAppDetails;
    @lombok.Getter(onMethod_ = {@JsonProperty("sku")})
    @lombok.Setter(onMethod_ = {@JsonProperty("sku")})
    private String sku;
    @lombok.Getter(onMethod_ = {@JsonProperty("skuType")})
    @lombok.Setter(onMethod_ = {@JsonProperty("skuType")})
    private SkuType skuType;
}
