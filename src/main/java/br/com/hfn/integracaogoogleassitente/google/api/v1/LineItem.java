package br.com.hfn.integracaogoogleassitente.google.api.v1;

import com.fasterxml.jackson.annotation.*;
import java.util.List;
import java.util.Map;

/**
 * One line item contains one vertical. An order or cart can have multiple line items of
 * same vertical. Sub-line items/add-ons etc should be defined in vertical protos depending
 * on their use cases. Note: 1. All strings at all levels must be less than 1000 chars
 * unless otherwise specified. 2. All repeated fields at all levels must be less than 50 in
 * count unless otherwise specified. 3. All timestamps at all levels, if specified, must be
 * valid timestamps.
 */
@lombok.Data
public class LineItem {
    @lombok.Getter(onMethod_ = {@JsonProperty("description")})
    @lombok.Setter(onMethod_ = {@JsonProperty("description")})
    private String description;
    @lombok.Getter(onMethod_ = {@JsonProperty("disclosures")})
    @lombok.Setter(onMethod_ = {@JsonProperty("disclosures")})
    private List<Disclosure> disclosures;
    @lombok.Getter(onMethod_ = {@JsonProperty("followUpActions")})
    @lombok.Setter(onMethod_ = {@JsonProperty("followUpActions")})
    private List<Action> followUpActions;
    @lombok.Getter(onMethod_ = {@JsonProperty("id")})
    @lombok.Setter(onMethod_ = {@JsonProperty("id")})
    private String id;
    @lombok.Getter(onMethod_ = {@JsonProperty("image")})
    @lombok.Setter(onMethod_ = {@JsonProperty("image")})
    private V2UIElementsImage image;
    @lombok.Getter(onMethod_ = {@JsonProperty("name")})
    @lombok.Setter(onMethod_ = {@JsonProperty("name")})
    private String name;
    @lombok.Getter(onMethod_ = {@JsonProperty("notes")})
    @lombok.Setter(onMethod_ = {@JsonProperty("notes")})
    private List<String> notes;
    @lombok.Getter(onMethod_ = {@JsonProperty("priceAttributes")})
    @lombok.Setter(onMethod_ = {@JsonProperty("priceAttributes")})
    private List<PriceAttribute> priceAttributes;
    @lombok.Getter(onMethod_ = {@JsonProperty("provider")})
    @lombok.Setter(onMethod_ = {@JsonProperty("provider")})
    private Merchant provider;
    @lombok.Getter(onMethod_ = {@JsonProperty("purchase")})
    @lombok.Setter(onMethod_ = {@JsonProperty("purchase")})
    private PurchasePurchaseItemExtension purchase;
    @lombok.Getter(onMethod_ = {@JsonProperty("recipients")})
    @lombok.Setter(onMethod_ = {@JsonProperty("recipients")})
    private List<UserInfo> recipients;
    @lombok.Getter(onMethod_ = {@JsonProperty("reservation")})
    @lombok.Setter(onMethod_ = {@JsonProperty("reservation")})
    private ReservationReservationItemExtension reservation;
    @lombok.Getter(onMethod_ = {@JsonProperty("userVisibleStateLabel")})
    @lombok.Setter(onMethod_ = {@JsonProperty("userVisibleStateLabel")})
    private String userVisibleStateLabel;
    @lombok.Getter(onMethod_ = {@JsonProperty("vertical")})
    @lombok.Setter(onMethod_ = {@JsonProperty("vertical")})
    private Map<String, Object> vertical;
}
