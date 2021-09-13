package br.com.hfn.integracaogoogleassitente.google.api.v1;

import com.fasterxml.jackson.annotation.*;
import java.util.List;
import java.util.Map;

/**
 * Purchase order
 *
 * Order extension for purchase vertical. These properties are applicable to all line items
 * inside order, unless overridden in a line item.
 */
@lombok.Data
public class PurchasePurchaseOrderExtension {
    @lombok.Getter(onMethod_ = {@JsonProperty("errors")})
    @lombok.Setter(onMethod_ = {@JsonProperty("errors")})
    private List<PurchasePurchaseError> errors;
    @lombok.Getter(onMethod_ = {@JsonProperty("extension")})
    @lombok.Setter(onMethod_ = {@JsonProperty("extension")})
    private Map<String, Object> extension;
    @lombok.Getter(onMethod_ = {@JsonProperty("fulfillmentInfo")})
    @lombok.Setter(onMethod_ = {@JsonProperty("fulfillmentInfo")})
    private PurchasePurchaseFulfillmentInfo fulfillmentInfo;
    @lombok.Getter(onMethod_ = {@JsonProperty("purchaseLocationType")})
    @lombok.Setter(onMethod_ = {@JsonProperty("purchaseLocationType")})
    private PurchaseLocationType purchaseLocationType;
    @lombok.Getter(onMethod_ = {@JsonProperty("returnsInfo")})
    @lombok.Setter(onMethod_ = {@JsonProperty("returnsInfo")})
    private PurchasePurchaseReturnsInfo returnsInfo;
    @lombok.Getter(onMethod_ = {@JsonProperty("status")})
    @lombok.Setter(onMethod_ = {@JsonProperty("status")})
    private PurchaseStatus status;
    @lombok.Getter(onMethod_ = {@JsonProperty("type")})
    @lombok.Setter(onMethod_ = {@JsonProperty("type")})
    private PurchaseType type;
    @lombok.Getter(onMethod_ = {@JsonProperty("userVisibleStatusLabel")})
    @lombok.Setter(onMethod_ = {@JsonProperty("userVisibleStatusLabel")})
    private String userVisibleStatusLabel;
}
