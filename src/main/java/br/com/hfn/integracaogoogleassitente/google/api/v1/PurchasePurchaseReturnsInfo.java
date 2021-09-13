package br.com.hfn.integracaogoogleassitente.google.api.v1;

import com.fasterxml.jackson.annotation.*;

/**
 * Returns info for this line item. If unset, this line item inherits order level returns
 * info.
 *
 * Returns info associated with an order or a particular line item.
 *
 * Return info for the order.
 */
@lombok.Data
public class PurchasePurchaseReturnsInfo {
    @lombok.Getter(onMethod_ = {@JsonProperty("daysToReturn")})
    @lombok.Setter(onMethod_ = {@JsonProperty("daysToReturn")})
    private Long daysToReturn;
    @lombok.Getter(onMethod_ = {@JsonProperty("isReturnable")})
    @lombok.Setter(onMethod_ = {@JsonProperty("isReturnable")})
    private Boolean isReturnable;
    @lombok.Getter(onMethod_ = {@JsonProperty("policyUrl")})
    @lombok.Setter(onMethod_ = {@JsonProperty("policyUrl")})
    private String policyURL;
}
