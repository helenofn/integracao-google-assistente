package br.com.hfn.integracaogoogleassitente.google.api.v1;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

/**
 * The provider of the particular line item, if different from the overall order. Example:
 * Expedia Order with line item provider ANA.
 *
 * Merchant for the cart/order/line item.
 *
 * Merchant that facilitated the checkout. This could be different from a line item level
 * provider. Example: Expedia Order with line item from ANA.
 */
@lombok.Data
public class Merchant {
    @lombok.Getter(onMethod_ = {@JsonProperty("address")})
    @lombok.Setter(onMethod_ = {@JsonProperty("address")})
    private V2Location address;
    @lombok.Getter(onMethod_ = {@JsonProperty("id")})
    @lombok.Setter(onMethod_ = {@JsonProperty("id")})
    private String id;
    @lombok.Getter(onMethod_ = {@JsonProperty("image")})
    @lombok.Setter(onMethod_ = {@JsonProperty("image")})
    private V2UIElementsImage image;
    @lombok.Getter(onMethod_ = {@JsonProperty("name")})
    @lombok.Setter(onMethod_ = {@JsonProperty("name")})
    private String name;
    @lombok.Getter(onMethod_ = {@JsonProperty("phoneNumbers")})
    @lombok.Setter(onMethod_ = {@JsonProperty("phoneNumbers")})
    private List<PhoneNumber> phoneNumbers;
}
