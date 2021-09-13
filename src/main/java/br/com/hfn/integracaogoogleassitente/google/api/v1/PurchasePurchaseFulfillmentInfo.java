package br.com.hfn.integracaogoogleassitente.google.api.v1;

import com.fasterxml.jackson.annotation.*;

/**
 * Fulfillment info for this line item. If unset, this line item inherits order level
 * fulfillment info.
 *
 * Fulfillment info associated with a purchase order or a particular line item.
 *
 * Fulfillment info for the order.
 */
@lombok.Data
public class PurchasePurchaseFulfillmentInfo {
    @lombok.Getter(onMethod_ = {@JsonProperty("expectedFulfillmentTime")})
    @lombok.Setter(onMethod_ = {@JsonProperty("expectedFulfillmentTime")})
    private Time expectedFulfillmentTime;
    @lombok.Getter(onMethod_ = {@JsonProperty("expectedPreparationTime")})
    @lombok.Setter(onMethod_ = {@JsonProperty("expectedPreparationTime")})
    private Time expectedPreparationTime;
    @lombok.Getter(onMethod_ = {@JsonProperty("expireTime")})
    @lombok.Setter(onMethod_ = {@JsonProperty("expireTime")})
    private String expireTime;
    @lombok.Getter(onMethod_ = {@JsonProperty("fulfillmentContact")})
    @lombok.Setter(onMethod_ = {@JsonProperty("fulfillmentContact")})
    private UserInfo fulfillmentContact;
    @lombok.Getter(onMethod_ = {@JsonProperty("fulfillmentType")})
    @lombok.Setter(onMethod_ = {@JsonProperty("fulfillmentType")})
    private FulfillmentType fulfillmentType;
    @lombok.Getter(onMethod_ = {@JsonProperty("id")})
    @lombok.Setter(onMethod_ = {@JsonProperty("id")})
    private String id;
    @lombok.Getter(onMethod_ = {@JsonProperty("location")})
    @lombok.Setter(onMethod_ = {@JsonProperty("location")})
    private V2Location location;
    @lombok.Getter(onMethod_ = {@JsonProperty("pickupInfo")})
    @lombok.Setter(onMethod_ = {@JsonProperty("pickupInfo")})
    private PurchasePickupInfo pickupInfo;
    @lombok.Getter(onMethod_ = {@JsonProperty("price")})
    @lombok.Setter(onMethod_ = {@JsonProperty("price")})
    private PriceAttribute price;
    @lombok.Getter(onMethod_ = {@JsonProperty("shippingMethodName")})
    @lombok.Setter(onMethod_ = {@JsonProperty("shippingMethodName")})
    private String shippingMethodName;
    @lombok.Getter(onMethod_ = {@JsonProperty("storeCode")})
    @lombok.Setter(onMethod_ = {@JsonProperty("storeCode")})
    private String storeCode;
}
