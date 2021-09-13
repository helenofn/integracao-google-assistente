package br.com.hfn.integracaogoogleassitente.google.api.v1;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

/**
 * Represents add-ons or sub-items.
 */
@lombok.Data
public class PurchaseItemOption {
    @lombok.Getter(onMethod_ = {@JsonProperty("id")})
    @lombok.Setter(onMethod_ = {@JsonProperty("id")})
    private String id;
    @lombok.Getter(onMethod_ = {@JsonProperty("name")})
    @lombok.Setter(onMethod_ = {@JsonProperty("name")})
    private String name;
    @lombok.Getter(onMethod_ = {@JsonProperty("note")})
    @lombok.Setter(onMethod_ = {@JsonProperty("note")})
    private String note;
    @lombok.Getter(onMethod_ = {@JsonProperty("prices")})
    @lombok.Setter(onMethod_ = {@JsonProperty("prices")})
    private List<PriceAttribute> prices;
    @lombok.Getter(onMethod_ = {@JsonProperty("productId")})
    @lombok.Setter(onMethod_ = {@JsonProperty("productId")})
    private String productID;
    @lombok.Getter(onMethod_ = {@JsonProperty("quantity")})
    @lombok.Setter(onMethod_ = {@JsonProperty("quantity")})
    private Long quantity;
    @lombok.Getter(onMethod_ = {@JsonProperty("subOptions")})
    @lombok.Setter(onMethod_ = {@JsonProperty("subOptions")})
    private List<PurchaseItemOption> subOptions;
}
