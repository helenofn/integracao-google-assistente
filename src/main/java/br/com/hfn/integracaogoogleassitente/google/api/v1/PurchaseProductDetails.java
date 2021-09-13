package br.com.hfn.integracaogoogleassitente.google.api.v1;

import com.fasterxml.jackson.annotation.*;
import java.util.Map;

/**
 * Details about the product.
 */
@lombok.Data
public class PurchaseProductDetails {
    @lombok.Getter(onMethod_ = {@JsonProperty("gtin")})
    @lombok.Setter(onMethod_ = {@JsonProperty("gtin")})
    private String gtin;
    @lombok.Getter(onMethod_ = {@JsonProperty("plu")})
    @lombok.Setter(onMethod_ = {@JsonProperty("plu")})
    private String plu;
    @lombok.Getter(onMethod_ = {@JsonProperty("productAttributes")})
    @lombok.Setter(onMethod_ = {@JsonProperty("productAttributes")})
    private Map<String, Object> productAttributes;
    @lombok.Getter(onMethod_ = {@JsonProperty("productId")})
    @lombok.Setter(onMethod_ = {@JsonProperty("productId")})
    private String productID;
    @lombok.Getter(onMethod_ = {@JsonProperty("productType")})
    @lombok.Setter(onMethod_ = {@JsonProperty("productType")})
    private String productType;
}
