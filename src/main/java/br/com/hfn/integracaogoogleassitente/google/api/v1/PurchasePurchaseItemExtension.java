package br.com.hfn.integracaogoogleassitente.google.api.v1;

import com.fasterxml.jackson.annotation.*;
import java.util.List;
import java.util.Map;

/**
 * Purchase orders like goods, food etc.
 *
 * Line item contents of Purchase Vertical.
 */
@lombok.Data
public class PurchasePurchaseItemExtension {
    @lombok.Getter(onMethod_ = {@JsonProperty("extension")})
    @lombok.Setter(onMethod_ = {@JsonProperty("extension")})
    private Map<String, Object> extension;
    @lombok.Getter(onMethod_ = {@JsonProperty("fulfillmentInfo")})
    @lombok.Setter(onMethod_ = {@JsonProperty("fulfillmentInfo")})
    private PurchasePurchaseFulfillmentInfo fulfillmentInfo;
    @lombok.Getter(onMethod_ = {@JsonProperty("itemOptions")})
    @lombok.Setter(onMethod_ = {@JsonProperty("itemOptions")})
    private List<PurchaseItemOption> itemOptions;
    @lombok.Getter(onMethod_ = {@JsonProperty("productDetails")})
    @lombok.Setter(onMethod_ = {@JsonProperty("productDetails")})
    private PurchaseProductDetails productDetails;
    @lombok.Getter(onMethod_ = {@JsonProperty("productId")})
    @lombok.Setter(onMethod_ = {@JsonProperty("productId")})
    private String productID;
    @lombok.Getter(onMethod_ = {@JsonProperty("quantity")})
    @lombok.Setter(onMethod_ = {@JsonProperty("quantity")})
    private Long quantity;
    @lombok.Getter(onMethod_ = {@JsonProperty("returnsInfo")})
    @lombok.Setter(onMethod_ = {@JsonProperty("returnsInfo")})
    private PurchasePurchaseReturnsInfo returnsInfo;
    @lombok.Getter(onMethod_ = {@JsonProperty("status")})
    @lombok.Setter(onMethod_ = {@JsonProperty("status")})
    private PurchaseStatus status;
    @lombok.Getter(onMethod_ = {@JsonProperty("type")})
    @lombok.Setter(onMethod_ = {@JsonProperty("type")})
    private PurchaseType type;
    @lombok.Getter(onMethod_ = {@JsonProperty("unitMeasure")})
    @lombok.Setter(onMethod_ = {@JsonProperty("unitMeasure")})
    private PurchaseMerchantUnitMeasure unitMeasure;
    @lombok.Getter(onMethod_ = {@JsonProperty("userVisibleStatusLabel")})
    @lombok.Setter(onMethod_ = {@JsonProperty("userVisibleStatusLabel")})
    private String userVisibleStatusLabel;
}
