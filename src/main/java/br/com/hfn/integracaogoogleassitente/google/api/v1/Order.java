package br.com.hfn.integracaogoogleassitente.google.api.v1;

import com.fasterxml.jackson.annotation.*;
import java.util.List;
import java.util.Map;

/**
 * Order entity. Note: 1. All strings at all levels must be less than 1000 chars unless
 * otherwise specified. 2. All repeated fields at all levels must be less than 50 in count
 * unless otherwise specified. 3. All timestamps at all levels, if specified, must be valid
 * timestamps.
 */
@lombok.Data
public class Order {
    @lombok.Getter(onMethod_ = {@JsonProperty("buyerInfo")})
    @lombok.Setter(onMethod_ = {@JsonProperty("buyerInfo")})
    private UserInfo buyerInfo;
    @lombok.Getter(onMethod_ = {@JsonProperty("contents")})
    @lombok.Setter(onMethod_ = {@JsonProperty("contents")})
    private Contents contents;
    @lombok.Getter(onMethod_ = {@JsonProperty("createTime")})
    @lombok.Setter(onMethod_ = {@JsonProperty("createTime")})
    private String createTime;
    @lombok.Getter(onMethod_ = {@JsonProperty("disclosures")})
    @lombok.Setter(onMethod_ = {@JsonProperty("disclosures")})
    private List<Disclosure> disclosures;
    @lombok.Getter(onMethod_ = {@JsonProperty("followUpActions")})
    @lombok.Setter(onMethod_ = {@JsonProperty("followUpActions")})
    private List<Action> followUpActions;
    @lombok.Getter(onMethod_ = {@JsonProperty("googleOrderId")})
    @lombok.Setter(onMethod_ = {@JsonProperty("googleOrderId")})
    private String googleOrderID;
    @lombok.Getter(onMethod_ = {@JsonProperty("image")})
    @lombok.Setter(onMethod_ = {@JsonProperty("image")})
    private V2UIElementsImage image;
    @lombok.Getter(onMethod_ = {@JsonProperty("lastUpdateTime")})
    @lombok.Setter(onMethod_ = {@JsonProperty("lastUpdateTime")})
    private String lastUpdateTime;
    @lombok.Getter(onMethod_ = {@JsonProperty("merchantOrderId")})
    @lombok.Setter(onMethod_ = {@JsonProperty("merchantOrderId")})
    private String merchantOrderID;
    @lombok.Getter(onMethod_ = {@JsonProperty("note")})
    @lombok.Setter(onMethod_ = {@JsonProperty("note")})
    private String note;
    @lombok.Getter(onMethod_ = {@JsonProperty("paymentData")})
    @lombok.Setter(onMethod_ = {@JsonProperty("paymentData")})
    private PaymentData paymentData;
    @lombok.Getter(onMethod_ = {@JsonProperty("priceAttributes")})
    @lombok.Setter(onMethod_ = {@JsonProperty("priceAttributes")})
    private List<PriceAttribute> priceAttributes;
    @lombok.Getter(onMethod_ = {@JsonProperty("promotions")})
    @lombok.Setter(onMethod_ = {@JsonProperty("promotions")})
    private List<Promotion> promotions;
    @lombok.Getter(onMethod_ = {@JsonProperty("purchase")})
    @lombok.Setter(onMethod_ = {@JsonProperty("purchase")})
    private PurchasePurchaseOrderExtension purchase;
    @lombok.Getter(onMethod_ = {@JsonProperty("termsOfServiceUrl")})
    @lombok.Setter(onMethod_ = {@JsonProperty("termsOfServiceUrl")})
    private String termsOfServiceURL;
    @lombok.Getter(onMethod_ = {@JsonProperty("ticket")})
    @lombok.Setter(onMethod_ = {@JsonProperty("ticket")})
    private TicketTicketOrderExtension ticket;
    @lombok.Getter(onMethod_ = {@JsonProperty("transactionMerchant")})
    @lombok.Setter(onMethod_ = {@JsonProperty("transactionMerchant")})
    private Merchant transactionMerchant;
    @lombok.Getter(onMethod_ = {@JsonProperty("userVisibleOrderId")})
    @lombok.Setter(onMethod_ = {@JsonProperty("userVisibleOrderId")})
    private String userVisibleOrderID;
    @lombok.Getter(onMethod_ = {@JsonProperty("userVisibleStateLabel")})
    @lombok.Setter(onMethod_ = {@JsonProperty("userVisibleStateLabel")})
    private String userVisibleStateLabel;
    @lombok.Getter(onMethod_ = {@JsonProperty("vertical")})
    @lombok.Setter(onMethod_ = {@JsonProperty("vertical")})
    private Map<String, Object> vertical;
}
